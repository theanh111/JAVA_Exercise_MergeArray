import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] firstArray = new int[3];
        int[] secondArray = new int[3];
        int[] thirdArray = new int[firstArray.length + secondArray.length];

        // Input and display first array's element:
        System.out.println("Enter element for first array (Only 3 elements):");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("Element " + i + ": ");
            firstArray[i] = input.nextInt();
        }
        System.out.println("First Array is:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + "\t");
        }

        System.out.println();

        // Input and display second array's element:
        System.out.println("Enter element for second array (Only 3 elements):");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Element " + i + ": ");
            secondArray[i] = input.nextInt();
        }
        System.out.println("Second Array is:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + "\t");
        }

        // Gan phan tu Mang 1 cho Mang 3:
        for (int i = 0; i < firstArray.length; i++) {
            thirdArray[i] = firstArray[i];
        }

        // Gan phan tu Mang 2 cho Mang 3:
        for (int i = 0, j = secondArray.length; i < secondArray.length; i++, j++) {
            thirdArray[j] = secondArray[i];

        }

        System.out.println();

        // Display third array:
        System.out.println("Third Array is:");
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i] + "\t");
        }
    }
}
