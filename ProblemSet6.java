package edu.monmouth.problemSet6;

public class ProblemSet6 {
	public static void main(String[] args) {
		try {
			MusicalInstrument6 Instrument1 = new MusicalInstrument6("GuiTar", "sTRing", 6, 80.00);
			System.out.println("Instrument 1 is valid: " + Instrument1);
		} catch (MusicalInstrumentException e) {
            System.err.println("Exception in Instrument 1: " + e.getMessage());
            }
		
		try {
			MusicalInstrument6 Instrument2 = new MusicalInstrument6("Oboe", "Woodwind", 12, 79.99);
			System.out.println("Instrument 2 is valid: " + Instrument2);
		} catch (MusicalInstrumentException e) {
			System.err.println("Exception in Instrument 2: " + e.getMessage());
			}
		
		
		
		try {
			MusicalInstrument6 Instrument3 = new MusicalInstrument6("Trumpet", "Monkey", 3, 109.99);
			System.out.println("Instrument 3 is valid: " + Instrument3);
			} catch (MusicalInstrumentException e) {
				System.err.println("Exception in Instrument 3: " + e.getMessage());
				}

		try {
			MusicalInstrument6 Instrument4 = new MusicalInstrument6("Violin", "Mellophone", 4, 543.0);
			System.out.println("Instrument 4 is valid: " + Instrument4);
			} catch (MusicalInstrumentException e) {
				System.err.println("Exception in Instrument 4: " + e.getMessage());
				}

		
		try {
			MusicalInstrument6 Instrument5 = new MusicalInstrument6(null, "percussion", 0, 592.0);
			System.out.println("Instrument 5 is valid: " + Instrument5);
			} catch (MusicalInstrumentException e) {
				System.err.println("Exception in Instrument 5: " + e.getMessage());
				}

		try {
			MusicalInstrument6 Instrument6 = new MusicalInstrument6("", "keyboard", 88, 660.0);
			System.out.println("Instrument 6 is valid: " + Instrument6);
			} catch (MusicalInstrumentException e) {
				System.err.println("Exception in Instrument 6: " + e.getMessage());
				}
		}
	}