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






}