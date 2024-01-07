abstract class RRPaymentServices{
    double balance;
    int customerId;

    RRPaymentServices(double balance, int customerId){
        this.balance=balance;
        this.customerId=customerId;
    }

    public double getBalance(double balance) {
        return balance;
    }
    public int getCustomerId() {
        return customerId;
    }

    abstract void payBill(double Amount);
}

class ShoppingPayment extends RRPaymentServices{
    static String PaymentID="S";
    static int counter=1000;
    ShoppingPayment(double balance,int customerId){
        super(balance, customerId);
        
    }
    static String getPaymentID(){
        return PaymentID + (++counter);
    }
    void payBill(double Amount) {
        if (Amount==balance){
            System.out.println("here you suessfully made the payment of RS. "+ Amount + " Details is:");
            System.out.println("**********************************************************************");
            System.out.println("Customer ID: "+ customerId);
            System.out.println("Payment ID: "+ getPaymentID());
            System.out.println("previous due: "+ balance);
            System.out.println("remaning due: "+ 0);
        }
        else{
            System.out.println("InProper Amount!!, Please try agian.");
        }
    };
}

class CreditCardPayment extends RRPaymentServices{
    static int counter=4000;
    static String PaymentID="C";
    double cashBack,balanceDue;
    CreditCardPayment(double balance, int customerId){
        super(balance, customerId);
        counter++;
    }

    static String getPaymentID() {
        return PaymentID + counter;
    }
    public double getCashBack() {
        return cashBack;
    }
    public double getBalanceDue() {
        return balanceDue;
    }
    void payBill(double Amount) {
        if(Amount>=balance){
            cashBack=Amount-balance;
            balanceDue=0;
        }
        else if(Amount==0){
            cashBack=0;
            balanceDue=balance;
        }
        else{
            cashBack=0;
            balanceDue=balance-Amount;
        }
        System.out.println("here you suessfully made the payment of RS. "+ Amount + " Details is:");
        System.out.println("**********************************************************************");
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Payment ID: "+ getPaymentID());
        System.out.println("previous due: "+ balance);
        System.out.println("remaning due: "+ balanceDue);
        System.out.println("CashBack: "+ cashBack);

    }



    
}


public class AbtractClassesAndMethods {
    public static void main(String[] args) {
        
        CreditCardPayment s=new CreditCardPayment(10000.23d,5001);
        s.payBill(15000.0d);
        System.out.println();
        CreditCardPayment s1=new CreditCardPayment(10000.23, 50002);
        s1.payBill(0);
        System.out.println();
        ShoppingPayment c=new ShoppingPayment(5000d, 54101);
        c.payBill(6000);
        System.out.println();
        ShoppingPayment c1=new ShoppingPayment(5000d, 54102);
        c1.payBill(5000d);

    }
    
}

/* Output: 
PS C:\Users\bhoir\OneDrive\Desktop\Info_>javac AbtractClassesAndMethods.java
PS C:\Users\bhoir\OneDrive\Desktop\Info_>java AbtractClassesAndMethods
here you suessfully made the payment of RS. 15000.0 Details is:
**********************************************************************
Customer ID: 5001
Payment ID: C4001
previous due: 10000.23
remaning due: 0.0
CashBack: 4999.77

here you suessfully made the payment of RS. 0.0 Details is:
**********************************************************************
Customer ID: 50002
Payment ID: C4002
previous due: 10000.23
remaning due: 10000.23
CashBack: 0.0

InProper Amount!!, Please try agian.

here you suessfully made the payment of RS. 5000.0 Details is:
**********************************************************************
Customer ID: 54102
Payment ID: S1001
previous due: 5000.0
remaning due: 0

*/