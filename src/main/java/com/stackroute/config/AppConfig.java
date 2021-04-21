package com.stackroute.config;

import com.stackroute.domain.Dish;
import com.stackroute.domain.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Dish dish() {
        return new Dish();
    }

    @Bean
    public Menu menu() {
        return new Menu();
    }
}
