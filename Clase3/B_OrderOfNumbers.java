package EjArgProg.Clase3;

import java.util.Arrays;

public class B_OrderOfNumbers {
    public int[] ascending(int a, int b, int c) {
        int[] arr = {a, b, c};
        int num;
        //Ordenar de forma ascendente
        if (a > b) {
            num = a;
            a = b;
            b = num;
        }
        if (b > c) {
            num = b;
            b = c;
            c = num;
        }
        if (a > b) {
            num = a;
            a = b;
            b = num;
        }
        return new int[] {a, b, c};
    }

    public int[] decreasing(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        int[] result = new int[3];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[index] = nums[i];
            index++;
        }
        return result;
    }
}
