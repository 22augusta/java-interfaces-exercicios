public class ConversorMoeda implements ConversaoFinanceira {
    private static final double COTACAO_DOLAR_REAL = 6.00; // Exemplo de cotação fixa

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * COTACAO_DOLAR_REAL;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println("Valor em reais: " + conversor.converterDolarParaReal(100));
    }
}
