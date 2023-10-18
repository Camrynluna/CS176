package edu.monmouth.problemSet2;

public class ProblemSet2 {
	public static void main(String[] args) {
		MusicalInstrument bass = new MusicalInstrument();
		System.out.println(bass.getName());
		System.out.println(bass.getType());
		System.out.println(bass.getNumberOfKeysorStrings());
		
		//1st
		MusicalInstrument guitar = new MusicalInstrument();
		guitar.setName("Guitar");
		guitar.setType("String");
		guitar.setNumberOfKeysorStrings(6); 
		System.out.println(guitar.getName());
		System.out.println(guitar.getType()); 
		System.out.println(guitar.getNumberOfKeysorStrings());
		
		//2nd
		MusicalInstrument clarinet = new MusicalInstrument("Clarinet", "Woodwind", 12);
		System.out.println(clarinet.getName());
		System.out.println(clarinet.getType()); 
		System.out.println(clarinet.getNumberOfKeysorStrings());
		
		//change 3rd
		clarinet.setName("Snare Drum");
		clarinet.setType("Percussion");
		clarinet.setNumberOfKeysorStrings(0); 
		System.out.println(clarinet.getName());
		System.out.println(clarinet.getType()); 
		System.out.println(clarinet.getNumberOfKeysorStrings());
		
		MusicalInstrument keyboard = new MusicalInstrument();
		keyboard.setName("Keyboard");
		keyboard.setType("Keys");
		keyboard.setNumberOfKeysorStrings(121); 
		System.out.println(keyboard.getName());
		System.out.println(keyboard.getType()); 
		System.out.println(keyboard.getNumberOfKeysorStrings());
	}	
}
