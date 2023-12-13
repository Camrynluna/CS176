package edu.monmouth.problemSet6;

public class MusicalInstrument6 {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	private double price;
	private final String UNKNOWNNAME = "UNKNOWNNAME";
	private final String UNKNOWNTYPE = "UNKNOWNTYPE";
	private final int UNKNOWNKEYSORSTRINGS = -1;
	private final int MINIMUMNUM = 0;
	private final int MAXIMUMNUM = 100;
	private static final double UNKNOWNPRICE = -9;
	private final double LOWESTPRICE = 0;

	
	public MusicalInstrument6() throws MusicalInstrumentException {
		try {
			setName(UNKNOWNNAME);
			setType(UNKNOWNTYPE);
			setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
			setPrice(UNKNOWNPRICE);
		} catch (MusicalInstrumentException e) {
			throw e;
		}
		
	}
	public MusicalInstrument6(String name, String type, int numberOfKeysorStrings, double price) throws MusicalInstrumentException {
		try {
			setName(name);
			setType(type);
			setNumberOfKeysorStrings(numberOfKeysorStrings);
			setPrice(price);
		} catch (MusicalInstrumentException e) {
			throw e;
		}
	}
	
	public MusicalInstrument6(String name, String type, int numberOfKeysorStrings) throws MusicalInstrumentException {
	       try {
	    	setName(name);
	        setType(type);
	        setNumberOfKeysorStrings(numberOfKeysorStrings);
	        setPrice(UNKNOWNPRICE);
	       } catch (MusicalInstrumentException e) {
	    	   throw e;   
	       }
	}
	
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) throws MusicalInstrumentException {
		if (name == null || name.isEmpty()) {
			throw new MusicalInstrumentException("Error! Invalid instrument name: " + name);
		}
		else {
			this.name = name.toLowerCase();
		}
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) throws MusicalInstrumentException {
		String[] validTypes = {"woodwind", "brass", "string", "percussion", "keyboard"};
		
		boolean validType = false;
		for (String valid : validTypes) {
			if (valid.equals(type.toLowerCase())) {
				validType = true;
				this.type = type.toLowerCase();
				break;
			}
		}
		if (!validType) {
			throw new MusicalInstrumentException("Error! Invalid instrument type: " + type);
		}
	}	

	public int getNumberOfKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) throws MusicalInstrumentException {
		if (numberOfKeysorStrings < MINIMUMNUM || numberOfKeysorStrings > MAXIMUMNUM) {
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		}
		else {
			this.numberOfKeysorStrings = numberOfKeysorStrings;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) throws MusicalInstrumentException {
		if (price < LOWESTPRICE) {
			this.price = UNKNOWNPRICE;
		}
		else {
			this.price = price;
		}
	}
	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", numberOfKeysorStrings=" + numberOfKeysorStrings
				+ ", price=" + price + "]";
	}


}

