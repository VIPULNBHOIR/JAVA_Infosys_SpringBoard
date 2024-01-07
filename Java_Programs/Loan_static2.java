class Loan_static2 {
    private static int loanCounter;
    static int AccountNo,CustNo,loan_Duration;
    static float interest,LoanAmt;

    static{
        loanCounter=100;
    }

    Loan_static2(){
        ++loanCounter;
    }

    Loan_static2(int accountNo,int custNo,float loanAmt,int loan_duration,float Interest ){
        loanCounter++;
        AccountNo=accountNo;
        CustNo=custNo;
        LoanAmt=loanAmt;
        interest=Interest;

    
    }
    static int getCustNo(){
        return CustNo;
    }
    static int getLoanNo(){
        return loanCounter;
    }
    static int getAccountNo(){
        return AccountNo;
    }
    static float getLoanAmt(){
        return LoanAmt;
    }   
    static float getinterest(){
        return interest;
    }
    static int getLoan_Duration(){
        return loan_Duration;
    }


    static void setAccountNo(int accountNo){
        AccountNo=accountNo;
    }
    static void setCustNo(int custNo){
        CustNo=custNo;
    }
    static void setLoanAmt(float loanAmt){
        LoanAmt=loanAmt;
    }
    static void setloan_Duration(int loan_duration){
        loan_Duration=loan_duration;
    }
    static void setLoanNo(int loanNo){
        loanCounter=loanNo;
    }
    static void setinterest(float Interest){
        interest=Interest;
    }

    public static void main(String[] args) {

        //Loan 1
        Loan_static2 l1=new Loan_static2 ();
        setCustNo(1);
        setAccountNo(401);
        setLoanNo(loanCounter);
        setinterest(200.55f);
        setLoanAmt(50000.00f);
        setloan_Duration(1);
        System.out.println("Customer No: "+ CustNo);
        System.out.println("Account No: "+ AccountNo);
        System.out.println("Loan Amt: "+ LoanAmt);
        System.out.println("Interest Amt: "+ interest);
        System.out.println("Loan Duration: "+ loan_Duration);
        System.out.println();

        //Loan 2
        Loan_static2 l2=new Loan_static2(2, 402, 50000.755f, 2, 500.30f);
        System.out.println("Customer No: "+ CustNo);
        System.out.println("Account No: "+ AccountNo);
        System.out.println("Loan Amt: "+ LoanAmt);
        System.out.println("Interest Amt: "+ interest);
        System.out.println("Loan Duration: "+ loan_Duration);
        System.out.println();
        System.out.println("Total Number of Loans: "+ loanCounter);
    }

    
}

/*

PS C:\Users\bhoir\OneDrive\Desktop\Info_> javac .\Loan_static2.java
PS C:\Users\bhoir\OneDrive\Desktop\Info_> java Loan_static2        
Customer No: 1
Account No: 401
Loan Amt: 50000.0
Interest Amt: 200.55
Loan Duration: 1

Customer No: 402
Account No: 2
Loan Amt: 50000.754
Interest Amt: 500.3
Loan Duration: 1

Total Number of Loans: 102

*/