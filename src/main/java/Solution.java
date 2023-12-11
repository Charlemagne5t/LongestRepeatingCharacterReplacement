public class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        if(n == 1){
            return 1;
        }
        int maxWindowSize = 0;
        int[] freq = new int[26];
        int maxCurrentFreq = 0;
        int left = 0;
        for (int right = 0; right < n ; right++ ) {

            freq[s.charAt(right) - 'A']++;
            if(freq[s.charAt(right) - 'A'] > maxCurrentFreq){
                maxCurrentFreq = freq[s.charAt(right) - 'A'];
            }
            if(right - left + 1 > maxCurrentFreq + k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxWindowSize = Math.max(maxWindowSize, right - left + 1);
        }
        return maxWindowSize;
    }
}
