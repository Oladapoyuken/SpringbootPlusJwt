package yuken.automation.springjwtnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import yuken.automation.springjwtnew.models.User;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
