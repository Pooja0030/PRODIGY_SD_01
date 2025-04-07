import java.util.Scanner;

public class EasyTemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature value
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        // Input unit (C, F, or K)
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = sc.next().toUpperCase().charAt(0);

        // Convert based on input unit
        if (unit == 'C') {
            double f = (temp * 9 / 5) + 32;
            double k = temp + 273.15;
            System.out.println("Fahrenheit: " + f + " °F");
            System.out.println("Kelvin: " + k + " K");
        } else if (unit == 'F') {
            double c = (temp - 32) * 5 / 9;
            double k = c + 273.15;
            System.out.println("Celsius: " + c + " °C");
            System.out.println("Kelvin: " + k + " K");
        } else if (unit == 'K') {
            double c = temp - 273.15;
            double f = (c * 9 / 5) + 32;
            System.out.println("Celsius: " + c + " °C");
            System.out.println("Fahrenheit: " + f + " °F");
        } else {
            System.out.println("Invalid unit! Please enter C, F, or K.");
        }

        sc.close();
    }
}
