package customer.typeofcustomer;

import customer.Customer;


public class PrivilegedCustomer extends Customer {
    public String CustName; 

    public PrivilegedCustomer(String customerId, String address, String phoneNo, String name) {
        super(customerId, address, phoneNo);
        this.CustName=name;
    }



    @Override
    public String toString() {
        return "Customer Name: "+ CustName + super.toString();
    }
}
