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
	private String birth;
	private String death;

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
		case "birth":
			return birth;
		case "death":
			return death;
		default:
			System.err.println("Unknown attribute " + attribute);
			return "";
		}
	}

	public void addAttribute(String attribute, String value) {
		switch (attribute) {
		case "name":
			name = value;
			break;
		case "dynasty":
			dynasty = Integer.valueOf(value);
			break;
		case "dna":
			dna = value;
			break;
		case "culture":
			culture = value;
			break;
		case "religion":
			religion = value;
			break;
		case "martial":
			martial = Integer.valueOf(value);
			break;
		case "diplomacy":
			diplomacy = Integer.valueOf(value);
			break;
		case "stewardship":
			stewardship = Integer.valueOf(value);
			break;
		case "intrigue":
			intrigue = Integer.valueOf(value);
			break;
		case "learning":
			learning = Integer.valueOf(value);
			break;
		case "add_trait":
			traits.add(value);
			break;
		case "birth":
			birth = value;
			break;
		case "death":
			death = value;
			break;
		default:
			System.err.println("Unknown attribute " + attribute);
		}
	}
}
