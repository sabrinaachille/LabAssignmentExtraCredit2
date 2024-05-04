//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Develop an algorithm (Java or C++) that can
        find the ratio of the sum of the largest two numbers
        divided by the sum of the smallest two numbers in an array.
        The solution should be linear or better.*/

        //For example: If the input is
        int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        //The ratio is (450+321) / (1+1) = 385.5
        System.out.println("\nResult: " + findRatio.findRatio(a));
    }
}