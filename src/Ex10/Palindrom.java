package Ex10;

import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        char[] letters = {'a','s','d','s','a','s'};
        System.out.println(Arrays.toString(getMaxSubPalindrom(letters)));
        System.out.println(getMaxSubPalindrom2(letters));

        //parcurg fiecare litera
            //pentru litera curenta:
            //atata timp cat nu am aj la capatul din stanga si nu am ajuns la capatul din dreapta si litere sunt egale
                 //daca lungimea de la st la dreapta este mai mare decat maxLength
                     //maxLength devine lungimea
                     //retin capetele
                 //ma duc in stanga
                 //ma duc in dreapta


    }

    public static String getMaxSubPalindrom2(char[] letters){
        //parcurg fiecare litera
        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < letters.length; i++) {
            int left = i;
            int right = i;
            if ((i+1) < letters.length && letters[i] == letters[i+1]){
              right = i+1;
            }
            //atata timp cat nu am aj la capatul din stanga si nu am ajuns la capatul din dreapta si litere sunt egale
            while (left >= 0 && right < letters.length && letters[left]==letters[right] ){
                //daca lungimea de la st la dreapta este mai mare decat maxLength
                if ((right-left+1)>maxLength){
                    //maxLength devine lungimea
                    //retin capetele
                    maxLength = right-left+1;
                    start = left;
                    end = right;

                }
                //ma duc in stanga
                //ma duc in dreapta
                left--;
                right++;
            }
        }
        return new String(Arrays.copyOfRange(letters, start, end+1));

    }


    public static char[] getMaxSubPalindrom(char[] letters){
        int maxLength = 0;
        int start =0;
        int end = 0;
        for (int i = 0; i < letters.length; i++) {
            for( int j = i; j< letters.length; j++){
                //luam secventa de la i la j

                if (isPalindrom(i, j, letters) && (j-i+1) > maxLength){
                    maxLength = j-i+1;
                    start = i;
                    end = j;
                }
            }
        }
//        char[] result = new char[maxLength];
//        int position = 0;
//        for (int i = start; i <= end ; i++) {
//            result[position] = letters[i];
//            position++;
//        }

        return Arrays.copyOfRange(letters,start,end+1);
        //return result;

    }

    public static boolean isPalindrom (int i, int j, char[] letters){
        while (i<j){
            if (letters[i]!= letters[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
