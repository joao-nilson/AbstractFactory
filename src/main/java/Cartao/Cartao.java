package padroescriacao.abstractfactory;

public class Cartao {

    private Fatura fatura;
    private Anuidade anuidade;

    public Cartao(FabricaAbstrata fabrica) {
        this.fatura = fabrica.createFatura();
        this.anuidade = fabrica.createAnuidade();
    }

    public String emitirFatura() {
        return this.fatura.emitir();
    }

    public String emitirAnuidade() {
        return this.anuidade.emitir();
    }
}
