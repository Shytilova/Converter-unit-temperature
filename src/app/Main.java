package app;

public class Main {

    private static final double CONV_VAL1=32;
    private static final double CONV_VAL2=1.8;

    public static void main(String[] args) {
        System.out.println("Converter unit temperature");

        double deegreFahrenheit =70;
        double deegreeCel = fahrenheitToCelsius(deegreFahrenheit);

        System.out.printf("%.1f\u00B0F = %.1f\u00B0C",
                deegreFahrenheit,
                deegreeCel);
    }

    private static double fahrenheitToCelsius(double deegreFahrenheit){
        return (deegreFahrenheit-CONV_VAL1)/CONV_VAL2;
    }
}
