//import java.util.*;
public class SearchAlgo {
    //linear search
    public static Product linearSearch(Product[] products, int targetId){
        for(int i=0;i<products.length;i++){
            if(products[i].productId==targetId){
                return products[i];
            }
        }
        return null;
    }


    //binary
    //public static Product binarySearch(Product[] products, int targetId){
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
    
}