package com.ali.homework8;

public class squeezeTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Write first sentence:");
            String s1 = kb.nextLine();

            if ("apple".equals(s1))
                break;

            System.out.print("Write second sentence:");
            String s2 = kb.nextLine();

            System.out.println(squeeze(s1, s2));
        }
    }
    public static String squeeze(String s1, String s2) {
        int len = s1.length();
        char[] c = new char[len];
        int idx = 0;

        for (int i = 0; i < len; ++i) {
            char ch = s1.charAt(i);
            if (!s2.contains(ch + ""))
                c[idx++] = ch;
        }

        return String.valueOf(c, 0, idx);
    }
}
