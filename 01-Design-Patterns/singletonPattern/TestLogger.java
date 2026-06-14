public class TestLogger {
    public static void main(String[] args) {
        Logger logg1=Logger.getInstance();
        logg1.log("1st message");

        Logger logg2=Logger.getInstance();
        logg2.log("2nd message");

        if(logg1==logg2){
            System.out.println("Both are same instances");
        }else{
            System.out.println("Both are different");
        }
    }
}
