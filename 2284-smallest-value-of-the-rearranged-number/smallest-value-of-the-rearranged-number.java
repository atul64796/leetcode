import java.util.Arrays;

class Solution {
    public long smallestNumber(long num) {

        if(num == 0) return 0;

        String s = String.valueOf(Math.abs(num));

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        // Negative number
        if (num < 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }

            return -Long.parseLong(sb.toString());
        }

        // Positive number
        int i = 0;

        while (arr[i] == '0') {
            i++;
        }

        // Put first non-zero digit at the beginning
        char temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        return Long.parseLong(new String(arr));
    }
}