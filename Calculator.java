import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		
		double add = nbr1 + nbr2;
		System.out.println("Summan av talen är " + add);
		
		double sub = nbr1 - nbr2;
		System.out.println("Skillnaden mellan talen är " + sub);
		
		double mult = nbr1 * nbr2;
		System.out.println("Produkten av talen är " + mult);
		
		double div = nbr1 / nbr2;
		System.out.println("Kvoten av talen är " + div);
		
		scan.close();
	}
}
