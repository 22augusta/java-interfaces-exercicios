public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(5, 8);
        System.out.println("Área da sala: " + sala.calcularArea());
        System.out.println("Perímetro da sala: " + sala.calcularPerimetro());
    }
}
