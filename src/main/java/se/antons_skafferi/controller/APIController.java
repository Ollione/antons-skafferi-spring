// APIController.java
package se.antons_skafferi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import se.antons_skafferi.dataClass.*;
import se.antons_skafferi.service.DatabaseService;
import se.antons_skafferi.repository.PersonRepository;

import java.sql.Date;
import java.util.List;
import java.util.logging.Logger;
import java.sql.Timestamp;

/**
 * <h1>APIController</h1>
 * <p>
 * This class is the controller for the API. It handles all the requests and responses for the API.
 * It is responsible for the communication between the frontend and the backend.
 * </p>
 * <p>
 * The {@code APIController} class provides endpoints for managing {@code Bookings}, {@code Dinner}, {@code DrinkOrder}, {@code Drinks},
 * {@code Employee}, {@code Events}, {@code FoodOrder}, {@code Items}, {@code Lunch}, {@code LunchItems}, {@code Orders}, {@code Person}, {@code Role}, {@code Shift}, {@code Tab},
 * {@code Tables} and {@code WorksShift}.
 * </p>
 * <p>
 * Each endpoint is mapped to a specific URL path and HTTP method.
 * </p>
 * <p>
 * The class uses the {@link DatabaseService} to perform CRUD operations on the database.
 * </p>
 * @see DatabaseService
 *
 * @version 1.0
 * @since 2025-01-12
 */
@RestController
@RequestMapping(path="/api")
public class APIController {

    Logger logger = Logger.getLogger(APIController.class.getName());

    // The DatabaseService is used to perform CRUD operations on the database
    @Autowired
    private DatabaseService databaseService;


    // ##############################################################################################################
    // ##################### PERSONS ################################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    /**
     * This method returns all {@code Person}s in the database.
     * @return {@code List<Person>} – A list of all persons in the database
     */
    @GetMapping(path="/persons/all")
    public List<Person> getAllPersons() {
        return databaseService.getAllPersons();
    }

    /**
     * This method returns a {@code Person} by their {@code ID}.
     * @param email The Email of the person
     * @return {@code Person} – The person with the specified ID
     */
    @GetMapping(path="/persons/email/{email}")
    public Person getPersonByEmail(@PathVariable String email) {
        return databaseService.getPersonByEmail(email);
    }

    /**
     * This method returns a {@code Person} by their {@code phone_number}.
     * @param phoneNumber The phone number of the person
     * @return {@code Person} – The person with the specified phone number
     */
    @GetMapping(path="/persons/phone/{phoneNumber}")
    public Person getPersonByPhoneNumber(@PathVariable String phoneNumber) {
        return databaseService.getPersonByPhoneNumber(phoneNumber);
    }

    // POST ---------------------------------------------------------------------------------------------------------
    /**
     * This method creates a new {@code Person} in the database.
     * @param person The person to be created
     * @return {@code Person} – The person that was created
     */
    @PostMapping(path="/persons")
    public Person createPerson(@RequestBody Person person) {
        return databaseService.addPerson(person);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    /**
     * This method deletes a {@code Person} from the database.
     * @param personId The ID of the person to be deleted
     */
    @DeleteMapping(path="/persons/{personId}/delete")
    public void deletePerson(@PathVariable int personId) {
        databaseService.deletePerson(personId);
    }


    // ##############################################################################################################
    // ##################### ITEMS ##################################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    /**
     * This method returns all items in the database.
     * @return {@code List<Items>} – A list of all items in the database
     */
    @GetMapping(path="/items/all")
    public List<Items> getAllItems() {
        return databaseService.getAllItems();
    }

    // POST ---------------------------------------------------------------------------------------------------------
    /**
     * This method creates a new item in the database.
     * @param item The item to be created
     * @return {@code Items} The item that was created
     */
    @PostMapping(path="/items")
    public Items addItem(@RequestBody Items item) {
        return databaseService.addItem(item);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    /**
     * This method deletes an item from the database.
     * @param itemId The ID of the item to be deleted
     */
    @DeleteMapping(path="/items/{itemId}/delete")
    public void deleteItem(@PathVariable int itemId) {
        databaseService.deleteItem(itemId);
    }


    // ##############################################################################################################
    // ##################### LUNCH ITEMS ############################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/menu/lunch/all")
    public List<Lunch> getAllLunchItems() {
        return databaseService.getAllLunchItems();
    }

    @GetMapping(path="/menu/lunch/date/{date}")
    public List<Lunch> getLunchItemsByDate(@PathVariable Date date) {
        return databaseService.getLunchItemsByDate(date);
    }

    @GetMapping(path="/menu/lunch/week/{week}/year/{year}")
    public List<Lunch> getLunchItemsByWeekAndYear(@PathVariable int week, @PathVariable int year) {
        return databaseService.getLunchItemsByWeekAndYear(week, year);
    }

    // POST ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/menu/lunch")
    public Lunch addLunchItem(@RequestBody Lunch lunch) {
        return databaseService.addLunchItem(lunch);
    }

    @PostMapping(path="/menu/lunch/{lunchId}/items")
    public Lunch addItemsToLunch(@PathVariable Integer lunchId, @RequestBody List<Integer> itemIds) {
        return databaseService.addItemsToLunch(lunchId, itemIds);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/menu/lunch/{lunchId}/delete")
    public void deleteLunchItem(@PathVariable int lunchId) {
        databaseService.deleteLunchItem(lunchId);
    }


    // ##############################################################################################################
    // ##################### DINNER ITEMS ###########################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/menu/dinner/all")
    public List<Dinner> getAllDinnerItems() {
        return databaseService.getAllDinnerItems();
    }

    @GetMapping(path="/menu/dinner/type/{type}")
    public List<Dinner> getDinnerItemsByType(@PathVariable String type) {
        switch (type.toLowerCase()) {
            case "forratt":
                type = "Förrätt";
                break;
            case "varmratt":
                type = "Varmrätt";  // I KNOW THIS IS CURSED BUT WE ARE IN TIME CRUNCH AND ITS IMPLEMETED LIKE THIS
                break;              // IN THE FRONTEND ALREADY
            case "vegetarisk":
                type = "Vegetarisk";
                break;
            case "efterratt":
                type = "Efterrätt";
                break;
            default:
                throw new IllegalArgumentException("Invalid dinner type: " + type);
        }
        return databaseService.getDinnerItemsByType(type);
    }

    // POST ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/menu/dinner")
    public Dinner addDinnerItem(@RequestBody Dinner dinner) {
        return databaseService.addDinnerItem(dinner);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/menu/dinner/{dinnerId}/delete")
    public void deleteDinnerItem(@PathVariable int dinnerId) {
        databaseService.deleteDinnerItem(dinnerId);
    }


    // ##############################################################################################################
    // ##################### BOOKINGS ###############################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/calendar/bookings/{type}")
    public List<?> getBookings(@PathVariable String type) {
        return switch (type.toLowerCase()) {
            case "all" -> databaseService.getBookings();
            default -> throw new IllegalArgumentException("Invalid booking type: " + type);
        };
    }

    @GetMapping(path="/calendar/bookings/date/{date}")
    public List<Bookings> getBookingsByDate(@PathVariable Date date) {
        return databaseService.getBookingsByDate(date);
    }

    @GetMapping(path="/calendar/bookings/week/{week}/year/{year}")
    public List<Bookings> getBookingsByWeekAndYear(@PathVariable int week, @PathVariable int year) {
        return databaseService.getBookingsByWeekAndYear(week, year);
    }

    @GetMapping(path="/bookings/confirmed/table/{tableId}/datetime/{dateTime}")
    public ResponseEntity<?> getConfirmedBookingsByTableIdAndDateTime(@PathVariable Integer tableId, @PathVariable String dateTime) {
        try {
            Timestamp timestamp = Timestamp.valueOf(dateTime);
            List<Bookings> bookings = databaseService.getConfirmedBookingsByTableIdAndDateTime(tableId, timestamp);
            return ResponseEntity.ok(bookings);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping(path="/bookings/confirmed/{personId}/{date}")
    public ResponseEntity<?> getConfirmedBookingByPersonIdAndDate(@PathVariable Integer personId, @PathVariable String date) {
        try {
            Timestamp timestamp = Timestamp.valueOf(date + " 00:00:00");
            Bookings booking = databaseService.getConfirmedBookingByPersonIdAndDate(personId, timestamp);
            return ResponseEntity.ok(booking);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    // POST ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/calendar/bookings")
    public Bookings addBooking(@RequestBody Bookings booking) {
        return databaseService.addBooking(booking);
    }

    @PostMapping(path="/calendar/bookings/{id}/status")
    public Bookings updateBookingStatus(@PathVariable Integer id, @RequestBody Bookings.Status status) {
        return databaseService.updateBookingStatus(id, status);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/calendar/bookings/{bookingId}/delete")
    public void deleteBooking(@PathVariable int bookingId) {
        databaseService.deleteBooking(bookingId);
    }


    // ##############################################################################################################
    // ##################### EVENTS #################################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/events/all")
    public List<Events> getAllEvents() {
        return databaseService.getAllEvents();
    }

    @GetMapping("/events/week/{week}/year/{year}")
    public List<Events> getEventsByWeekAndYear(@PathVariable int week, @PathVariable int year) {
        return databaseService.getEventsByWeekAndYear(week, year);
    }

    @GetMapping("/events/date/{date}")
    public List<Events> getEventsByDate(@PathVariable Date date) {
        return databaseService.getEventsByDate(date);
    }

    // POST ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/events")
    public Events addEvent(@RequestBody Events event) {
        return databaseService.addEvent(event);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/events/{eventId}/delete")
    public void deleteEvent(@PathVariable int eventId) {
        databaseService.deleteEvent(eventId);
    }


    // ##############################################################################################################
    // ##################### ORDERS #################################################################################
    // ##############################################################################################################

    // GET  ---------------------------------------------------------------------------------------------------------
    @GetMapping(path="/orders/all")
    public List<Orders> getAllOrders() {
        return databaseService.getAllOrders();
    }

    @GetMapping(path="/orders/id/{id}")
    public Orders getOrdersById(@PathVariable Integer id) {
        return databaseService.getOrdersById(id);
    }

    @GetMapping(path="/orders/date/{date}")
    public List<Orders> getOrdersByDate(@PathVariable Date date) {
        return databaseService.getOrdersByDate(date);
    }

    @GetMapping(path="/orders/status/{status}")
    public List<Orders> getOrdersByStatus(@PathVariable Orders.Status status) {
        return databaseService.getOrdersByStatus(status);
    }

    // POST ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/orders")
    public Orders createOrder(@RequestBody Orders order) {
        return databaseService.addOrder(order);
    }

    @PostMapping(path="/orders/{orderId}/menu-item")
    public Orders addMenuItemToOrder(@PathVariable int orderId, @RequestBody Integer dinnerId) {
        return databaseService.addMenuItemToOrder(orderId, dinnerId);
    }

    @PostMapping(path="/orders/{orderId}/drink")
    public Orders addDrinkToOrder(@PathVariable int orderId, @RequestBody Integer drinkId) {
        return databaseService.addDrinkToOrder(orderId, drinkId);
    }

    @PostMapping(path="/orders/{orderId}/status")
    public Orders addStatusToOrder(@PathVariable int orderId, @RequestBody Orders.Status status) {
        return databaseService.updateOrderStatus(orderId, status);
    }

    @PostMapping(path="/orders/{orderId}/note")
    public Orders updateOrderNote(@PathVariable int orderId, @RequestBody String note) {
        return databaseService.updateOrderNote(orderId, note);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/orders/{orderId}/delete")
    public void deleteOrder(@PathVariable int orderId) {
        databaseService.deleteOrder(orderId);
    }

    @DeleteMapping(path="/orders/menu-item/{foodOrderId}/delete")
    public void deleteMenuItemFromOrder(@PathVariable int foodOrderId) {
        databaseService.deleteMenuItemFromOrder(foodOrderId);
    }

    @DeleteMapping(path="/orders/{orderId}/drink/{drinkId}/delete")
    public Orders deleteDrinkFromOrder(@PathVariable int orderId, @PathVariable int drinkId) {
        databaseService.deleteDrinkFromOrder(orderId, drinkId);
        return databaseService.getOrdersById(orderId);
    }


    // ##############################################################################################################
    // ##################### TABS ###################################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/tab/all")
    public List<Tab> getAllTabs() {
        return databaseService.getAllTabs();
    }

    @GetMapping(path="/tab/id/{id}")
    public Tab getTabById(@PathVariable Integer id) {
        return databaseService.getTabById(id);
    }

    @GetMapping(path="/tab/date/{date}")
    public List<Tab> getTabByDate(@PathVariable String date) {
        Timestamp timestamp = Timestamp.valueOf(date + " 00:00:00");
        return databaseService.getTabByDate(timestamp);
    }

    @GetMapping(path="/tab/status/{status}")
    public List<Tab> getTabByStatus(@PathVariable Tab.Status status) {
        return databaseService.getTabByStatus(status);
    }

    @GetMapping(path="/tab/table/{table}")
    public List<Tab> getTabByTable(@PathVariable Integer table) {
        return databaseService.getTabByTable(table);
    }

    // POST ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/tab")
    public Tab createTab(@RequestBody Tab tab) {
        return databaseService.addTab(tab);
    }

    @PostMapping(path="/tab/{tabId}/status")
    public Tab updateTabStatus(@PathVariable int tabId, @RequestBody Tab.Status status) {
        return databaseService.updateTabStatus(tabId, status);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/tab/{tabId}/delete")
    public void deleteTab(@PathVariable int tabId) {
        databaseService.deleteTab(tabId);
    }


    // ##############################################################################################################
    // ##################### DRINKS #################################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/menu/drinks/all")
    public List<Drinks> getAllDrinks() {
        return databaseService.getAllDrinks();
    }

    @GetMapping(path="/menu/drinks/id/{id}")
    public Drinks getDrinkById(@PathVariable int id) {
        return databaseService.getDrinkById(id);
    }

    @GetMapping(path="/menu/drinks/type/{type}")
    public List<Drinks> getDrinksByType(@PathVariable String type) {
        return databaseService.getDrinksByType(type);
    }
    // POST ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/menu/drinks")
    public Drinks addDrink(@RequestBody Drinks drink) {
        return databaseService.addDrink(drink);
    }
    @PostMapping(path="/menu/drinks/{drinkId}/price")
    public Drinks updateDrinkPrice(@PathVariable int drinkId, @RequestBody Integer price) {
        return databaseService.updateDrinkPrice(drinkId, price);
    }

    // DELETE -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/menu/drinks/{drinkId}/delete")
    public void deleteDrink(@PathVariable int drinkId) {
        databaseService.deleteDrink(drinkId);
    }


    // ##############################################################################################################
    // ##################### TABLES #################################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/tables/all")
    public List<Tables> getAllTables() {
        return databaseService.getAllTables();
    }

    @GetMapping(path="/tables/id/{id}")
    public Tables getTableById(@PathVariable int id) {
        return databaseService.getTableById(id);
    }

    @GetMapping(path="/tables/seats/{room_for_people}")
    public List<Tables> getTablesByNumberOfSeats(@PathVariable int room_for_people) {
        return databaseService.getTablesByNumberOfSeats(room_for_people);
    }

    // Post ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/tables")
    public Tables addTable(@RequestBody Tables table) {
        return databaseService.addTable(table);
    }

    // Delete -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/tables/{tableId}/delete")
    public void deleteTable(@PathVariable int tableId) {
        databaseService.deleteTable(tableId);
    }


    // ##############################################################################################################
    // ##################### EMPLOYEES ##############################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @CrossOrigin(origins = "http://localhost:63343")
    @GetMapping(path="/employees/all")
    public List<Employee> getAllEmployees() {
        return databaseService.getAllEmployees();
    }

    @GetMapping(path="/employees/id/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return databaseService.getEmployeeById(id);
    }

    @GetMapping(path="/employees/name/{name}")
    public List<Employee> getEmployeesByName(@PathVariable String name) {
        return databaseService.getEmployeesByName(name);
    }

    @GetMapping(path="/employees/email/{email}/password")
    public String getEmployeePasswordByEmail(@PathVariable String email) {
        return databaseService.getEmployeePasswordByEmail(email);
    }

    @GetMapping(path="/employees/{id}/hierarchy")
    public List<Role> getHierarchyByEmployeeId(@PathVariable int id) {
        return databaseService.getHierarchyByEmployeeId(id);
    }

    // Post ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/employees")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        try {
            Employee createdEmployee = databaseService.addEmployee(employee);
            return ResponseEntity.ok(createdEmployee);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping(path="/employees/{employeeId}/password")
    public Employee changeEmployeePassword(@PathVariable int employeeId, @RequestBody String password) {
        return databaseService.updateEmployeePassword(employeeId, password);
    }

    @PostMapping(path="/employees/{employeeId}/role/{roleId}")
    public Employee changeEmployeeRole(@PathVariable int employeeId, @PathVariable int roleId) {
        return databaseService.changeEmployeeRole(employeeId, roleId);
    }

    // Delete -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/employees/{employeeId}/delete")
    public void deleteEmployee(@PathVariable int employeeId) {
        databaseService.deleteEmployee(employeeId);
    }


    // ##############################################################################################################
    // ##################### ROLES ##################################################################################
    // ##############################################################################################################

    // GET ----------------------------------------------------------------------------------------------------------
    @GetMapping(path="/roles/all")
    public List<Role> getAllRoles() {
        return databaseService.getAllRoles();
    }

    @GetMapping(path="/roles/id/{id}")
    public Role getRoleById(@PathVariable int id) {
        return databaseService.getRoleById(id);
    }

    // Post ---------------------------------------------------------------------------------------------------------
    @PostMapping(path="/roles")
    public Role createRole(@RequestBody Role role) {
        return databaseService.addRole(role);
    }

    @PostMapping(path="/roles/{roleId}/hierarchy")
    public Role changeRoleHierarchy(@PathVariable int roleId, @RequestBody Integer hierarchyLevel) {
        return databaseService.updateRoleHierarchy(roleId, hierarchyLevel);
    }

    // Delete -------------------------------------------------------------------------------------------------------
    @DeleteMapping(path="/roles/{roleId}/delete")
    public void deleteRole(@PathVariable int roleId) {
        databaseService.deleteRole(roleId);
    }
}