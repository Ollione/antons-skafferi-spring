// APIController.java
package se.antons_skafferi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.antons_skafferi.dataClass.Bookings;
import se.antons_skafferi.dataClass.Orders;
import se.antons_skafferi.dataClass.Person;
import se.antons_skafferi.service.DatabaseService;
import se.antons_skafferi.repository.PersonRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class APIController {

    // debuglogging
    private static final Logger logger = LoggerFactory.getLogger(APIController.class);

    @Autowired
    private DatabaseService databaseService;

    @Autowired
    private PersonRepository personRepository;

    /**
     * Get menu items
     * @param type Type of menu items to get
     * @return List of menu items
     */
    @GetMapping(path="/menu/{type}")
    public List<?> getMenuItems(@PathVariable String type) {
        return switch (type.toLowerCase()) {
            case "all" -> databaseService.getMenuItems();
            case "lunch" -> databaseService.getLunchMenuItems();
            case "dinner" -> databaseService.getDinnerMenuItems();
            default -> throw new IllegalArgumentException("Invalid menu type: " + type);
        };
    }

    /**
     * Get bookings
     * @param type Type of bookings to get
     * @return List of bookings
     */
    @GetMapping(path="/calendar/bookings/{type}")
    public List<?> getBookings(@PathVariable String type) {
        return switch (type.toLowerCase()) {
            case "all" -> databaseService.getBookings();
            default -> throw new IllegalArgumentException("Invalid booking type: " + type);
        };
    }

    /**
     * Add a booking
     * @param booking Booking to add, two states, one with existing person and one with new person
     * @return Added booking
     */
    @PostMapping(path="/calendar/bookings")
    public Bookings addBooking(@RequestBody Bookings booking) {
        if (booking.getPerson() == null) {
            throw new IllegalArgumentException("Person information is missing");
        }
        Person person = booking.getPerson();
        // print info for debugging
        logger.debug("Person: " + person);
        if (person.getPerson_id() == null) {
            person = databaseService.addPerson(person);
        } else {
            person = personRepository.findById(person.getPerson_id())
                    .orElseThrow(() -> new IllegalArgumentException("Invalid person ID"));
        }
        booking.setPerson(person);
        return databaseService.addBooking(booking);
    }


    // APIController.java
    @PostMapping(path="/calendar/bookings/{id}/status")
    public Bookings updateBookingStatus(@PathVariable Integer id, @RequestBody String status) {
        return databaseService.updateBookingStatus(id, status);
    }

    /**
     * Add an order to the database
     * @param order Order to add
     * @return Added order
     */
    @PostMapping(path="/orders")
    public Orders addOrder(@RequestBody Orders order) {
        return databaseService.addOrder(order);
    }



}