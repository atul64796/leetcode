class Solution {
    public String longestCommonPrefix(String[] strs) {

       
        if (strs == null || strs.length == 0) {
            return "";
        }
        
       Arrays.sort(strs);
       
        if (strs == null || strs.length == 0) {
            return "";
        }
        
       Arrays.sort(strs);
       String first = strs[0];
       String Second = strs[strs.length-1];

       System.out.println(Second);
       
       int index = 0;

       while(index < first.length() && index < Second.length())
       {

            if(first.charAt(index) == Second.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
       }
       return first.substring(0,index);
    }
}