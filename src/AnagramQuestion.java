public class AnagramQuestion {
    public static void main(String[] args) {
        	/*
		Given two strings s and t ,
		write a java program to determine if t is an anagram of s.
		Example 1:
		a:3
		n:1
		g:1
		r:1
		m:1
		Input: s = "anagram", t = "nagaram"
		Output: true
		Example 2:
		Input: s = "rat", t = "car"
		Output: false
		Note:
		You may assume the string contains only lowercase alphabets.
		Anagram means, if two String are consist of the same letter
		Example: listen and silent
		 */
        String s = "anagram", t = "nagaram";
        System.out.println(checkAnagram(s, t) );
        System.out.println(checkAnagram("rat", "car") );
        System.out.println(checkAnagram("fatih", "faith") );
        System.out.println(checkAnagram("fatih", "taf") );
        System.out.println(checkAnagram("fatih", "tif") );
        System.out.println(checkAnagram("kalem", "kelam"));
        System.out.println(checkAnagram("listen", "silent") );
        System.out.println(checkAnagram("listeeeen", "sileeeent") );
    }

    public static boolean checkAnagram(String s, String t) {
        int count=0;
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
     return count==t.length()? true:false;
    }

}
