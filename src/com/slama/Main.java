package com.slama;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /* Given a string, return a string where for every char in the original, there are two chars.

     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */

     public String doubleChar(String str) {
        String result = "";

        for(int i=0; i < str.length(); i++) {
             result = result + str.substring(i, i+1) + str.substring(i, i+1);

         }
         return result;
     }


     /*  Return the number of times that the string "hi" appears anywhere in the given string.

      * countHi("abc hi ho") → 1
      * countHi("ABChi hi") → 2
      * countHi("hihi") → 2
      * */

    public int countHi(String str) {

        int count = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.substring(i, i+2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    /* Return true if the string "cat" and "dog" appear the same number of times in the given string.

     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     *  */

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for(int i=0; i<str.length()-2; i++) {
            if(str.substring(i, i+3).equals("cat")) {
                catCount++;
            }
            if(str.substring(i, i+3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    /* Return the number of times that the string "code" appears anywhere in the given string, except
     * we'll accept any letter for the 'd', so "cope" and "cooe" count.

     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     *countCode("cozexxcope") → 2
     * */

    public int countCode(String str) {
        int count = 0;

        for(int i=0; i<str.length()-3; i++) {
            if(str.substring(i, i+2).equals("co") && str.substring(i+3, i+4).equals("e")) {
                count++;
            }
        }
        return count;
    }

    /* Given two strings, return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.

     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     * */

    public boolean endOther(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    /* Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     * */

    public boolean bobThere(String str) {
        for(int i=0; i<str.length()-2; i++) {
            if(str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")) {
                return true;
            }
        }
        return false;
    }

    /* Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
     * You may assume that n is between 0 and the length of the string, inclusive.

     * repeatEnd("Hello", 3) → "llollollo"
     * repeatEnd("Hello", 2) → "lolo"
     *repeatEnd("Hello", 1) → "o"
     * */

    public String repeatEnd(String str, int n) {
        String result = str.substring(str.length()-n);

        for(int i=0; i<n-1; i++) {
            result = result + str.substring(str.length()-n);
        }
        return result;
    }

}
