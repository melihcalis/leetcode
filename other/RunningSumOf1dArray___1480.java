import java.util.Arrays;

class RunningSumOf1dArray___1480 {
    public int[] runningSum(int[] nums) {
        int[] numbers = new int[nums.length];
        numbers[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            numbers[i] = nums[i] + numbers[i-1];
        }
        return numbers;
    }

    public static void main(String[] args) {

        RunningSumOf1dArray___1480 solution = new RunningSumOf1dArray___1480();


        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 1, 1, 1, 1};
        int[] test3 = {3, 1, 2, 10, 1};


        System.out.println("Input: " + Arrays.toString(test1) + " -> Running Sum: " + Arrays.toString(solution.runningSum(test1)));
        System.out.println("Input: " + Arrays.toString(test2) + " -> Running Sum: " + Arrays.toString(solution.runningSum(test2)));
        System.out.println("Input: " + Arrays.toString(test3) + " -> Running Sum: " + Arrays.toString(solution.runningSum(test3)));
    }
}