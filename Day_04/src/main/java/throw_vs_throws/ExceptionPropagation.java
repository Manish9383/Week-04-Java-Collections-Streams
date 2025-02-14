package throw_vs_throws;

public class ExceptionPropagation {
    public static void calculateInterest(double amount,double rate,int years)throws IllegalArgumentException{
        if(amount<0 || rate<0){
            throw new IllegalArgumentException();
        }
        System.out.println("Interest : "+(amount*rate*years)/100);
    }
}
