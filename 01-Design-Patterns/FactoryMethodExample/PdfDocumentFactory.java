//package DN5.0-JavaFSE-Solutions.01-Design-Patterns.FactoryMethodExample;

public class PdfDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}
