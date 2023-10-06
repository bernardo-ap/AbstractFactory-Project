public class FabricaPJ implements FabricaAbstrata{

    @Override
    public Documento createDocumento(){
        return new DocumentoPJ();
    }

    @Override
    public NumDocumento createNumDocumento(){
        return new NumDocumentoPJ();
    }
}