import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayPartition {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int partitionSize = 2;
        int[] partitionOrder = {3, 2, 1};

        int[] result = partitionAndMerge(array, partitionSize, partitionOrder);

        System.out.println("Output:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] partitionAndMerge(int[] array, int partitionSize, int[] partitionOrder) {
        List<List<Integer>> partitions = new ArrayList<>();

        // Partition the array
        for (int i = 0; i < array.length; i += partitionSize) {
            List<Integer> partition = new ArrayList<>();
            for (int j = i; j < Math.min(i + partitionSize, array.length); j++) {
                partition.add(array[j]);
            }
            partitions.add(partition);
        }

        // Sort the partitions based on the given order
        Collections.sort(partitions, (p1, p2) -> {
            for (int i = 0; i < Math.min(p1.size(), p2.size()); i++) {
                int order1 = partitionOrder[i] - 1;
                int order2 = partitionOrder[i] - 1;
                int compare = Integer.compare(p2.get(order2), p1.get(order1));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(p2.size(), p1.size());
        });

        // Merge the partitions into a single array
        List<Integer> merged = new ArrayList<>();
        for (List<Integer> partition : partitions) {
            merged.addAll(partition);
        }

        // Convert the List to an array
        int[] result = new int[merged.size()];
        for (int i = 0; i < merged.size(); i++) {
            result[i] = merged.get(i);
        }

        return result;
    }
}
