package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void saveUser(User user);


}
