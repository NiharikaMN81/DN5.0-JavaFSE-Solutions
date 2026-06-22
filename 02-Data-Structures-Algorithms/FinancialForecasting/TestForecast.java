public class TestForecast {
    public static void main(String[] args) {
        double presentVal=1000.0;
        double growthRate=0.10;
        int years=5;

        double result=FinancialForecast.calculateFutureValue(presentVal,growthRate,years);
        System.out.println("Present value is:"+presentVal);
        System.out.println("Growth rate is:"+growthRate*100+"% per year");
        System.out.println("years:"+years);
        System.out.printf("Future value after %d years: Rs %.2f%n",years,result);

        //test with other values
        System.out.println("\n--more presictions just in case--");
        System.out.printf("after one year:Rs %.2f%n",FinancialForecast.calculateFutureValue(1000,0.10,1));
        System.out.printf("after three year:Rs %.2f%n",FinancialForecast.calculateFutureValue(1000,0.10,3));
        System.out.printf("after ten year:Rs %.2f%n",FinancialForecast.calculateFutureValue(1000,0.10,10));
    }
}
