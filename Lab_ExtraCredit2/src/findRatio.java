import java.util.Arrays;
public class findRatio {
    public static double findRatio(int[] arr){
        //initialize the values of the two smallesta nd two largest to the first element in the arrray
        int largestNum = arr[0];
        int largeNum = arr[0];
        int smallestNum = arr[0];
        int smallNum = arr[0];
        //This algorithm is linear because it runs n times, the length of the array
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            //checks for largest num, so if num is greater then largestNum
            //whatever the current largest num is will be the second largest
            if(num > largestNum){
                largeNum = largestNum;
                largestNum = num;
            }
            //checks if num is less than or equal to largest but greater than larger
            else if(num >= largeNum && num <= largestNum){
                largeNum = num;
            }
            //similarly, checks if num is smaller that smallestNum if so,
            //current smallest is 2nd smallest and smallest equal num
            if(num < smallestNum){
                smallNum = smallestNum;
                smallestNum = num;
            }
            //checks if num greater than smallest but smaller than small
            else if(num >= smallestNum && num <= smallNum){
                smallNum = num;
            }
        }
        //I used this to check the values because at first I didn't compare <= and >= so the two smallest
        //for the example given were 1 and 2 when it should be 1 and 1 so
        //System.out.println("smallest: " + smallestNum + " small:" + smallNum + " large: " + largeNum + " largest: " + largestNum);
        return (double)(largestNum+largeNum) / (double)(smallNum+smallestNum);
    }
}

