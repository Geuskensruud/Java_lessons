
enum Options {
	CAT("cat"), DOG("dog"), DEER("deer");
	private String animalName;
	Options(String animalName){this.animalName = animalName;}
	public String getAnimalName() {return animalName;}
}
public class EnumClass {
	public static void main(String[] args) {
		Options o = Options.CAT;
		//switch with enum
		switch(o) {
		case CAT:
			System.out.println("cat");
			break;
		case DEER:
			System.out.println("deer");
			break;
		case DOG:
			System.out.println("dog");
			break;
		default:
			break;	
		}
		//loop through enum
		for(Options o1: Options.values()) {
			System.out.println(o1);
		}
		
	}
}
