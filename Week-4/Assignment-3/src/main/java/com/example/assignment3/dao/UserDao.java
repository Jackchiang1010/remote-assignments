package com.example.assignment3.dao;

import com.example.assignment3.UserRowMapper;
import com.example.assignment3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @ResponseBody
    public User getUserByEmail(@RequestBody String email) {
        String sql = "SELECT * From user WHERE email = :userEmail";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userEmail", email);

        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());

        if (userList.size() > 0) {

            return userList.get(0);

        } else {

            return null;

        }
    }

    @ResponseBody
    public User getUserByPassword(@RequestBody String password) {
        String sql = "SELECT * From user WHERE password = :userPassword";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userPassword", password);

        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());

        if (userList.size() > 0) {

            return userList.get(0);

        } else {

            return null;

        }
    }

    @ResponseBody
    public User getUserByEmailAndPassword(@RequestBody String email, @RequestBody String password) {
        String sql = "SELECT * From user WHERE email = :userEmail AND password = :userPassword";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userEmail", email);
        map.put("userPassword", password);

        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());

        if (userList.size() > 0) {

            return userList.get(0);

        } else {

            return null;

        }
    }

    @ResponseBody
    public Integer createUser(@RequestBody User user) {
        String sql = "INSERT INTO user(email, password) VALUES (:userEmail, :userPassword)";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userEmail", user.getEmail());
        map.put("userPassword", user.getPassword());

        KeyHolder keyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int userId = keyHolder.getKey().intValue();

        return userId;
    }
}
