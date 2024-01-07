public class Salary_Array {
    public static void main(String[] args) {
        double Sal_Arry[]={23500.0,25080.0,28760.0,22340.0,19890.0};
        double sum=0.0,average=0.0;
        int great=0,less=0;
        for(double i:Sal_Arry){
            sum+=i;
        }
        average=sum/Sal_Arry.length;
        System.out.println("The Average salary of Employee: "+ average);
        for (double i:Sal_Arry){
            if (i>average){
                great++;
            }
            else if (i<average){
                less++;
            }
            else{
                System.out.println("Salary is same as Average Salary: "+ i);
            }
        }
        System.out.println("The Number of Employee having Salary greater than Average: "+ great);
        System.out.println("The Number of Employee having Salary lesser than Average: "+ less);
    }
}
