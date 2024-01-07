
package customer;

public class Customer {
    protected String customerId;
    protected String address;
    protected String phoneNo;

    public Customer(String customerId, String address, String phoneNo) {
        this.customerId = customerId;
        this.address = address;
        this.phoneNo = phoneNo;
    }

 

    @Override
    public String toString() {
        return "\nCustomer ID: " + customerId + "\nAddress: " + address + "\nPhone No: " + phoneNo;
    }
}

