public class Produto implements Vendavel {
    private double precoUnitario;

    public Produto(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double precoTotal, double desconto) {
        return precoTotal - (precoTotal * desconto / 100);
    }

    public static void main(String[] args) {
        Produto produto = new Produto(50.0);
        double precoTotal = produto.calcularPrecoTotal(3); // 3 unidades
        System.out.println("Preço total sem desconto: " + precoTotal);
        System.out.println("Preço com desconto de 10%: " + produto.aplicarDesconto(precoTotal, 10));
    }
}
