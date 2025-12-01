package com.gloriane;

public class StringDemo {
    public static String ex1 = "Java";

    public static String ex2 ="Long example sentence";

    public static String ex3 ="Even long example sentence";

    public static String ex4 ="Ok this is not as long!";

    public static String ex5 ="CAPS EQUALS SCREAMING";

    public static String ex6 ="caps equals screaming";

    public static String ex7 ="Java is the worst programming language!";

    public static String ex8 ="\tj\ta\tv\ta\t";

    public static void main(String[] args) {
        System.out.println(ex1.length());
        System.out.println(ex2.charAt(6));
        System.out.println(ex3.indexOf("o"));
        System.out.println(ex4.substring(0,22));
        System.out.println(ex5.toLowerCase());
        System.out.println(ex6.toUpperCase());
        System.out.println(ex7.replace("worst", "best"));
        System.out.println(ex8.trim());
    }
}

