package se.antons_skafferi.sqlDataClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private FoodRepository foodRepository;

    /**
     * Get all menu items
     * @return List of all menu items
     */
    public List<Food> getMenuItems() {
        return (List<Food>) foodRepository.findAll();
    }
}