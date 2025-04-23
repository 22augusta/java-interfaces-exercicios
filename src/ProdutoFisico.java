public class ProdutoFisico implements Calculavel {
    private double preco;
    private double taxa;

    public ProdutoFisico(double preco, double taxa) {
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * taxa / 100);
    }

    public static void main(String[] args) {
        ProdutoFisico produto = new ProdutoFisico(100.0, 15); // 15% de taxa
        System.out.println("Preço final do produto físico: " + produto.calcularPrecoFinal());
    }
}
