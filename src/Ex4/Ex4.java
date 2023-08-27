package Ex4;

public class Ex4 {
    public static void main(String[] args) {
        String s = "Aceasta este o propozitie ";
        String[] s1 = s.split(" ");
        System.out.println(findLongestWord(s1));
    }

    public static String findLongestWord(String[] s) {
        int maxLetters= 0;
        String longestWord = " ";
        for (int i = 0; i < s.length; i++) {
            if(maxLetters<s[i].length()){
                maxLetters = s[i].length();
                longestWord = s[i];
            }
        }
        return longestWord;
    }

}
