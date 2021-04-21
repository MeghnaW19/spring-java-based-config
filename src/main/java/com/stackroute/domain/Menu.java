package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class Menu {
    @Autowired
    private List<Dish> dish;

    public Menu() {
    }

    public Menu(List<Dish> dish) {
        this.dish = dish;
    }

    public void displayDishName(Dish dishObj) {
        dish.add(dishObj);
        System.out.println(dishObj);
    }

    public List<Dish> getDish() {
        return dish;
    }

    public void setDish(List<Dish> dish) {
        this.dish = dish;
    }
}
