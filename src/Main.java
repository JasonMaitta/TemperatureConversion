//adds scanner to the program
import java.util.Scanner;

//main java class used for the program
public class Main {
    //main method used for the program (public) (program code lives in here)
    public static void main(String[] args) {

        //defines the scanner, so the program can use it
        Scanner scanner = new Scanner(System.in);

        //gathers number from user
        System.out.println("Enter a temperature in fahrenheit:");
        double number = scanner.nextInt();

        //runs calculations on input gathered from user in order to get the temperature in celsius,
        //then uses the celsiusConversion double to calculate temperature in kelvin
        double celsiusConversion = ((number - 32) * 5 / 9);
        double kelvinConversion = (celsiusConversion + 273.15);

        //outputs the temperature in celsius
        System.out.println("Your Temperature in Celsius: " + celsiusConversion + "°");
        //outputs the temperature in kelvin
        System.out.println("Your Temperature in Kelvin: " + kelvinConversion + "°");
    }
}
