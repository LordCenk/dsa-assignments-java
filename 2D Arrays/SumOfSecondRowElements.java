//Print out the sum of the numbers in the second row of the “nums” array.
public class Solution {
  public static void main(String[] args){
    int[][] nums = { {1,4,9}, {11,4,3},{2,2,3}};
    int sum = 0;
    //aum of 2nd row elements
    for(int j = 0; j<nums[0].length; j++){
      sum += nums[i][j];
    }
    System.out.println("sum is : " + sum);
  }
}
