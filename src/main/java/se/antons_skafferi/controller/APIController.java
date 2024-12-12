// APIController.java
package se.antons_skafferi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.antons_skafferi.dataClass.Bookings;
import se.antons_skafferi.dataClass.Person;
import se.antons_skafferi.service.DatabaseService;
import se.antons_skafferi.repository.PersonRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class APIController {

    @Autowired
    private DatabaseService databaseService;

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path="/menu/{type}")
    public List<?> getMenuItems(@PathVariable String type) {
        return switch (type.toLowerCase()) {
            case "all" -> databaseService.getMenuItems();
            case "lunch" -> databaseService.getLunchMenuItems();
            case "dinner" -> databaseService.getDinnerMenuItems();
            default -> throw new IllegalArgumentException("Invalid menu type: " + type);
        };
    }

    @GetMapping(path="/calendar/bookings/{type}")
    public List<?> getBookings(@PathVariable String type) {
        return switch (type.toLowerCase()) {
            case "all" -> databaseService.getBookings();
            default -> throw new IllegalArgumentException("Invalid booking type: " + type);
        };
    }

    // APIController.java
// APIController.java
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


    // APIController.java
    @PostMapping(path="/calendar/bookings/{id}/status")
    public Bookings updateBookingStatus(@PathVariable Integer id, @RequestBody String status) {
        return databaseService.updateBookingStatus(id, status);
    }



}