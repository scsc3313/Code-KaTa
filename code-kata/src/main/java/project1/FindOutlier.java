package project1;

import java.util.Arrays;

/**
 * Created by HSH on 16. 6. 19..
 */
public class FindOutlier {


    public static int find(int[] integers) {
//        첫번째 방법
//        int oddCount = 0, evenCount = 0;
//        int oddIndex = 0, evenIndex = 0;
//
//        for (int i = 0; i < integers.length; i++) {
//            if (integers[i] % 2 == 0 || integers[i] == 0) {
//                evenCount++;
//                evenIndex = i;
//            } else {
//                oddCount++;
//                oddIndex = i;
//            }
//        }
//        if (oddCount == 1)
//            return integers[oddIndex];
//        else if (evenCount == 1)
//            return integers[evenIndex];
//        else
//            return 0;

        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel()
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
