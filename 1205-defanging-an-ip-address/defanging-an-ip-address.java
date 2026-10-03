class Solution {
    public String defangIPaddr(String address) {

        StringBuilder ans = new StringBuilder();
        
        for(char arr : address.toCharArray())
        {
            if(arr == '.')
            {
                ans.append("[.]");
            }
            else
            {
                ans.append(arr);
            }
        }
        return ans.toString();
    }
}