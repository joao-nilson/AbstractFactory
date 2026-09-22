package padroescriacao.abstractfactory;

public class FabricaBlack implements FabricaAbstrata {

    @Override
    public Fatura createFatura() {
        return new FaturaBlack();
    }

    @Override
    public Anuidade createAnuidade() {
        return new AnuidadeBlack();
    }
}
