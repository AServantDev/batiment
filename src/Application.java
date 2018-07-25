import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Déclaration des instances
		System.out.println("Quel est ton loyer de base?");
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		System.out.println("A tu un balcon?");
		boolean input2 = sc.nextBoolean();
		System.out.println("A tu une place de parking?");
		boolean input3 = sc.nextBoolean();
		
		
		Batiment maisonArnaud = new Batiment();
		Batiment appartPierre = new Batiment();
		
		maisonArnaud.setAccesBatiment("sonnette");
		String entrée = maisonArnaud.getAccesBatiment();
		
		maisonArnaud.setType("maison");
		String type = maisonArnaud.getType();
		
		maisonArnaud.setLoyer(input);
		double rent = maisonArnaud.getLoyer();
		
		maisonArnaud.setBalcon(input2);
		boolean balcony = maisonArnaud.isBalcon();
		
		maisonArnaud.setParking(input3);
		boolean parking = maisonArnaud.isParking();
		
		
		
		
		
		
		maisonArnaud.construireBatiment();
		maisonArnaud.louerBatiment();
		
		
		
		
	}

}
