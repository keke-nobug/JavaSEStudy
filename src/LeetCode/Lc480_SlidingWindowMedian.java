package LeetCode;

import java.util.ArrayList;
import java.util.function.ToDoubleFunction;

/**
* @BelongsProject: JavaSEStudy
* @BelongsPackage: LeetCode
* @Author: qzk
* @CreateTime: 2024/9/13 16:38
* @Description: TODO
* @Version: 1.0
*/
public class Lc480_SlidingWindowMedian {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        // double[] array = list.stream().mapToDouble(new ToDoubleFunction<Double>() {
        //     @Override
        //     public double applyAsDouble(Double value) {
        //         return value;
        //     }
        // }).toArray();
        //
        // System.out.println(array[1]);

        double[] array = list.stream().mapToDouble(Double::doubleValue).toArray();
        // int[] arrays1 = integersList.stream().mapToInt(Integer::intValue).toArray();

    }
}
