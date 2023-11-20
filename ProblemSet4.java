package edu.monmouth.problemSet4;

public class ProblemSet4 {
	
	public static void main(String[] args) {
		MusicalInstrument instrumentArray[] = groupInstruments();
        for (MusicalInstrument instrument : instrumentArray) {
        	if (instrument.getType().contains("brass")) {
                System.out.println("Instrument with type 'brass' found:");
            }
        	System.out.println("Name: " + instrument.getName());
        	System.out.println("Type: " + instrument.getType());
        	System.out.println("Keys or Strings: " + instrument.getNumberOfKeysorStrings());
        	System.out.println("Price: $" + instrument.getPrice());
        	System.out.println("");
        	
        	
        }
        MusicalInstrument instrumentWithFewestKeysorStrings = findInstrumentWithFewestKeysorStrings(instrumentArray);
        System.out.println("Instrument with the fewest Keys or Strings:");
        System.out.println("Name: " + instrumentWithFewestKeysorStrings.getName());
        System.out.println("Type: " + instrumentWithFewestKeysorStrings.getType());
        System.out.println("Keys or Strings: " + instrumentWithFewestKeysorStrings.getNumberOfKeysorStrings());
        System.out.println("Price: $" + instrumentWithFewestKeysorStrings.getPrice());
        System.out.println("");
        
        MusicalInstrument instrumentWithGreatestPrice = findInstrumentWithGreatestPrice(instrumentArray);
        System.out.println("Instrument with the Greatest Price:");
        System.out.println("Name: " + instrumentWithGreatestPrice.getName());
        System.out.println("Type: " + instrumentWithGreatestPrice.getType());
        System.out.println("Keys or Strings: " + instrumentWithGreatestPrice.getNumberOfKeysorStrings());
        System.out.println("Price: $" + instrumentWithGreatestPrice.getPrice());
        System.out.println("");
        
        MusicalInstrument[] InstrumentArray2 = new MusicalInstrument[10];
        for (int i = 0; i < InstrumentArray2.length; i++) {
            InstrumentArray2[i] = new MusicalInstrument();
        }
        int count = 0;
        for (MusicalInstrument instrument : instrumentArray) {
            if (instrument.getType().contains("brass")) {
                if (count < InstrumentArray2.length) {
                	InstrumentArray2[count] = instrument;
                    count++;
                    } 
                }
            }
        System.out.println("New Array with Brass Instruments:");
        for (MusicalInstrument brassInstruments : InstrumentArray2) {
            if (brassInstruments != null) {
                System.out.println("Name: " + brassInstruments.getName());
                System.out.println("Type: " + brassInstruments.getType());
                System.out.println("Keys or Strings: " + brassInstruments.getNumberOfKeysorStrings());
                System.out.println("Price: $" + brassInstruments.getPrice());
                System.out.println("");
            }
        }
    }
	
	public static MusicalInstrument[] groupInstruments() {
		final int ARRAYSIZE = 10;
		MusicalInstrument instruments[] = new MusicalInstrument[ARRAYSIZE];
		MusicalInstrument instrument1 = new MusicalInstrument("GuiTar", "STRIng", 6, 80.00);
		MusicalInstrument instrument2 = new MusicalInstrument("Oboe", "Woodwind", 12, 79.99);
		MusicalInstrument instrument3 = new MusicalInstrument("Trumpet", "brass", 3, 109.99);
		MusicalInstrument instrument4 = new MusicalInstrument("Violin", "string", 4, 543.0);
		MusicalInstrument instrument5 = new MusicalInstrument("Drums", "percussion", 0, 592.0);
		MusicalInstrument instrument6 = new MusicalInstrument("Piano", "keyboard", 88, 660.0);
		MusicalInstrument instrument7 = new MusicalInstrument("Flute", "woodwind", 5, 60.0);
		MusicalInstrument instrument8 = new MusicalInstrument("Saxophone", "woodwind", 22, 387.0);
		MusicalInstrument instrument9 = new MusicalInstrument("French Horn", "brass", 3, 290.0);
		MusicalInstrument instrument10 = new MusicalInstrument("bass", "string", 4, 890.0);
		
		instruments[0] = instrument1;
		instruments[1] = instrument2;
		instruments[2] = instrument3;
		instruments[3] = instrument4;
		instruments[4] = instrument5;
		instruments[5] = instrument6;
		instruments[6] = instrument7;
		instruments[7] = instrument8;
		instruments[8] = instrument9;
		instruments[9] = instrument10;
        return(instruments)	;
	}
	public static MusicalInstrument findInstrumentWithFewestKeysorStrings(MusicalInstrument[] instruments) {
		MusicalInstrument instrumentWithFewestKeysorStrings = instruments[0];
		for (int i = 1; i < instruments.length; i++) {
			if (instruments[i].getNumberOfKeysorStrings() < instrumentWithFewestKeysorStrings.getNumberOfKeysorStrings()) {
				instrumentWithFewestKeysorStrings = instruments[i];
				}
			}
	        return instrumentWithFewestKeysorStrings;
	}
	
	public static MusicalInstrument findInstrumentWithGreatestPrice(MusicalInstrument[] instruments) {
        MusicalInstrument instrumentWithGreatestPrice = instruments[0];
        for (int i = 1; i < instruments.length; i++) {
        	if (instruments[i].getPrice() > instrumentWithGreatestPrice.getPrice()) {
        		instrumentWithGreatestPrice = instruments[i];
        		}
        	}
        return instrumentWithGreatestPrice;
        }
}