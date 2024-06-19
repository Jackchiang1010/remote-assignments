import java.util.Arrays;

public class Main {
    private static int countAandB(char []input) {
        // your code here
        int count = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i] == 'a' || input[i] == 'b'){
                count++;
            }
        }
        return count;
    }
    private static int[] toNumber(char []input) {
        // your code here
        int[] toNumber = new int[input.length];

        for(int i = 0; i < input.length; i++){
            if(input[i] == 'a'){
                toNumber[i] = 1;
            } else if (input[i] == 'b') {
                toNumber[i] = 2;
            } else if (input[i] == 'c') {
                toNumber[i] = 3;
            } else if (input[i] == 'd') {
                toNumber[i] = 4;
            } else if (input[i] == 'e') {
                toNumber[i] = 5;
            } else {
                System.out.println("errortype");
            }
        }
        return toNumber;
    }
    public static void main(String[] args) {
        char[] input1 = {'a', 'b', 'c', 'a', 'c', 'a', 'c'};
        System.out.println(countAandB(input1)); // should print 4 (3 ‘a’ letters and 1 ‘b’ letter)
        System.out.println(Arrays.toString(toNumber(input1))); // should print [1, 2, 3, 1, 3, 1, 3]
        char[] input2 = {'e', 'd', 'c', 'd', 'e'};
        System.out.println(countAandB(input2)); // should print 0
        System.out.println(Arrays.toString(toNumber(input2))); // should print [5, 4, 3, 4, 5]
    }

}