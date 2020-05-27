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




        System.out.println(checkAnagram(s, t) );
        System.out.println(checkAnagram("rat", "car") );
        System.out.println(checkAnagram("fatih", "faith") );
        System.out.println(checkAnagram("fatih", "taf") );
        System.out.println(checkAnagram("fatih", "tif") );
        System.out.println(checkAnagram("kalem", "kelam"));
        System.out.println(checkAnagram("listen", "silent") );
        System.out.println(checkAnagram("listeeeen", "sileeeent") );
//My contribution1

        System.out.println(checkAnagram("list", "ist") );
        System.out.println(checkAnagram("sibel", "issabel") );

        String s = "anagram", t = "nagaram";
        System.out.println(checkAnagram1(s, t) );
        System.out.println(checkAnagram1("rat", "car") );
        System.out.println(checkAnagram1("fatih", "faith") );
        System.out.println(checkAnagram1("fatih", "taf") );
        System.out.println(checkAnagram1("fatih", "tif") );
        System.out.println(checkAnagram1("listen", "silent") );
        System.out.println(checkAnagram1("merve","evre"));

    }

    public static boolean checkAnagram(String s, String t) {
        int count=0;
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    count++;
                    break;

		 */
        String str1 = "anagran";
        String str2 = "gramana";
        int count2 = 0;
        int count1 = 0;
        int count = 0;
        if (str1.length() == str2.length()) {
            OUTER:
            for (int i = 0; i < str1.length(); i++) {
                count = i;
                INNER:
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(i) == str1.charAt(j))
                        count1++;
                    if (str1.charAt(i) == str2.charAt(j))
                        count2++;

                }
                if (count1 != count2) break OUTER;

            }

        }  
        if (count < str1.length() - 1)
            System.out.println(str1 + " and " + str2 + " are \"anagram\": " + false);
        else System.out.println(str1 + " and " + str2 + " are \"anagram\": " + true);
    }}
