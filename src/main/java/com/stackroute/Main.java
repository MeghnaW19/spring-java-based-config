package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Dish;
import com.stackroute.domain.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Dish dish = context.getBean(Dish.class);
//        dish.setName("Indian");
//        System.out.println(dish.getName());


        Menu menu = context.getBean("menu", Menu.class);
        Dish dishObj=new Dish(3, "Italian");
        menu.displayDishName(dishObj);
    }
}
