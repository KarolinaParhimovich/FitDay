package utils;

import com.github.javafaker.Faker;

import java.util.Date;

public class FakeMessageGenerator {

    public static String generateHeight(){
        return "1.".concat(String.valueOf(new Faker().number().numberBetween(50,90)));
    }

    public static String generateCurrentWeight(){
        return String.valueOf(new Faker().number().numberBetween(90,140));
    }
    public static String generateGoalWeight(){
        return String.valueOf(new Faker().number().numberBetween(40,89));
    }
    public static String generateDate(){
        return new Faker().date().toString();
    }
    public static String generateNewCurrentWeight(){
        return String.valueOf(new Faker().number().numberBetween(40,140));
    }
    public static String generateNewName(){
        return new Faker().name().username();
    }
    public static String generateNewPassword(){
        return new Faker().internet().password();
    }
    public static String generateNewEmail(){
        return new Faker().internet().emailAddress();
    }
}
