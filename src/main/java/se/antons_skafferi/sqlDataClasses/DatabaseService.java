package se.antons_skafferi.sqlDataClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private BookingRepository BookingRepository;

    /**
     * Get all menu items
     * @return List of all menu items
     */
    public List<Food> getMenuItems() {
        return (List<Food>) foodRepository.findAll();
    }

    public List<DailyLunch> getLunchMenuItems() {

//        return foodRepository.findLunch(new Date(2023, 2,1), new Date(2023,3,1));
        return foodRepository.findLunch();
    }

    public List<DinnerMenuItem> getDinnerMenuItems() {
        return foodRepository.findDinnerMenuItems();
    }

    public List<Bookings> getBookings() {
        return BookingRepository.findAll();
    }

}