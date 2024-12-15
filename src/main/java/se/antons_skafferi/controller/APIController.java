// APIController.java
package se.antons_skafferi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.antons_skafferi.dataClass.*;
import se.antons_skafferi.service.DatabaseService;
import se.antons_skafferi.repository.PersonRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;
import java.util.List;
import java.util.logging.Logger;
import java.sql.Timestamp;

@RestController
@RequestMapping(path="/api")
public class APIController {

    Logger logger = Logger.getLogger(APIController.class.getName());

    @Autowired
    private DatabaseService databaseService;

    @Autowired
    private PersonRepository personRepository;



    // Lunch items
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





    // Dinner items
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
                type = "Varmrätt";
                break;
            case "vegetarisk":
                type = "Vegetarisk";
                break;
            case "efterratt":
                type = "Efterrätt";
                break;
            default:
                throw new IllegalArgumentException("Invalid dinner type: " + type);
        }
//        logger.log(java.util.logging.Level.INFO, "Type: " + type);
//        List<Dinner> dinnerItems = ;
//        logger.log(java.util.logging.Level.INFO, "Dinner items: " + dinnerItems);
        return databaseService.getDinnerItemsByType(type);
    }





// Bookings
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




    @PostMapping(path="/calendar/bookings")
    public Bookings addBooking(@RequestBody Bookings booking) {
        if (booking.getPerson() == null) {
            throw new IllegalArgumentException("Person information is missing");
        }
        if (booking.getPerson().getPerson_id() == null) {
            throw new IllegalArgumentException("Person ID is missing");
        }
        Person person = personRepository.findById(booking.getPerson().getPerson_id())
                .orElseThrow(() -> new IllegalArgumentException("Invalid person ID"));
        booking.setPerson(person);
        return databaseService.addBooking(booking);
    }


    @PostMapping(path="/calendar/bookings/{id}/status")
    public Bookings updateBookingStatus(@PathVariable Integer id, @RequestBody Bookings.Status status) {
        return databaseService.updateBookingStatus(id, status);
    }





    // Events
    @GetMapping(path="/events/all")
    public List<Events> getAllEvents() {
        return databaseService.getAllEvents();
    }
    @GetMapping("/events/week/{week}/year/{year}")
    public List<Events> getEventsByWeekAndYear(@PathVariable int week, @PathVariable int year) {
        return databaseService.getEventsByWeekAndYear(week, year);
    }

    // Get events by date
    @GetMapping("/events/date/{date}")
    public List<Events> getEventsByDate(@PathVariable Date date) {
        return databaseService.getEventsByDate(date);
    }






    // Orders
    // GET
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

    // POST

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






    // Tab
    @GetMapping(path="/tab/all")
    public List<Tab> getAllTabs() {
        return databaseService.getAllTabs();
    }

    @GetMapping(path="/tab/id/{id}")
    public Tab getTabById(@PathVariable Integer id) {
        return databaseService.getTabById(id);
    }

    // APIController.java
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




    // Drinks
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



    // Tables

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



    // Employees

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

    // Roles

    @GetMapping(path="/roles/all")
    public List<Role> getAllRoles() {
        return databaseService.getAllRoles();
    }

    @GetMapping(path="/roles/id/{id}")
    public Role getRoleById(@PathVariable int id) {
        return databaseService.getRoleById(id);
    }
}