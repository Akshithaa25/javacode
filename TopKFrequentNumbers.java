import java.util.*;

public class TopKFrequentNumbers {

    private static int[] numbers;

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 4, 5, 2, 6, 1};
        int k1 = 2;
        findTopKFrequentNumbers(arr1, k1); // Output: 4 1
        
        // int[] arr2 = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        // int k2 = 4;
        // findTopKFrequentNumbers(arr2, k2); // Output: 5 11 7 10
    }

    public static void findTopKFrequentNumbers(int[] arr, int k) {
        numbers = arr;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Use a priority queue to get top K frequent numbers
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : b.getValue() - a.getValue()
        );
        
        pq.addAll(frequencyMap.entrySet());
        
        // Print top K frequent numbers
        int count = 0;
        while (count < k) {
            System.out.print(pq.poll().getKey() + " ");
            count++;
        }
        System.out.println();
    }
}