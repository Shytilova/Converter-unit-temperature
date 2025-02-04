package app;

public class Main {

    private static final double CONV_VAL1=32;
    private static final double CONV_VAL2=1.8;

    public static void main(String[] args) {
        System.out.println("Converter unit temperature");

        double deegreFahrenheit =70;
        double degreeCelsius = 25;
        double deegreeCel = fahrenheitToCelsius(deegreFahrenheit);
        double degreeFrt = celsiusToFahrenheit(degreeCelsius);

        System.out.printf("%.1f\u00B0F = %.1f\u00B0C%n", deegreFahrenheit,deegreeCel);

        System.out.printf("%.1f\u00B0C = %.1f\u00B0F",degreeCelsius,degreeFrt);
    }

    private static double fahrenheitToCelsius(double deegreFahrenheit){
        return (deegreFahrenheit-CONV_VAL1)/CONV_VAL2;
    }

    private static double celsiusToFahrenheit(double degreeCelsius ){
        return degreeCelsius*CONV_VAL2+CONV_VAL1;
    }
}
