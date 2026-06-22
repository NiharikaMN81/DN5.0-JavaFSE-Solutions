public class FinancialForecast {
    public static double calculateFutureValue(double presentVal, double growthRate, int years){
        if(years==0){
            return presentVal;
        }
        
        return calculateFutureValue(presentVal*(1+growthRate), growthRate, years-1);
    }
}
