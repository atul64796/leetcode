class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");

        for(String s : parts)
        {
            if(s.isEmpty() || s.equals("."))
            {
                continue;
            }

            if(s.equals(".."))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }else{
                st.push(s);
            }
        }
        return "/" + String.join("/",st);
    }
}