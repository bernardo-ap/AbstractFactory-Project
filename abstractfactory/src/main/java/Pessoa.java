public class Pessoa {

    private Documento documento;
    private NumDocumento numDocumento;

    public Pessoa(FabricaAbstrata fabrica){
        this.documento = fabrica.createDocumento();
        this.numDocumento = fabrica.createNumDocumento();
    }

    public String emitirDocumento(){
        return this.documento.emitirDocumento();
    }

    public String emitirNumDocumento(){
        return this.numDocumento.emitirNumDocumento();
    }


}
