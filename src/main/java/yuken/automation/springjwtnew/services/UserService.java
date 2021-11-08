package yuken.automation.springjwtnew.services;

import yuken.automation.springjwtnew.models.Role;
import yuken.automation.springjwtnew.models.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
