package LongestSubstringWORepeatingChar;

import java.util.ArrayList;

public class LongestSubstringWORepeatingChar {
   public LongestSubstringWORepeatingChar() {
   }

   public int lengthOfLongestSubstring(String s) {
      String subString;
      ArrayList<Integer> size = new ArrayList<>();
      int result = 0;
      int startIndex=0;
      if(s.isEmpty()){
         return 0;
      }
      else if(s.length()==1){
         return 1;
      }
      else {
         for (int i = 0; i < s.length(); i++) {
            subString = s.substring(startIndex, i);
            String charAt = Character.toString(s.charAt(i));
            if (subString.contains(charAt)) {
               startIndex = i;
               size.add(subString.length());
            }
            else if(i==s.length()-1){
               size.add(subString.length());
            }
         }
         if (size.size() > 1) {
            for (int i = 0; i < size.size() - 1; i++) {
               if (size.get(i) > size.get(i + 1)) {
                  result = size.get(i);
               } else {
                  result = size.get(i + 1);
               }
            }
         } else {
            result = size.get(0);
         }
         return result;
      }
   }
   public static void main(String[] args){
      LongestSubstringWORepeatingChar main = new LongestSubstringWORepeatingChar();
      System.out.println(main.lengthOfLongestSubstring("au"));
   }
}
