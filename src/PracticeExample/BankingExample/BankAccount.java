package PracticeExample.BankingExample;

public class BankAccount {
    private Double amount ;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    Double totalammount = 1000.0;


    public  synchronized void  withdrew(Double withdrewAmount){
        System.out.println("Withdrew Request received for amount : "+withdrewAmount);
        if (totalammount >= withdrewAmount){
            System.out.println("Processed Request..... : "+withdrewAmount);
            totalammount -= withdrewAmount;
            System.out.println("Successfully withdrew  : "+withdrewAmount + " remaining amount : " + totalammount);
        }else {
            System.out.println("Insufficient amount  : "+withdrewAmount);
        }
    }
    public  synchronized void depositAmount(Double bankAccount ){
        System.out.println("Request for deposit, amount : "+bankAccount);
        totalammount += bankAccount;
        System.out.println("Deposit Success Total amount : " + totalammount);

    }
}
