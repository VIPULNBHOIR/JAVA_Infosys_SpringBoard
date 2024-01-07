
package purchase;

import customer.typeofcustomer.PrivilegedCustomer;

public class PurchaseBill {
    private String billId;
    private PrivilegedCustomer customer;
    private double discount;

    public PurchaseBill(String billId, PrivilegedCustomer customer, double discount) {
        this.billId = billId;
        this.customer = customer;
        this.discount = discount;
    }

    

    public void calculateBillAmount(double amount) {
        double final_amt=amount-(amount*discount/100);
        System.out.println("\nBill Amount is: "+ final_amt);
        System.out.println("******************************************");
    }

    @Override
    public String toString() {
        return "Bill ID: " + billId + "\n" + customer.toString() + "\nDiscount: " + discount;
    }
}

