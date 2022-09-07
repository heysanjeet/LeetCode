package arrays.easy;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a']++;
            array[t.charAt(i) - 'a']--;
        }
        for (int n : array) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result=isAnagram("anagram","nagaram");
        System.out.println(result);
    }
}
