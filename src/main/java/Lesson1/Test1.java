package Lesson1;

public class Test1 {
    public static void main(String[] args) {
        int[] mySum = {1, 5, 3, 7, 8, 2};
        new Test1().getSum(mySum);
        // System.out.println(mySum);
    }

    private void getSum(int[] mySum) {
        int start = 0;
        int end = mySum.length-1;
        int sum = 0;
        while (start > end){
            sum = mySum[start] + mySum[end] + sum;
            start++;
            end--;
        }}}

//    public static int[] myArr = {1, 5, 3, 7, 8, 2};
//    public  getMin(){
//
//    int min = 0;
//    for (int j: myArr){
//    if (j<min){
//    min = j;
//    }
//}}}

