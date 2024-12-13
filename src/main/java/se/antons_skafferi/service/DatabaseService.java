// DatabaseService.java
package se.antons_skafferi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.antons_skafferi.dataClass.*;
import se.antons_skafferi.repository.BookingRepository;
import se.antons_skafferi.repository.FoodRepository;
import se.antons_skafferi.repository.OrderRepository;
import se.antons_skafferi.repository.PersonRepository;

import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private PersonRepository personRepository;

    /**
     * Get all menu items
     * @return List of all menu items
     */
    public List<Food> getMenuItems() {
        return (List<Food>) foodRepository.findAll();
    }

    public List<DailyLunch> getLunchMenuItems() {
        return foodRepository.findLunch();
    }

    public List<DinnerMenuItem> getDinnerMenuItems() {
        return foodRepository.findDinnerMenuItems();
    }

    public List<Bookings> getBookings() {
        return bookingRepository.findAll();
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

    // DatabaseService.java
    public Bookings updateBookingStatus(Integer id, String status) {
        Bookings booking = bookingRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid booking ID"));
        booking.setStatus(status);
        return bookingRepository.save(booking);
    }

    public Orders addOrder(Orders order) {
        orderRepository.save(order);
        return order;
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }
}