import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<Integer>();
        for(int num : nums) {
            mySet.add(num);
        }
        if(mySet.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] numsWithDuplicates = {1, 2, 3, 1};

        System.out.println(solution.containsDuplicate(numsWithDuplicates));
    }
}