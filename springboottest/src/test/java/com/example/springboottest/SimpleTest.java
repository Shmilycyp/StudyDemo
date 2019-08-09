package com.example.springboottest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SimpleTest {

    @Test
    public void test(){

        String name = "bannner";
        Meal meal = Meal.valueOf(name);


        assertTrue("banner should be a fruit but is " + meal.getType() , meal.getType().equals("fruit"));
    }


}


class Meal{


    private String type;

    public Meal(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public static Meal valueOf(String ingredient){

        if(ingredient.equals("bannner")){
            return new Meal("fruit");
        }

        return new Meal("vegetale");
    }




}
