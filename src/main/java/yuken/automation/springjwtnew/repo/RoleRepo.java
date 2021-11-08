package yuken.automation.springjwtnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import yuken.automation.springjwtnew.models.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
