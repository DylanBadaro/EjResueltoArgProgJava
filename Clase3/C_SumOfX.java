package EjArgProg.Clase3;

public class C_SumOfX {
    public int addAllGreaterThanX(int[] nums, int x) {
        int result = 0;
        for (int num : nums) {
            if (num > x) {
                result += num;
            }
        }
        return result;
    }
}
