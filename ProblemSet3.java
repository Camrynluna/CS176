package edu.monmouth.problemSet3;

public class ProblemSet3 {
	public static void main(String[] args) {
		MusicalInstrument instrument1 = new MusicalInstrument();
		System.out.println("First Instrument: ");
		System.out.println(instrument1.getName());
		System.out.println(instrument1.getType());
		System.out.println(instrument1.getNumberOfKeysorStrings());
		System.out.println(instrument1.getPrice());
		// verify default constructor sets all attributes correctly
		
		MusicalInstrument instrument2 = new MusicalInstrument("GuiTar", "STRIng", 6);
		System.out.println(" ");
		System.out.println("Second Instrument: ");
		System.out.println(instrument2.getName());
		System.out.println(instrument2.getType());
		System.out.println(instrument2.getNumberOfKeysorStrings());
		System.out.println(instrument2.getPrice());
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument3 = new MusicalInstrument("Trumpet", "brass", 3, 109.99);
		System.out.println(" ");
		System.out.println("Third Instrument: ");
		System.out.println(instrument3.getName());
		System.out.println(instrument3.getType());
		System.out.println(instrument3.getNumberOfKeysorStrings());
		System.out.println(instrument3.getPrice());
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument4 = new MusicalInstrument("", "BRAss", -14, 109.99);
		System.out.println(" ");
		System.out.println("Fourth Instrument: ");
		System.out.println(instrument4.getName());
		System.out.println(instrument4.getType());
		System.out.println(instrument4.getNumberOfKeysorStrings());
		System.out.println(instrument4.getPrice());
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument5 = new MusicalInstrument("CLARINET", "Wooodwid", 10, 89.99);
		System.out.println(" ");
		System.out.println("Fifth Instrument: ");
		System.out.println(instrument5.getName());
		System.out.println(instrument5.getType());
		System.out.println(instrument5.getNumberOfKeysorStrings());
		System.out.println(instrument5.getPrice());
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument6 = new MusicalInstrument("Oboe", "Woodwind", 12, 79.99);
		System.out.println(" ");
		System.out.println("Sixth Instrument: ");
		System.out.println(instrument6.getName());
		System.out.println(instrument6.getType());
		System.out.println(instrument6.getNumberOfKeysorStrings());
		System.out.println(instrument6.getPrice());
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument7 = new MusicalInstrument("tuba", "Brass", 3, 189.99);
		System.out.println(" ");
		System.out.println("Seventh Instrument: ");
		System.out.println(instrument7.getName());
		System.out.println(instrument7.getType());
		System.out.println(instrument7.getNumberOfKeysorStrings());
		System.out.println(instrument7.getPrice());
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument8 = new MusicalInstrument("trianGle", "percussion", 0, 49.99);
		System.out.println(" ");
		System.out.println("Eighth Instrument: ");
		System.out.println(instrument8.getName());
		System.out.println(instrument8.getType());
		System.out.println(instrument8.getNumberOfKeysorStrings());
		System.out.println(instrument8.getPrice());
		// verify this constructor sets all attributes correctly
		
		double price5 = instrument5.getPrice();
		double price6 = instrument6.getPrice();
		double price7 = instrument7.getPrice();
		double price8 = instrument8.getPrice();
		
		System.out.println(" ");
		System.out.println("The most expensive between instruments 5 to 8: ");
		if (price5 > price6 && price5 > price7 && price5 > price8) {
			System.out.println("The most expensive is instrument5: " + price5);
		}
		else if (price6 > price5 && price6 > price7 && price6 > price8) {
			System.out.println("The most expensive is instrument6: " + price6);
		}
		else if (price7 > price5 && price7 > price6 && price7 > price8) {
			System.out.println("The most expensive is instrument7: " + price7);
		}
		else {
			System.out.println("The most expensive is instrument8: " + price8);
		}
		// for objects instrument5-8, determine the most expensive
		
		String type5 = instrument5.getType();
		String type6 = instrument6.getType();
		String type7 = instrument7.getType();
		String type8 = instrument8.getType();
		
		System.out.println(" ");
		System.out.println("Which instruments are Woodwinds: ");
		if (type5.equals("woodwind")) {
			System.out.println("Instrument5 is a woodwind");
		}
		else if (type6.equals("woodwind")) {
			System.out.println("Instrument6 is a woodwind");
		}
		else if (type7.equals("woodwind")) {
			System.out.println("Instrument7 is a woodwind");
		}
		else if (type8.equals("woodwind")) {
			System.out.println("Instrument8 is a woodwind");
		}
		// for objects instrument5-8, determine which are woodwind instruments
		
		
		int stringOrKey5 = instrument5.getNumberOfKeysorStrings();
		int stringOrKey6 = instrument6.getNumberOfKeysorStrings();
		int stringOrKey7 = instrument7.getNumberOfKeysorStrings();
		int stringOrKey8 = instrument8.getNumberOfKeysorStrings();
		
		System.out.println(" ");
		System.out.println("Which instruments have keys or strings greater than 6: ");
		if (stringOrKey5 > 6) {
			System.out.println("Instrument 5 has " + stringOrKey5 + " strings or keys, which is greater than 6");
		}
		else {
			System.out.println("Instrument 5 has " + stringOrKey5 + " strings or keys, which is NOT greater than 6");
		}
		if (stringOrKey6 > 6) {
			System.out.println("Instrument 6 has " + stringOrKey6 + " strings or keys, which is greater than 6");
		}
		else {
			System.out.println("Instrument 6 has " + stringOrKey6 + " strings or keys, which is NOT greater than 6");
		}
		if (stringOrKey7 > 6) {
			System.out.println("Instrument 7 has " + stringOrKey7 + " strings or keys, which is greater than 6");
		}
		else {
			System.out.println("Instrument 7 has " + stringOrKey7 + " strings or keys, which is NOT greater than 6");
		}
		if (stringOrKey8 > 6) {
			System.out.println("Instrument 8 has " + stringOrKey8 + " strings or keys, which is greater than 6");
		}
		else {
			System.out.println("Instrument 8 has " + stringOrKey8 + " strings or keys, which is NOT greater than 6");
		}
		// for objects instrument5-8, determine which have keys or strings > 6
	}
	
}

