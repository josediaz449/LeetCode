package ReverseDigits;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
   public int reverse(int x) {
      int result=0;
      Boolean negative=false;
      String sx = Integer.toString(x);
      Stack<String> nums = new Stack<>();
      for(int i = 0; i< sx.length();i++){
         if(x<0&&i==0){
            negative=true;
         }
         else{
            nums.push(Character.toString(sx.charAt(i)));
         }
      }
      String sxs="";
      while(!nums.isEmpty()){
         sxs+=nums.pop();
      }
      //System.out.println(sxs);

      try {
         result=Integer.parseInt(sxs);
      }
      catch (NumberFormatException e){
         return 0;
      }
      if(negative){
         result=result*-1;
      }



      return result;
   }
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Solution s = new Solution();
      int x = in.nextInt();
      System.out.println(s.reverse(x));

   }
   public boolean isHappy(int n) {
      int result = n;
      int counter =0;
      while(!(result==1)){
         if(counter == 15){
            return false;
         }
         int newN=0;
         String stringN = result+"";
         for(int i=0;i<stringN.length();i++){
            newN += Math.pow(Integer.parseInt(Character.toString(stringN.charAt(i))),2);
         }
         result=newN;
         counter+=1;
      }
      return true;
   }

}
