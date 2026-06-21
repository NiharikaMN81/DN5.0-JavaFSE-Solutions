public class TestSearch {
    public static void main(String[] args) {
        Product[] productsUnsorted={
            new Product(103,"Laptop","electronics"),
            new Product(101,"shoes","footwear"),
            new Product(105,"watch","accessories"),
            new Product(102,"phone","electronics"),
            new Product(104,"bag","accessories")
        };
        Product[] productsSorted={
            new Product(101,"shoes","footwear"),
            new Product(102,"phone","electronics"),
            new Product(103,"Laptop","electronics"),
            new Product(104,"bag","accessories"),
            new Product(105,"watch","accessories")
            
        };

        //Linear search test
        long start1=System.nanoTime();
        Product result1=SearchAlgo.linearSearch(productsUnsorted,104);
        long end1=System.nanoTime();
        System.out.println("Linear search result:"+result1);
        System.out.println("Linear search time:"+ (end1-start1)+"ns");
        //binary search result
        long start2=System.nanoTime();
        Product result2=SearchAlgo.binarySearch(productsSorted,104);
        long end2=System.nanoTime();
        System.out.println("Binary search result:"+result2);
        System.out.println("Binary search time:"+ (end2-start2)+"ns");
    }
}