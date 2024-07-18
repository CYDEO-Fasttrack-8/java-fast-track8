package tasks;

/*
        input:
            aaaabcccdd
        output:
            a4b1c3d2
 */
public class T07_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequency("aaaabcccdd"));
    }

    public static String frequency(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char current = str.charAt(i);
            if (!result.contains(current+"")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == current) {
                        count++;
                    }
                }

                result += current + "" + count;
            }
        }
        return result;
    }
}
