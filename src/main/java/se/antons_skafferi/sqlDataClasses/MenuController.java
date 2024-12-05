package se.antons_skafferi.sqlDataClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="/menu")
public class MenuController {

    @Autowired
    private DatabaseService databaseService;

    @GetMapping(path="/all")
    public List<Map<String, Object>> getAllMenuItems() {
        return databaseService.getMenuItems();
    }
}