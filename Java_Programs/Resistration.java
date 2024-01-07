public class Resistration {
    String PassportNo,PanNo,CustName;
    int voterid,licenNo;
    long telephone;
    Resistration(String CustName,String PassportNo,long telephone){
        this.CustName=CustName;
        this.PassportNo=PassportNo;
        this.telephone=telephone;
    }
    Resistration(String CustName,int licenNo,String PanNo,long telephone){
        this.CustName=CustName;
        this.licenNo=licenNo;
        this.telephone=telephone;
        this.PanNo=PanNo;
    }
    Resistration(String CustName,int voterid, int licenNo,long telephone){
        this.CustName=CustName;
        this.licenNo=licenNo;
        this.telephone=telephone;
        this.voterid=voterid;
    }
    Resistration(String CustName,String PanNo,int voterid, long telephone){
        this.CustName=CustName;
        this.PanNo=PanNo;
        this.telephone=telephone;
        this.voterid=voterid;
    }
    String getPanNo(){
        return PanNo;
    }
    String getpassport(){
        return PassportNo;
    }
    String getName(){
        return CustName;
    }
    int getvoterid(){
        return voterid;
    }
    int getlicenNo(){
        return licenNo;
    }
    long getteleNo(){
        return telephone;
    }
    
    public static void main(String[] args) {
        Resistration r=new Resistration("Kelvin", "MN9891N", 948574859612L);
        System.out.println("Congratulations "+ r.getName()+ "!!! you have been resistered for our services with the folowing details:");
        System.out.println("Passport No: "+ r.getpassport());
        System.out.println("Phone No: "+ r.getteleNo());

        System.out.println();

        Resistration r1=new Resistration("Rose", "PN8934", 34356, 98548574859612L);
        System.out.println("Congratulations "+ r1.getName()+ "!!! you have been resistered for our services with the folowing details:");
        System.out.println("Pancard No: "+ r1.getPanNo());
        System.out.println("Voterid No: "+ r1.getvoterid());
        System.out.println("Phone No: "+ r1.getteleNo());
    }   
}

/* OUTPUT

PS C:\Users\bhoir\OneDrive\Desktop\Info_>javac Resistration.java
PS C:\Users\bhoir\OneDrive\Desktop\Info_>java Resistration
Congratulations Kelvin!!! you have been resistered for our services with the folowing details:
Passport No: MN9891N
Phone No: 948574859612

Congratulations Rose!!! you have been resistered for our services with the folowing details:
Pancard No: PN8934
Voterid No: 34356
Phone No: 98548574859612
 
*/