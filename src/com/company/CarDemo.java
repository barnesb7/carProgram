package com.company;

public class CarDemo {

    public static void main(String[] args) {
	    Car mycar = new Car();

	    mycar.setColor("Maroon");
	    mycar.setMake("Ford");
	    mycar.setModel("Pinto");
	    mycar.setYear(1971);

	    String space = " ";

	    System.out.println("We're sorry, but your " + mycar.getYear() + space + mycar.getColor() + space + mycar.getMake() + space + mycar.getModel() + " is too fast and much too furious.");
    }
}
