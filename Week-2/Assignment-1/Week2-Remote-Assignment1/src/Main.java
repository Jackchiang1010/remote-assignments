public class Main {

    private static int max(int[] numbers) {
        // your code here, for-loop method preferred
        int Max = 0;

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] > Max){
                Max = numbers[i];
            }
        }
        return Max;
    }
    private static int findPosition(int[] numbers, int target) {
        // your code here, for-loop method preferred
        int position = -1;

        for(int index = 0; index < numbers.length; index++){

            if(numbers[index] == target){
                position = numbers[index];
                return index;
            }
        }
        return position;
    }

    public static void main(String[] args) {


        System.out.println(max(new int[] { 1, 2, 4, 5 })); // should print 5
        System.out.println(max(new int[] { 5, 2, 7, 1, 6 })); // should print 7

        System.out.println(findPosition(new int[] { 5, 2, 7, 1, 6 }, 5)); // should print 0
        System.out.println(findPosition(new int[] { 5, 2, 7, 1, 6 }, 7)); // should print 2
        System.out.println(findPosition(new int[] { 5, 2, 7, 7, 7, 1, 6 }, 7)); // should print 2 (the first position)
        System.out.println(findPosition(new int[] { 5, 2, 7, 1, 6 }, 8)); // should print -1
    }
}