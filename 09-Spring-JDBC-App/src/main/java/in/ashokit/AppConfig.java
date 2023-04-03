package in.ashokit;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.repository.UserDao;

@Configuration
@ComponentScan
public class AppConfig {


    @Bean
    public DataSource dataSource() {
        return 
    }

    @Bean
    public UserDao customerDao(DataSource dataSource) {
        return new UserDao(dataSource);
    }
}
