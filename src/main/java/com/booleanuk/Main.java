package com.booleanuk;

public class Main {
    int score = 16;
    String month = "August";

    public static void main(String[] args) {
        Main theMain = new Main();

        switch (theMain.month) {
            case "January" -> System.out.println("There are 31 days in this January!");
            case "February" -> System.out.println("There are 28 days in February!");
            case "March" -> System.out.println("There are 31 days in March!");
            case "April" -> System.out.println("There are 30 days in April");
            case "May" -> System.out.println("There are 31 days in May");
            case "June" -> System.out.println("There are 30 days in June");
            case "July" -> System.out.println("There are 31 days in July");
            case "August" -> System.out.println("There are 31 days in August");
            case "September" -> System.out.println("There are 30 days in September");
            case "October" -> System.out.println("There are 31 days in October");
            case "November" -> System.out.println("There are 30 days in November");
            case "December" -> System.out.println("There are 31 days in December");

            default -> System.out.println("No month chosen");
        }













/*
        switch (theMain.score) {
            case 0:
                System.out.println("It is zero");
                break;
            case 1:
                System.out.println("It is 1");
                break;
            default:
                System.out.println("Default value");


        }
*/











/*
        if (theMain.age < 16) {
            System.out.println("You can't drive");
        } else if (theMain.age == 16) {
            System.out.println("You can drive a low-powered motorbike/moped");
        } else if (theMain.age < 70) {
            System.out.println("You can drive anything");
        } else {
            System.out.println("You must reapply for a driving license every 2 years");
        }
*/


    }


}
