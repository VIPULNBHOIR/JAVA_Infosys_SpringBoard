// File: com/infy/varargs/VarargsExercise1.java



import java.util.Arrays;

public class VarargsExercise1 {

    // Display all the items on the list
    public static void displayItems(String... items) {
        System.out.println("Items on the list:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    // Find the maximum value from the list
    public static int findMaxValue(int... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("List is empty");
        }

        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Sort the list in ascending order
    public static void sortList(int... values) {
        Arrays.sort(values);
        System.out.println("Sorted list in ascending order:");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Find the average of all the items on the list
    public static double findAverage(double... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("List is empty");
        }

        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        // Example usage
        displayItems("Apple", "Banana", "Orange", "Grapes");
        
        int maxValue = findMaxValue(25, 18, 36, 47, 29);
        System.out.println("Maximum value: " + maxValue);

        sortList(25, 18, 36, 47, 29);

        double average = findAverage(25.5, 18.2, 36.8, 47.3, 29.7);
        System.out.println("Average: " + average);
    }
}

/* Output: 

PS C:\Users\bhoir\OneDrive\Desktop\Info_> javac VarargsExercise1.java 
PS C:\Users\bhoir\OneDrive\Desktop\Info_> java VarargsExercise1
Items on the list:
Apple
Banana
Orange
Grapes

Maximum value: 47

Sorted list in ascending order:
18 25 29 36 47 

Average: 31.5

 */