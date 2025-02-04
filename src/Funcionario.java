public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora2) {
        this.valorHora = valorHora2;
    }

    public double pagamento() {
        double valorPagamento = this.horasTrabalhadas * this.valorHora;
        return valorPagamento;
    }

    public String toString() {

        return "" + getNome() +
                " - " + " $ " +
                pagamento();
    }

}