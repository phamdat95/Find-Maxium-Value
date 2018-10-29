import java.util.Scanner;

public class findMaxiumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = 21;
        while (size > 20){
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
                System.out.println("Enter a size: ");
            }
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = index + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
