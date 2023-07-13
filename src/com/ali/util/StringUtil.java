/***
 *  FILE            : StringUtil.java
 *  AUTHOR          : Ali Mehmet Çetinkol
 *  LAST UPDATE     : 21.05.2023
 *
 *  StringUtil class has some string methods to help us.
 *
 *  Copyleft(c) 1997 by Ali Mehmet Çetinkol All Rights Free
 */

package com.ali.util;
import java.util.Random;


public class StringUtil {
    private StringUtil()
    {
    }
    /**
     *  The len received by the second parameter of the padLeading method, with the first parameter
     *  If it is greater than the length of the text it receives, the text is filled with the character
     *  it receives with the third parameter from the left and
     *  will return a new String reference.
     * @param s
     * @param len
     * @param ch
     * @return Returns the string and the character that will come before it
     */
    public static String padLeading(String s, int len, char ch)
    {
        int length = s.length();

        return len <= length ? s : repeat(len - length, ch) + s;
    }

    /**
     * This overload of padLeading with 2 parameter.
     * @param s
     * @param len
     * @return Returns the string and the character that will come before it
     */
    public static String padLeading(String s, int len)
    {
        return padLeading(s, len, ' ');
    }

    /**
     *  The len received by the second parameter of the padLeading method, with the first parameter
     *  If it is greater than the length of the text it receives, the text is filled with the character
     *  it received with the third parameter from the right and
     *  will return a new String reference
     * @param s
     * @param len
     * @param ch
     * @return Returns the string and the next character to the right
     */
    public static String padTrailing(String s, int len, char ch)
    {
        int length = s.length();

        return len <= length ? s : s + repeat(len - length, ch);
    }
    /**
     * This overload of padTrailing with 2 parameter.
     * @param s
     * @param len
     * @return Returns the string and the next character to the right
     */
    public static String padTrailing(String s, int len)
    {
        return padTrailing(s, len, ' ');
    }
    /**
     * Method for multiplexing a character
     * @param count
     * @param ch
     * @return character
     */
    public static String repeat(int count, char ch)
    {
        return String.format("%" + count + "c", ' ').replace(' ', ch);
    }
    /**
     * The method that finds a word, phrase, or sequence that reads the same backwards as forwards.
     * @param s
     * @return true or false
     */
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = Character.toLowerCase(s.charAt(left));

            if(!Character.isLetter(cLeft)) {
                ++left;
                continue;
            }

            char cRight = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetter(cRight)) {
                --right;
                continue;
            }

            if(cLeft != cRight)
                return false;

            ++left;
            --right;
        }

        return true;
    }
    /**
     * The method that finds a word, phrase, or sequence that
     * reads the same backwards as forwards but it finds the longest one.
     * @param s
     * @return true or false
     */
    public static String getLastLongestPalindrome(String s)
    {
        String result = "";

        int end = s.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = s.substring(begin++, end);

                if(str.length() > 1 && isPalindrome(str) && result.length() < str.length())
                    result = str;
            }

            --end;
        }

        return result;
    }
    /**
     * Returns a text consisting of n randomly generated Turkish alphabet characters for
     * an n value of int type that it takes with its parameter.
     * @param r
     * @param n
     * @return string
     */
    public static String getRandomTextTR(java.util.Random r, int n)
    {
        return getRandomText(r, n, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
    }
    /**
     * Returns a text consisting of n randomly generated Turkish alphabet characters for
     * an n value of int type that it takes with its parameter.
     * @param n
     * @return string
     */
    public static String getRandomTextTR(int n)
    {
        return getRandomTextTR(new java.util.Random(), n);
    }
    /**
     * Returns a text consisting of n randomly generated English alphabet characters for
     * an n value of int type that it takes with its parameter.
     * @param r
     * @param n
     * @return string
     */
    public static String getRandomTextEN(java.util.Random r, int n)
    {
        return getRandomText(r, n, "abcdefghijklmnopqrstuwxvyzABCDEFGHIJKLMNOPQRSTUWXVYZ");
    }
    /**
     * Returns a text consisting of n randomly generated English alphabet characters for
     * an n value of int type that it takes with its parameter.
     * @param n
     * @return string
     */
    public static String getRandomTextEN(int n)
    {
        return getRandomTextEN(new java.util.Random(), n);
    }
    /**
     *
     * @param count
     * @param min
     * @param max
     * @return string
     */
    public static String[] getRandomTextsTR(int count, int min, int max)
    {
        return getRandomTextsTR(new Random(),count,min,max);
    }
    /**
     *
     * @param r
     * @param count
     * @param min
     * @param max
     * @return string
     */
    public static String[] getRandomTextsTR(Random r, int count, int min, int max)
    {
        String [] result = new String[count];
        for(int i =0;i< count;++i){
            result[i] = getRandomTextTR(r,r.nextInt(min,max+1));
        }
        return result;
    }
    /**
     *  It helps getRandomTextEN and getRandomTextTR for source text.
     * @param r
     * @param n
     * @param sourceText
     * @return string
     */
    public static String getRandomText(java.util.Random r, int n, String sourceText)
    {
        String str = "";
        int len = sourceText.length();

        for(int i = 0; i < n; ++i)
            str += sourceText.charAt(r.nextInt(len));

        return str;
    }
    /**
     * The program that throws only the space characters at the beginning of a text it receives with its parameter.
     * @param str
     * @return string
     */
    public static String trimLeading(String str)
    {
        int i;
        int len = str.length();

        for (i = 0; i < len && Character.isWhitespace(str.charAt(i)); i++)
            ;

        return str.substring(i);
    }
    /**
     * The program that discards only the space characters at the end of a text it receives with its parameter.
     * @param str
     * @return string
     */
    public static String trimTrailing(String str)
    {
        int i;

        for (i = str.length() - 1; i >= 0 && Character.isWhitespace(str.charAt(i)); --i)
            ;

        return str.substring(0, i + 1);
    }
    /**
     * It writes the first letter of a text that it receives with the parameter in capital letters and
     * the remaining letters in lowercase, and writes it in a way that the first non-space letter is capitalized,
     * even if there are spaces at the beginning of the text.
     * @param str
     * @return string
     */
    public static String capitalizeWS(String str)
    {
        int i;
        int len = str.length();

        for (i = 0; i < len && Character.isWhitespace(str.charAt(i)); i++)
            ;

        return i == len ? str : str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1).toLowerCase();
    }
    /**
     * Returns a text so that the first letter of a text is uppercase,
     * the rest of the letters are lowercase and non-letter characters remain the same.
     * @param str
     * @return string
     */
    public static String capitalize(String str)
    {
        return str.isEmpty() ? "": Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }
    /**
     * Returns the reverse of a text it receives with its parameter.
     * @param str
     * @return string
     */
    public static String reverse(String str)
    {
        String s = "";

        for (int i = str.length() - 1; i >= 0; --i)
            s += str.charAt(i);

        return s;
    }
    /**
     * Returns how many of the two texts are in the first of the two texts.
     * @param s1
     * @param s2
     * @return int
     */
    public static int countString(String s1, String s2)
    {
        int count = 0;

        for(int i = -1; (i = s1.indexOf(s2, i + 1)) != -1; ++count)
            ;

        return count;
    }
    /**
     * Returns how many of the two texts are in the first of the two texts.
     * But ignore the uppercase and lowercase.
     * @param s1
     * @param s2
     * @return int
     */
    public static int countStringIgnoreCase(String s1, String s2)
    {
        return countString(s1.toLowerCase(), s2.toLowerCase());
    }
    /**
     * It returns combination of two string-type arrays to new array reference.
     * @param s
     * @param delimiter
     * @param removeEmpties
     * @return string
     */
    public static String join(String [] s, String delimiter,boolean removeEmpties)
    {
        String str = "";

        for(int i=0;i<s.length;i++){
            if(removeEmpties && s[i].isBlank())
                continue;

            str += s[i] + delimiter;
        }
        return str.substring(0,str.length()-delimiter.length());
    }
    /**
     * Overload method
     * @param s
     * @param delimiter
     * @return string
     */
    public static String join(String [] s, char delimiter)
    {
        return join(s,delimiter + "");
    }
    /**
     * Overload method
     * @param s
     * @param delimiter
     * @return string
     */
    public static String join(String [] s, String delimiter)
    {
        return String.join(delimiter,s);
    }
    /**
     * Overload method
     * @param s
     * @param delimiter
     * @param removeEmpties
     * @return string
     */
    public static String join(String [] s, char delimiter,boolean removeEmpties)
    {
        return join(s,delimiter + "",removeEmpties);
    }
}
