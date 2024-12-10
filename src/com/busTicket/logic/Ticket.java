package com.busTicket.logic;

import java.util.Scanner;

import com.busTicket.pojo.Bus;
import com.busTicket.pojo.Passenger;

public class Ticket {

	Bus bus = new Bus();
	Passenger passenger = new Passenger();
	Scanner sc = new Scanner(System.in);
	private double TotalFare;
	private String inputString;

	public void getInput() {
		System.out.println(" **Welcome to Bus Ticket Calculator** ");
		System.out.println();
		System.out.println("Enter the Bus_Number :");
		bus.setBusNumber(sc.nextLine());
		System.out.println(" From :");
		bus.setFrom(sc.next());
		System.out.println(" To :");
		bus.setTo(sc.next());
		System.out.println("Enter the fare Of Per Passenger :");
		bus.setFarePerPassenger(sc.nextDouble());
		System.out.println();
		System.out.println("__Passenger Details__");
		System.out.println();
		System.out.println("Enter the number of passengers:");
		passenger.setNumberOfPassengers(sc.nextInt());
		logicOfName();
		logicOfAge();
		System.out.println("Is any child?(yes/No) :");
		inputString = sc.next();
		passenger.setIsChild(inputString);
		logicOfIschild();
		

	}

	public void calculation() {
		
        TotalFare = passenger.getNumberOfPassengers() * bus.getFarePerPassenger();
        

	}

	public void display() {
		System.out.println();
		System.out.println(" **Receipt Of TotalFare** ");
		System.out.println();
		System.out.println("Bus number : " + bus.getBusNumber());
		System.out.print("From : " + bus.getFrom());
		System.out.println("To : " + bus.getTo());
		System.out.println("farePerPassenger : " + bus.getFarePerPassenger());

		String[] names = passenger.getPassengerNames();
		int[] ages = passenger.getAge();
		for (int i = 0; i < passenger.getNumberOfPassengers(); i++) {
			System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
		}
		System.out.println("TotalFare Of all paseengers :" + TotalFare);

	}

	public String[] logicOfName() {

		String[] names = new String[passenger.getNumberOfPassengers()];

		for (int i = 0; i < passenger.getNumberOfPassengers(); i++) {
			System.out.println("Enter the name of passenger " + (i + 1) + ":");
			names[i] = sc.next();
		}

		passenger.setPassengerNames(names);
		return names;
	}

	public int[] logicOfAge() {
		int[] ages = new int[passenger.getNumberOfPassengers()];
		for (int i = 0; i < passenger.getNumberOfPassengers(); i++) {
			System.out.println("Enter the age of passenger " + (i + 1) + ":");
			ages[i] = sc.nextInt();
			if (ages[i] < 5) {
			        
			}
		}
		passenger.setAge(ages);
		return ages;
	}

	public void logicOfIschild() {

		if (inputString.equalsIgnoreCase("yes")) {
			
			System.out.println("Passenger is under 5 and will not be counted.");
		}

}
}
