class Enh_ForLoop{
    static int[] marks=new int[5];

    static void PrintMarks(){
        System.out.println("Marks of five Subjects are as follow");
        for(int marker:marks){
            System.out.print(marker+", ");
        }
    }
    static void FillMarks(int subNo, int mark){
        marks[subNo-1]=mark;
    }

    public static void main(String[] args) {
        //calling static method to fill marks in array one by one
        FillMarks(1, 80);
        FillMarks(2, 90);
        FillMarks(3, 88);
        FillMarks(4, 85);
        FillMarks(5, 78);

        //calling static method to print marks from the array
        PrintMarks();
    }
}