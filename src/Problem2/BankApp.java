package Problem2;

public class BankApp {
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount acc1=new BankAccount(500);
        double[] arr={200, 400, 100};
        for (int i=0;i<arr.length;i++){
            try {
                System.out.println(acc1.withdraw(arr[i]));
            }catch (InsufficientFundsException e){
                System.out.println(e.getMessage());
                System.out.println("Shortfall: " + e.shortfall);
            }
        }

    }
}
