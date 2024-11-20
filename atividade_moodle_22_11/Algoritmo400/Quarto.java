
public class Quarto {
    int leitos;
    double preco;
    String situacao; 
    double despesasExtras;
    int diasHospedagem;

    public Quarto(int leitos, double preco, String situacao) {
        this.leitos = leitos;
        this.preco = preco;
        this.situacao = situacao;
        this.despesasExtras = 0;
        this.diasHospedagem = 0;
    }
}