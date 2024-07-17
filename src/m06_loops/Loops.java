package m06_loops;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        // can be replaced with:

        for(int i = 0; i < 5; i++){
            System.out.println(i + "Hello");
        }

        String str = "intellij";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " -> " + str.charAt(i));
        }
                    //7                0     -1
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(i + " -> " + str.charAt(i));
        }

        /*
            initialization: int i = 0;
            termination condition:  i < 5
            update: i++
         */

        // without brackets
//        for(int i = 0; i < 5; i++)
//            System.out.println("Hello");

        System.out.println("------------------------------------------------------");

        String s = "aaaabaaabaab";
        int count = 0;
        while(s.contains("a")){
            count++;
            s = s.replaceFirst("a","");
        }
        System.out.println(count);

//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'a') {
//                count++;
//            }
//        }
        System.out.println("count = " + count);

        String str2 = "hello java";
        int len1 = str2.length();
        str2 = str2.replace("a","");
        count = len1 - str2.length();
        System.out.println("count = " + count);

        System.out.println("------------------------------------------------------");

        String s2 = "abcdefz";
        int count2 = 0;
        do {
            count2++;
            s2 = s2.replaceFirst("z", "");
        }while(s2.contains("z"));

        System.out.println(count2);

        System.out.println("------------------------------------------------------");

//        for(DATATYPE name : DATA STRUCTURE){
//
//        }

        // We will recap array and collections in later days and use this loop. Remember the main idea of this loop type is to iterate through each element of the given data structure, from beginning to end. The element is represented as the given name during each iteration

        for(int i = 0; i < 5; i++) { // outer loop
            for(int j = 0; j < 3; j++) { // inner loop
                System.out.println("i " + i + " j " + j);
            }
        }

        String word1 = "abcdef";
        String word2 = "ghabpoe";

        //find common characters
        //output = abe

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    System.out.println(word1.charAt(i));
                }
            }
        }



    }
}
