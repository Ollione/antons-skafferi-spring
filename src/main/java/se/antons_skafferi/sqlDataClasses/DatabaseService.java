package se.antons_skafferi.sqlDataClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DatabaseService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getMenuItems() {
        String sql = "SELECT * FROM food";
        return jdbcTemplate.queryForList(sql);
    }
}