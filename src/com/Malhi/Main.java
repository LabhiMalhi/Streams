package com.Malhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Butter Chicken", 450,
                Arrays.asList("Butter","Chicken","Suger"),DishType.NON_VEG ));
        dishes.add(new Dish("Kheer",500,
                Arrays.asList("Rice","Milk","Sugar"),DishType.VEG ) );
        dishes.add(new Dish("Bhature",700,
                Arrays.asList("Flour","Beans","Spices"),DishType.VEG ) );
        dishes.add(new Dish("Kadhi",300,
                Arrays.asList("Butter","Water","Oil"),DishType.VEG ) );

        dishes.stream().filter(g -> g.getCalories() < 500).filter(d-> d.getDishType()==DishType.NON_VEG).
                map(d->{d.setRating(5); return d;}).
                distinct().collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("--------||||---------");

        dishes.stream().filter(g -> g.getCalories() < 500).filter(d-> d.getDishType()==DishType.NON_VEG).
                map(d->d.getIngredients()).
                distinct().collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("--------||||---------");

        dishes.stream().
                map(dish->{dish.setRating(8); return dish;}).
                distinct().collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("--------||||---------");

        dishes.stream().filter(g->g.getDishName()=="Butter Chicken").
                map(d->{d.setCalories(560); return d;}).distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------||||---------");

        Map<String, List<String>> collect = dishes.stream().distinct().collect(Collectors.toMap(Dish::getDishName, Dish::getIngredients));
        System.out.println(collect);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        List<Integer> km = Arrays.asList(2,3,4);
        System.out.println(km.stream().reduce( (a, b) -> a * b));
        System.out.println("lllllllllllllllllllllll");
        System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getDishType, Collectors.toList())));


    }
}
