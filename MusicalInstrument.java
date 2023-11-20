package edu.monmouth.problemSet4;

public class MusicalInstrument {
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

	
	public MusicalInstrument() {
		setName(UNKNOWNNAME);
		setType(UNKNOWNTYPE);
		setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
		setPrice(UNKNOWNPRICE);
		
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings, double price) {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
		setPrice(price);
	}
	
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		this(name, type, numberOfKeysorStrings, UNKNOWNPRICE);
		}
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		if (name.equals(null)) {
			this.name = UNKNOWNNAME;
		}
		else {
			this.name = name.toLowerCase();
		}
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		String[] ValidTypes = {"woodwind", "brass", "string", "percussion", "keyboard"};
		
		for (String ValidType : ValidTypes) {
			if (ValidType.equals(null)) {
				this.type = UNKNOWNTYPE;
			}
			else {
				this.type = type.toLowerCase();
			}
		}
	}	

	public int getNumberOfKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
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
	
	public void setPrice(double price) {
		if (price < LOWESTPRICE) {
			this.price = UNKNOWNPRICE;
		}
		else {
			this.price = price;
		}
	}

}
