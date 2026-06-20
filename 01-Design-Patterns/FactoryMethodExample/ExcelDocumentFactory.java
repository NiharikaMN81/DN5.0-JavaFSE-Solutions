//package DN5.0-JavaFSE-Solutions.01-Design-Patterns.FactoryMethodExample;

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new ExcelDocument();
    }
}
