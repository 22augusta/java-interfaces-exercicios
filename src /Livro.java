public class Livro implements Calculavel {
    private double preco;
    private double desconto;

    public Livro(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto / 100);
    }

    public static void main(String[] args) {
        Livro livro = new Livro(50.0, 10); // 10% de desconto
        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
    }
}
