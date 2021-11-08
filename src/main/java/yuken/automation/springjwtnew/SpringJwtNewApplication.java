package yuken.automation.springjwtnew;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import yuken.automation.springjwtnew.models.Role;
import yuken.automation.springjwtnew.models.User;
import yuken.automation.springjwtnew.services.UserService;

import java.util.ArrayList;

@SpringBootApplication
public class SpringJwtNewApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringJwtNewApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveUser(new User(null, "Yusuf", "yuken", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Semiyat", "biodun", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Fatimah", "fatih", "1234", new ArrayList<>()));

            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.addRoleToUser("yuken", "ROLE_ADMIN");
            userService.addRoleToUser("yuken", "ROLE_USER");
            userService.addRoleToUser("biodun", "ROLE_ADMIN");
            userService.addRoleToUser("fatih", "ROLE_USER");

        };
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
