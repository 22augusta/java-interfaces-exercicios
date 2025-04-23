public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        System.out.println("25°C em Fahrenheit: " + conversor.celsiusParaFahrenheit(25));
        System.out.println("77°F em Celsius: " + conversor.fahrenheitParaCelsius(77));
    }
}
