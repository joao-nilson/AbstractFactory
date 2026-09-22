package padroescriacao.abstractfactory;

public class FabricaStandard implements FabricaAbstrata {

    @Override
    public Fatura createFatura() {
        return new FaturaStandard();
    }

    @Override
    public Anuidade createAnuidade() {
        return new AnuidadeStandard();
    }
}
