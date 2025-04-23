public class Servico implements Vendavel {
    private double precoHora;
    private double horas;

    public Servico(double precoHora, double horas) {
        this.precoHora = precoHora;
        this.horas = horas;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * horas * quantidade;
    }

    @Override
    public double aplicarDesconto(double precoTotal, double desconto) {
        return precoTotal - (precoTotal * desconto / 100);
    }

    public static void main(String[] args) {
        Servico servico = new Servico(40.0, 5); // 5 horas de serviço
        double precoTotal = servico.calcularPrecoTotal(2); // 2 serviços
        System.out.println("Preço total sem desconto: " + precoTotal);
        System.out.println("Preço com desconto de 15%: " + servico.aplicarDesconto(precoTotal, 15));
    }
}
