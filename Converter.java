import java.util.*;

public class Converter {

	private static double quantityInput(String qty1, String qty2, Scanner scan) {
		double quantity;
		System.out.println("Convert " + qty1 + " to " + qty2);
		quantity = scan.nextDouble();
		return quantity;
	}

	private static double cupsToTeaspoons(double qty) {
		return qty * 48;
	}

	private static double milesToKilometers(double qty) {
		return qty * 1.60934;
	}

	private static double USGaltoImpGal(double qty) {
		return qty * 0.832674;
	}

	public static void main(String[] args) {
		int menu = 0;
		double unit1, unit2;
		Scanner scan = new Scanner(System.in);

		while (menu != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			menu = scan.nextInt();
			
			
			switch (menu) {
			case 1:
				unit1 = quantityInput("cups", "teaspoons", scan);
				unit2 = cupsToTeaspoons(unit1);
				System.out.println(unit1 + " cups = " + unit2 + " teaspoons.");
				break;
			case 2:
				unit1 = quantityInput("miles", "kilometers", scan);
				unit2 = milesToKilometers(unit1);
				System.out.println(unit1 + " miles = " + unit2 + " kilometers.");
				break;
			case 3:
				unit1 = quantityInput("US gallons", "Imperial gallons", scan);
				unit2 = USGaltoImpGal(unit1);
				System.out.println(unit1 + " US gallons = " + unit2 + " Imperial gallons.");
				break;
			case 4:
				System.out.println("Exiting.");
				break;
			default:
				System.out.println("Wrong selection.");
			}
			System.out.println();
		}

		scan.close();
	}
}
	
