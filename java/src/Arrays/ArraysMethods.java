package Arrays;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysMethods {
    public static void main(String[] args) {
        int custom[] = {27,89,34,-5,34};
        Integer [] wrapperArray = {2,1,234,6,2,5,26};
        int[] array1d = new int[]{1,-3,6,7,2,7,8,9,-5};
         int[][] array2d = {{1,3,2,6,7}, {2,2,7}, {7, 8, 9},};
        IntUnaryOperator intUnaryOperator = operand -> 4;
        IntBinaryOperator intBinaryOperator = (left, right) -> {
            left = 1;
            right = 4;
            return left+right;
        };
        System.out.println("binary search: " + Arrays.binarySearch(array1d,3));
        System.out.println("compare: "+ Arrays.compare(array1d,custom));
        System.out.println("compare unsigned: "+ Arrays.compareUnsigned(array1d,custom));
        System.out.println("copy of : "+ Arrays.toString(Arrays.copyOf(custom, 2)));
        System.out.println("copy of range: "+(Arrays.toString(Arrays.copyOfRange(custom, 0, 3))));
        System.out.println("equals: "+ Arrays.equals(custom,array1d));
        System.out.println("hashcode: "+ Arrays.hashCode(custom));
        System.out.println("mismatch: "+ Arrays.mismatch(custom,array1d));
        System.out.println("spliterator: "+Arrays.spliterator(custom));
        System.out.println("stream: " + Arrays.stream(custom));
        System.out.println("as list: " + Arrays.asList(custom));
        System.out.println("deep equals: "+ Arrays.deepEquals(wrapperArray,wrapperArray));
        System.out.println("deep hashcode: " + Arrays.deepHashCode(wrapperArray));
        System.out.println("deep to String: "+Arrays.deepToString(array2d));
        System.out.println("to String: " + Arrays.toString(array2d));
        Arrays.fill(custom,7);
        Arrays.parallelSort(custom,4,5);
        Arrays.parallelSetAll(custom,intUnaryOperator);
        Arrays.parallelPrefix(custom,1,4,intBinaryOperator);
        Arrays.setAll(custom,intUnaryOperator);
        Arrays.sort(array1d);

    }}
