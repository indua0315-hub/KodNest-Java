
public class pgm1{

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        System.out.println("\nSum of elements: " + sum);
    }
}
