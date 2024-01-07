class ChocolateTester{
    private int weight,cost,barcode;
    private String name;

    ChocolateTester(){
        barcode=101;
        name="Cadbury";
        weight=12; // in Gram(g)
        cost=10; // in rupees(₹)
    }
    public int getBarcode(){
        return barcode;
    }
    public void setBarcode(int Barcode){
        barcode=Barcode;
    }
    public String getName(){
        return name;
    }
    public void setName(String Name){
        name=Name;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int Weight){
        weight=Weight;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int Cost){
        cost=Cost;
    }

    public static void main(String[] args) {
        //create a object of class Chocolate
        ChocolateTester chocolate=new ChocolateTester();
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

/*

PS C:\Users\bhoir\OneDrive\Desktop\Info_> javac .\ChocolateTester.java 
PS C:\Users\bhoir\OneDrive\Desktop\Info_> java ChocolateTester        
Barcode: 101
Name: Cadbury
Weight: 12 g
Cost: 10 ru

Barcode: 102
Name: Hershey's
Weight: 24 g
Cost: 50 ru

 */