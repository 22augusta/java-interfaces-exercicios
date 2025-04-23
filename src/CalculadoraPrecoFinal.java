public class CalculadoraPrecoFinal implements Calculavel {
    private double preco;
    private double desconto;
    private double taxa; // para produtos físicos

    public CalculadoraPrecoFinal(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    // Para produtos físicos, podemos adicionar uma taxa
    public CalculadoraPrecoFinal(double preco, double taxa, boolean isProdutoFisico) {
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        // Se for produto físico, aplica a taxa
        if (taxa > 0) {
            return preco + (preco * taxa / 100);
        }
        // Se for livro ou outro item com desconto
        return preco - (preco * desconto / 100);
    }

    public static void main(String[] args) {
        // Exemplo para livro
        CalculadoraPrecoFinal livro = new CalculadoraPrecoFinal(50.0, 10); // 10% de desconto
        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());

        // Exemplo para produto físico
        CalculadoraPrecoFinal produtoFisico = new CalculadoraPrecoFinal(100.0, 15, true); // 15% de taxa
        System.out.println("Preço final do produto físico: " + produtoFisico.calcularPrecoFinal());
    }
}

