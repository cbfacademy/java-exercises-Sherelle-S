package com.cbfacademy.cars;

public class Car {
    public String make;
    public String model;
    public int year;
   

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    

    public void getMake(){
        return;
    }

    public void getModel(){
    return;
    }

    public void getYear(){
    return;
    }

    public void getDetals(){
        System.out.print("Have you seen my nice new " +this.make+"? ");
        System.out.print("It's a " +this.model+ " You know ");
        System.out.print("It was released in " + this.year + ". \n");
    }

    @Override
    public String toString(){
        String newCar = make + "\n"+model + "\n" + year;
        return newCar;
    }
}