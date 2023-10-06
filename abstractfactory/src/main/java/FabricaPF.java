public class FabricaPF implements FabricaAbstrata{

    @Override
    public Documento createDocumento(){
        return new DocumentoPF();
    }

    @Override
    public NumDocumento createNumDocumento(){
        return new NumDocumentoPF();
    }
}
