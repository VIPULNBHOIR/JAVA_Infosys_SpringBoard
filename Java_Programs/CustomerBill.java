
import customer.Customer;
import customer.typeofcustomer.PrivilegedCustomer;
import purchase.PurchaseBill;

public class CustomerBill {
    public static void main(String[] args) {
        
        PrivilegedCustomer regularCustomer = new PrivilegedCustomer("RC1001", 
        "At: Gandhi nagar, Mumbai 415502", 
        "4545858596 8594784520", 
        "Jenny");

        PurchaseBill bill = new PurchaseBill("B4001", regularCustomer, 10.0d);

        System.out.println("Bill details:\n" + bill.toString());
        bill.calculateBillAmount(5000.50d);
    }
}


/* Output:
 
PS C:\Users\bhoir\OneDrive\Desktop\Info_> javac CustomerBill.java
PS C:\Users\bhoir\OneDrive\Desktop\Info_> java CustomerBill
Bill details:
Bill ID: B4001
Customer Name: Jenny
Customer ID: RC1001
Address: At: Gandhi nagar, Mumbai 415502
Phone No: 4545858596 8594784520
Discount: 10.0

Bill Amount is: 4500.45
******************************************

*/