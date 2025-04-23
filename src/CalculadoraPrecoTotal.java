public class CalculadoraPrecoTotal implements Vendavel {
    private double precoUnitario;
    private double precoHora; // para serviços
    private double horas;

    public CalculadoraPrecoTotal(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public CalculadoraPrecoTotal(double precoHora, double horas) {
        this.precoHora = precoHora;
        this.horas = horas;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        // Se for serviço, calcula com base nas horas
        if (horas > 0) {
            return precoHora * horas * quantidade;
        }
        // Se for produto, calcula com base na quantidade
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double precoTotal, double desconto) {
        return precoTotal - (precoTotal * desconto / 100);
    }

    public static void main(String[] args) {
        // Exemplo para produto
        CalculadoraPrecoTotal produto = new CalculadoraPrecoTotal(50.0);
        double precoTotalProduto = produto.calcularPrecoTotal(3); // 3 unidades
        System.out.println("Preço total do produto: " + precoTotalProduto);
        System.out.println("Preço com desconto de 10%: " + produto.aplicarDesconto(precoTotalProduto, 10));

        // Exemplo para serviço
        CalculadoraPrecoTotal servico = new CalculadoraPrecoTotal(40.0, 5); // 5 horas de serviço
        double precoTotalServico = servico.calcularPrecoTotal(2); // 2 serviços
        System.out.println("Preço total do serviço: " + precoTotalServico);
        System.out.println("Preço com desconto de 15%: " + servico.aplicarDesconto(precoTotalServico, 15));
    }
}
