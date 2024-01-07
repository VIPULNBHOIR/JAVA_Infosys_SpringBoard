class Employee {
    int empid;
    String name;
    double salary; 

    public void setname(String name){
        this.name=name;
    }
    public void setempid(int empid){
        this.empid=empid;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public String getname(){
        return name;
    }
    public int getempid(){
        return empid;
    }
    public double getsalary(){
        return salary;
    }
    

}

class PermentEmp extends Employee {
    double basic_pay; double Hra;int Exp;
    double var_comp;
    void calculateSalary(){
        if (Exp>=3 && Exp<5){
            var_comp=5*basic_pay/100;
        }
        else if (Exp<10) {
            var_comp=7*basic_pay/100;
        }
        else if (Exp>=10){
            var_comp=12*basic_pay/100;
        }
        else{
            var_comp=0; 
        }
        System.out.println("PermentEmp your salary: "+(var_comp+basic_pay+Hra)); 
    }
    PermentEmp(double basic_pay, double Hra,int Exp){
        this.basic_pay=basic_pay;
        this.Hra=Hra;
        this.Exp=Exp;
    }
    
}

class ContractEmp extends Employee{
    double wages;
    int hour;

    void calculateSalary(){
        System.out.println("ContractEmp your salary: "+(hour*wages)); 
    }
    
    ContractEmp(double wages,int hour){
        this.wages=wages;
        this.hour=hour;
    }
    
}

public class Inheritance {
    public static void main(String[] args) {
        //for permenent employee
        PermentEmp emp1=new PermentEmp(10000, 1500, 03);
        emp1.setempid(101);
        emp1.setname("Anil");
        emp1.calculateSalary();

        //for Contract employee
        ContractEmp emp2=new ContractEmp(10, 500);
        emp2.setempid(102);
        emp2.setname("Ankit");
        emp2.calculateSalary();

    }
}

/* output
 
PS C:\Users\bhoir\OneDrive\Desktop\Info_> cd "c:\Users\bhoir\OneDrive\Desktop\Info_\" ; if ($?) { javac Inheritance.java } ; if ($?) { java Inheritance }
PermentEmp your salary: 12000.0
ContractEmp your salary: 5000.0

 */