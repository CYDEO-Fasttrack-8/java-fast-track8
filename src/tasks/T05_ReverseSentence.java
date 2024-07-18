package tasks;

import java.util.Arrays;

public class T05_ReverseSentence {
    public static void main(String[] args) {
        String str = "Java is fun language";
        //language fun is Java
        String reversed = "";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        for(int i = strArr.length-1; i >= 0; i--) {
            reversed += strArr[i] +" ";
        }

        System.out.println("reversed = " + reversed.trim());

    }
}
