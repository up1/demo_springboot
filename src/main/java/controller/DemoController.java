package controller;

import model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/user/all")
    public List<User> listUser() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "User1"));
        users.add(new User(2, "User2"));

        return users;
    }

}
