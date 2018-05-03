package beans;

import model.Helper;
import model.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.UserService;
import service.impl.UserServiceImpl;

@Configuration
public class HelperBean {
@Bean
    public Helper getHelper(){
        final Helper helper = new Helper();
        helper.setName("Helper");
        helper.setRole(getRole());
        return helper;
    }
@Bean
    public Role getRole(){
        final Role role = new Role();
        role.setName("Role");
        return role;
    }

    @Bean
    public UserService get(){
    return new UserServiceImpl();
    }
}
