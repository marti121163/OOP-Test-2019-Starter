package ie.tudublin;

import processing.core.PApplet;

import java.util.ArrayList;

public class UI extends PApplet {

	public void separate(int value) {

		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100) + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings() {

		size(500, 800);

		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() {
	}

	public void draw() {
	}

	// this is my array list of colours
	public class colours {
		private ArrayList<String> colours = new ArrayList<>();
	}

	// resistors array list
	public class resistors {
		private ArrayList<String> resistors = new ArrayList<>();
	}

//	// function for loading in the table
//	public void loadColours() {
//		//
//		Table table = loadTable("colours.csv", "header");
//
//		for (int i = 0; i < table.getRowCount(); i++) {
//			//Colour colour = new String(table.getRow(i));
//
//			//println(table.getRowCount() + " total rows in table");
//
//			String colour = i.getString("colours");
//			int r = i.getInt("r");
//			int g = i.getInt("g");
//			int b = i.getInt("b");
//			String value = i.getString("value");
//
//			System.out.println(colour + " has an RGB value of " + r + g + b + value);
//		}
//	}


//	public void loadColours() {
//		Table table = loadTable("colours.csv", "header");
//
//		for (int i = 0; i < table.getRowCount(); i++) {
//			Colour s = new Colour(table.getRow(i));
//
//			Colour.add(s);
//		}
//	}


//	// method for printing the contents of the array
//	public void printColours() {
//		System.out.println("you have " + colours.size() + " items in your list");
//		for (int i = 0; i < colours.size(); i++) {
//			System.out.println((i + 1) + ". " + colours.get(i));
//		}
//	}

//	// method for returning a colour associated with value parameter
//	public Color findColor(int value) {
//		if(colours.contains(colour))
//	}
//
//	if(girls.contains(nameSearch)) {
//		// Look for the data
//	} else {
//		// print error
//	}
}
