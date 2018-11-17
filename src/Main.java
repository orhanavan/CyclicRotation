public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int times = 4;

        // print first time
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        ///

        Solution s = new Solution();
        array = s.solution(array, times);

        // print result
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.print(", " + times);
    }
}
