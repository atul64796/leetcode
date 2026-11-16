class Solution {
    public boolean wordPattern(String pattern, String s) {
        


        String[] str = s.split(" ");

        if(pattern.length() != str.length)
        {
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();


        for(int i = 0; i < pattern.length(); i++)
        {
            char ch1 = pattern.charAt(i);
            String word = str[i];

            if(!Objects.equals(map1.put(ch1,i), map2.put(word,i)))
            {
                return false;
            }

        }
        return true;
    }
}