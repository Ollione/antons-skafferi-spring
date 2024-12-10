package se.antons_skafferi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.antons_skafferi.dataClass.Bookings;
import se.antons_skafferi.dataClass.DailyLunch;
import se.antons_skafferi.dataClass.DinnerMenuItem;
import se.antons_skafferi.dataClass.Food;
import se.antons_skafferi.repository.FoodRepository;

import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private se.antons_skafferi.repository.BookingRepository BookingRepository;

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