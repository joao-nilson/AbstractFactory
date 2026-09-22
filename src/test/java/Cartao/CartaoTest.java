package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {

    @Test
    void deveEmitirFaturaBlack() {
        FabricaAbstrata fabrica = new FabricaBlack();
        Cartao cartao = new Cartao(fabrica);
        assertEquals("Fatura Cartão Black", cartao.emitirFatura());
    }

    @Test
    void deveEmitirFaturaStandard() {
        FabricaAbstrata fabrica = new FabricaStandard();
        Cartao cartao = new Cartao(fabrica);
        assertEquals("Fatura Cartão Standard", cartao.emitirFatura());
    }

    @Test
    void deveEmitirAnuidadeBlack() {
        FabricaAbstrata fabrica = new FabricaBlack();
        Cartao cartao = new Cartao(fabrica);
        assertEquals("Anuidade Cartão Black", cartao.emitirAnuidade());
    }

    @Test
    void deveEmitirAnuidadeStandard() {
        FabricaAbstrata fabrica = new FabricaStandard();
        Cartao cartao = new Cartao(fabrica);
        assertEquals("Anuidade Cartão Standard", cartao.emitirAnuidade());
    }

}
