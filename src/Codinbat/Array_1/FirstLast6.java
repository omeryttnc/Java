package Codinbat.Array_1;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.


firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */
public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
if(nums.length>=1){
    if(nums[0]==6 || nums[nums.length-1]==6){
        return true;
    }
}
    return false;
    }







//    public static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//   int[] myInteger = getIntegers(5);
//   if(myInteger.length>0){
//       if(myInteger[0] ==6){
//           System.out.println("true");
//       }
//       if(myInteger[myInteger.length-1] == 6){
//           System.out.println("true");
//       }else{
//           System.out.println("false");
//       }
//   }else{
//       System.out.println("enter at least one digit");
//   }
//
//    }
//    public static int [] getIntegers(int capacity ){
//        int[] array = new int [capacity];
//        System.out.println("Enter " + capacity + " integer values\r");
//
//        for(int i = 0; i<array.length ; i++ ){
//            array[i] = scanner.nextInt();
//
//        }
//        return array;
//    }


}
