class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        
       Arrays.sort(strs);
       System.out.println(Arrays.toString(strs));

       String first = strs[0];
       String second = strs[strs.length -1];


       int index = 0;

       while(index <  first.length() && index < second.length())
       {
            if(first.charAt(index) == second.charAt(index))
            {
                index++;
            }else
            {
                break;
            }
       }

        return first.substring(0,index);
    }
}