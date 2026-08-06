class Solution {
    public boolean isVowels(char c){
        return  c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int left = 0;
        int maxVowel = 0;
        int vowel = 0;
        for (int right = 0; right < s.length(); right++){
            if(isVowels(s.charAt(right))){
                vowel++;
            }
            if((right - left + 1) == k){
                maxVowel = Math.max(maxVowel, vowel);
                if(isVowels(s.charAt(left))){
                vowel--;
                }
                left++;
            }
        }
        return maxVowel;
    }
}