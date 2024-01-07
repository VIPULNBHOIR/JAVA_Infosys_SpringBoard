public class Reverse_Calc {
    private static int val,rev_num;
    static int while_reverse_num(int num){
        rev_num=0;
        while(num!=0){
            val=num%10;
            rev_num=rev_num*10+val;
            num/=10;
        }
        return rev_num;

    }
    static int do_while_reverse_num(int num){
        rev_num=0;
        do{
            val=num%10;
            rev_num=rev_num*10+val;
            num/=10;
        }while(num!=0);

        return rev_num;
    }
    static int for_reverse_num(int num){
        rev_num=0;
        for (int i=0; num!=0; i++){
            val=num%10;
            rev_num=rev_num*10+val;
            num/=10;
        }
        return rev_num;

    }
    public static void main(String[] args) {
        System.out.println("The reverse of the number using while is "+ while_reverse_num(72));
        System.out.println("The reverse of the number using do while is "+ do_while_reverse_num(72));
        System.out.println("The reverse of the number using for is "+ for_reverse_num(72));
    }
}