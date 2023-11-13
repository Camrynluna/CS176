package edu.monmouth.problemSet3;

public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	private double price;
	private static final String UNKNOWNNAME = "UNKNOWNNAME";
	private static final String UNKNOWNTYPE = "UNKNOWNTYPE";
	private static final int UNKNOWNKEYSORSTRINGS = -1;
	private static final int MINIMUMNUM = 0;
	private static final int MAXIMUMNUM = 100;
	private static final double UNKNOWNPRICE = -9;
	private static final double LOWESTPRICE = 0;
	//final int MAX = 10;
	//final int MAX_VALUE = 10000;
	

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
		this.name = name.toLowerCase();
		}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type.toLowerCase();
		/**int fewest = Integer.MAX_VALUE;
		MI mia[] = new MI[MAX];
		mia[0] = new MI("guitar", "string", 6, 50);
		for(MI mi : mia) {
			int KeysorStrings = mi.getNumberOfKeysorStrings();
			if (KeysorStrings < fewest) {
				fewest = KeysorStrings;
			}
		}
		String validTypes[] = {"woodwind", "string", "percussion", "keyboard", "brass"};
		String vT[]= {new String("woodwind"), new String("string"), new String("percussion"), new String("keyboard"), new String("brass")};
			**/
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
