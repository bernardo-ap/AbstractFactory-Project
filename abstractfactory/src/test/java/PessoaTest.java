import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveEmitirDocumentoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Documento Pessoa Física", pessoa.emitirDocumento());
    }

    @Test
    void deveEmitirDocumentoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Documento Pessoa Juridica", pessoa.emitirDocumento());
    }

    @Test
    void deveEmitirNumDocumentoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Numero documento pessoa fisica", pessoa.emitirNumDocumento());
    }

    @Test
    void deveEmitirNumDocumentoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Numero documento pessoa juridica", pessoa.emitirNumDocumento());
    }


}