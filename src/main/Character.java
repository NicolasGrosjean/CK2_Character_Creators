import java.util.ArrayList;
import java.util.List;

public class Character {
	private int id;
	
	// Family
	private Character father;
	private Character mother;
	private List<Character> spouses; // TODO : Change Character to store marriage date
	private List<Character> children;

	// Personal attributes
	private String name;
	private int dynasty;
	private String dna;
	private String culture;
	private String religion;
	private int martial;
	private int diplomacy;
	private int stewardship;
	private int intrigue;
	private int learning;
	private List<String> traits;
	private String birthDate;
	private String deathDate;

	public Character(int id) {
		this.id = id;
		spouses = new ArrayList<>();
		children = new ArrayList<>();
		dynasty = 0;
		martial = -1;
		diplomacy = -1;
		stewardship = -1;
		intrigue = -1;
		learning = -1;
		traits = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public Character getFather() {
		return father;
	}

	public Character getMother() {
		return mother;
	}

	public List<Character> getSpouses() {
		return spouses;
	}

	public List<Character> getChildren() {
		return children;
	}

	public List<String> getTraits() {
		return traits;
	}

	public String getAttribute(String attribute) {
		switch (attribute) {
		case "name":
			return name;
		case "dynasty":
			return String.valueOf(dynasty);
		case "dna":
			return dna;
		case "culture":
			return culture;
		case "religion":
			return religion;
		case "martial":
			return String.valueOf(martial);
		case "diplomacy":
			return String.valueOf(diplomacy);
		case "stewardship":
			return String.valueOf(stewardship);
		case "intrigue":
			return String.valueOf(intrigue);
		case "learning":
			return String.valueOf(learning);
		case "birthDate":
			return birthDate;
		case "deathDate":
			return deathDate;
		default:
			System.err.println("Unknown attribute " + attribute);
			return "";
		}
	}

	public void addAttribute(String attribute, String value) {
		switch (attribute) {
		case "name":
			name = value;
		case "dynasty":
			dynasty = Integer.valueOf(value);
		case "dna":
			dna = value;
		case "culture":
			culture = value;
		case "religion":
			religion = value;
		case "martial":
			martial = Integer.valueOf(value);
		case "diplomacy":
			diplomacy = Integer.valueOf(value);
		case "stewardship":
			stewardship = Integer.valueOf(value);
		case "intrigue":
			intrigue = Integer.valueOf(value);
		case "learning":
			learning = Integer.valueOf(value);
		case "trait":
			traits.add(value);
		case "birthDate":
			birthDate = value;
		case "deathDate":
			deathDate = value;
		default:
			System.err.println("Unknown attribute " + attribute);
		}
	}
}
