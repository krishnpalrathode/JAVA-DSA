//package Arrays;
//class MinMax {
//    public Pair<Long, Long> getMinMax(int[] arr) {
//        Long min = (long) arr[0];
//        Long max = (long) arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (min > (long) arr[i]) {
//                min = (long) arr[i];
//            }
//            if (max < (long) arr[i]) {
//                max = (long) arr[i];
//            }
//        }
//        return new Pair<>(min, max);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 5, 30, 15};
//        MinMax solution = new MinMax();
//        Pair<Long, Long> result = MinMax.getMinMax(arr);
//        System.out.println("Minimum value: " + result.getFirst());
//        System.out.println("Maximum value: " + result.getSecond());
//    }
//}
