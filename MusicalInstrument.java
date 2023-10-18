package edu.monmouth.problemSet2;

public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	private static final String UNKNOWNNAME = "UNKNOWNNAME";
	private static final String UNKNOWNTYPE = "UNKNOWNTYPE";
	private static final int UNKNOWNKEYSORSTRINGS = -1;
	private static final int MINIMUMNUM = 0;
	private static final int MAXIMUMNUM = 100;
	

	public MusicalInstrument() {
		setName(UNKNOWNNAME);
		setType(UNKNOWNTYPE);
		setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
			if (name.equals("Guitar")) {
				this.name = name;
				}
			else if (name.equals("Clarinet")) {
				this.name = name;
			}
			else if (name.equals("Snare Drum")) {
				this.name = name;
			}
			else {
				this.name = UNKNOWNNAME;
			}
		}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
			if (type.equals("String")) {
				this.type = type;
			}
			else if (type.equals("Woodwind")) {
				this.type = type;
			}
			else if (type.equals("Percussion")) {
				this.type = type;
			}
			else {
				this.type = UNKNOWNTYPE;
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

}
