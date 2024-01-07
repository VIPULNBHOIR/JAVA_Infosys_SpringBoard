import java.util.Scanner;

public class FunCalculator {

    static boolean ArmStrong(int No){
        int Num=No;
        int sum=0,val;

        while (No!=0){
            val=No%10;
            sum+=(val*val*val);
            No=No/10;
        }
        return sum == Num;
    }

    static boolean LuckyNo(int No){

        String numberString = String.valueOf(No);
        int sum = 0;

        for (int i = 1; i < numberString.length(); i += 2) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            sum += digit * digit;
        }

        return sum % 9 == 0;
    }

    public static void main(String[] args){
        int No;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice:\n1.Armstrong number \n2.Lucky Number");
        System.out.print("your choice is: ");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            System.out.print("Enter the Number: ");
            No=sc.nextInt();

            if (ArmStrong(No)){
                System.out.println("the number "+ No +" is Armstrong number");
            }
            else{
                System.out.println("the number "+ No +" is NOT Armstrong number");
            }
            
            break;
            
            case 2:
            System.out.print("Enter the Number: ");
            No=sc.nextInt();

            if (LuckyNo(No)){
                System.out.println("the number "+ No +" is  Lucky number");
            }
            else{
                System.out.println("the number "+ No +" is NOT Lucky number");
            }
            break;
        
            default:
            System.out.println("Invalid Choice!!");
            break;
        }
        }
        
    }
