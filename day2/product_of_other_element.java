import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayExceptSelf {

    public static int[] getProductArray(int[] nums) {
        int n = nums.length;

        // Initialize arrays to store prefix and suffix products
        int[] prefixProducts = new int[n];
        int[] suffixProducts = new int[n];

        // Calculate prefix products
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            prefixProducts[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Calculate suffix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            suffixProducts[i] = suffixProduct;
            suffixProduct *= nums[i];
        }

        // Calculate the final result by multiplying prefix and suffix products
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] inputArray = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int[] outputArray = getProductArray(inputArray);

        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Output Array: " + Arrays.toString(outputArray));
    }
}