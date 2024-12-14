// DatabaseService.java
package se.antons_skafferi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.antons_skafferi.dataClass.*;
import se.antons_skafferi.repository.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private LunchRepository lunchRepository;
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private DinnerRepository dinnerRepository;
    @Autowired
    private EventsRepository eventsRepository;
    @Autowired
    private TabRepository tabRepository;
    @Autowired
    private DrinksRepository drinksRepository;
    @Autowired
    private TablesRepository tablesRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private RoleRepository roleRepository;
    /**
     * Get all menu items
     * @return List of all menu items
     */
//    public List<Food> getMenuItems() {
//        return (List<Food>) foodRepository.findAll();
//    }

//    public List<Items> getLunchMenuItems() {
//        return LunchRepository.findAll();
//    }


//    public List<String> getItemNamesByLunchDate(java.sql.Date date) {
//        return lunchRepository.findItemNamesByLunchDate(date);
//    }

    // LUNCH RELATED METHODS------------------------------------------
    public List<Lunch> getAllLunchItems() {
        return lunchRepository.findAllWithItems();
    }

    public List<Lunch> getLunchItemsByDate(Date date) {
        return lunchRepository.findByDate(date);
    }

    public List<Lunch> getLunchItemsByWeekAndYear(int week, int year) {
        return lunchRepository.findByWeekAndYear(week, year);
    }

    // END OF LUNCH RELATED METHODS -----------------------------------

    // DINNER RELATED METHODS------------------------------------------
    public List<Dinner> getAllDinnerItems() {
        return dinnerRepository.findAll();
    }
    public List<Dinner> getDinnerItemsByType(String type) {
        return dinnerRepository.findByType(type);
    }







//    public List<DinnerMenuItem> getDinnerMenuItems() {
//        return foodRepository.findDinnerMenuItems();
//    }

    public List<Bookings> getBookings() {
        return bookingRepository.findAll();
    }

    public List<Bookings> getBookingsByDate(Date date) {
        return bookingRepository.findByDate(date);
    }
    public List<Bookings> getBookingsByWeekAndYear(int week, int year) {
        return bookingRepository.findByWeekAndYear(week, year);
    }


    public List<Bookings> getAddBookings() {
        // Implement the logic to get added bookings
        // For now, returning all bookings as a placeholder
        return bookingRepository.findAll();
    }

    public void setBookingRepository(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    // DatabaseService.java
    public Bookings addBooking(Bookings booking) {
        bookingRepository.save(booking);
        return booking;
    }

    public Bookings updateBookingStatus(Integer id, Bookings.Status status) {
        Bookings booking = bookingRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid booking ID"));
        booking.setStatus(status);
        return bookingRepository.save(booking);
    }



    // events

    public List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }

    public List<Events> getEventsByWeekAndYear(int week, int year) {
        return eventsRepository.findByWeekAndYear(week, year);
    }

    // Get events by date
    public List<Events> getEventsByDate(Date date) {
        return eventsRepository.findByDate(date);
    }



    public Orders addOrder(Orders order) {
        orderRepository.save(order);
        return order;
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }


    // Orders
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Orders getOrdersById(Integer id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid order ID"));
    }

    public List<Orders> getOrdersByDate(Date date) {
        return orderRepository.findByDate(date);
    }

    public List<Orders> getOrdersByStatus(Orders.Status status) {
        return orderRepository.findByStatus(status);
    }

    // Tabs
    public List<Tab> getAllTabs() {
        return tabRepository.findAll();
    }

    public Tab getTabById(Integer id) {
        return tabRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid tab ID"));
    }

    public List<Tab> getTabByDate(Timestamp date) {
        return tabRepository.findByOpened_at(date);
    }

    public List<Tab> getTabByStatus(Tab.Status status) {
        return tabRepository.findByStatus(status);
    }

    public List<Tab> getTabByTable(Integer table) {
        return tabRepository.findByTable_number(table);
    }




    // Drinks
    public List<Drinks> getAllDrinks() {
        return drinksRepository.findAll();
    }

    public Drinks getDrinkById(int id) {
        return drinksRepository.findById(id);
    }

    public List<Drinks> getDrinksByType(String type) {
        return drinksRepository.findByType(type);
    }



    // Tables

    public List<Tables> getAllTables() {
        return tablesRepository.findAll();
    }

    public Tables getTableById(int id) {
        return tablesRepository.findById(id);
    }

    public List<Tables> getTablesByNumberOfSeats(int room_for_people) {
        return tablesRepository.findByRoom_for_people(room_for_people);
    }



    // Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }

    public String getEmployeePasswordByEmail(String email) {
        return employeeRepository.findPasswordByEmail(email);
    }

    public List<Role> getHierarchyByEmployeeId(int employee_id) {
        return employeeRepository.findHierarchyByEmployeeId(employee_id);
    }

    // Roles
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(int id) {
        return roleRepository.findById(id);
    }
}