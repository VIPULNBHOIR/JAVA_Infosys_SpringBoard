public class this_Chocolate {
    private int weight,cost,barcode;
    private String name;

    this_Chocolate(){
        this.barcode=101;
        this.name="Cadbury";
        this.weight=12; // in Gram(g)
        this.cost=10; // in rupees(₹)
    }

    public int getBarcode(){
        return barcode;
    }
    public void setBarcode(int barcode){
        this.barcode=barcode;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public static void main(String[] args){


        //create a object of class Chocolate
        this_Chocolate chocolate=new this_Chocolate();
        System.out.println("Barcode: "+ chocolate.barcode + "\n"
                           +"Name: "+ chocolate.name + "\n"
                           +"Weight: "+ chocolate.weight + " g\n"
                           +"Cost: "+ chocolate.cost + " ru\n");

        //using getter-setter
        chocolate.setBarcode(102);
        chocolate.setCost(50);
        chocolate.setWeight(24);
        chocolate.setName("Hershey's");

        System.out.println("Barcode: "+ chocolate.getBarcode() + "\n"
                           +"Name: "+ chocolate.getName() + "\n"
                           +"Weight: "+ chocolate.getWeight() + " g\n"
                           +"Cost: "+ chocolate.getCost() + " ru\n");

    }
}

/* Output

PS C:\Users\bhoir\OneDrive\Desktop\Info_> javac .\this_ChocolateTester.java 
PS C:\Users\bhoir\OneDrive\Desktop\Info_> java this_ChocolateTester 
Barcode: 101
Name: Cadbury
Weight: 12 g
Cost: 10 ru

Barcode: 102
Name: Hershey's
Weight: 24 g
Cost: 50 ru

*/