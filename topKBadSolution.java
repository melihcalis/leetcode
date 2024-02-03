import java.util.*;

public class topKBadSolution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(entryList, Map.Entry.comparingByValue());

        int topK[];
        topK = new int[k];

        for (int i=0; i<k; i++) {
            topK[i] = entryList.get(entryList.size()-k+i).getKey();
        } 

        return topK;
    }

    public static void main(String[] args) {
        topKBadSolution solution = new topKBadSolution();
        int[] nums = {1,1,1,2,2,3};

        System.out.println(Arrays.toString(solution.topKFrequent(nums, 2)));
    }
}
