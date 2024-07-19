package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
The given strings  are: [rabbit   bribe   bike  ]
The given word is: bib

Filter all the words from list 1 which contains the given word.

for eg : rabbit has  b , i and b.
where as bike only has b and i.

So expected output :  rabbit   bribe
 */
public class T09_RemoveIfNotContains {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("rabbbbit" ,  "briiibe" ,  "bike"));
        String word = "bib";

        List<String> filteredWords = new ArrayList<>();

        for(String each : words) {
            //create array with each character in separate index
            String[] arr = each.split("");
            String[] arrTarget = word.split("");

            boolean match = true;
            for (String eachCh : arrTarget) {
                //get count of char in word form list
                long countFromListWord = Arrays.stream(arr)
                        .filter(x -> x.equals(eachCh))
                        .count();
                //get count of char in word form target word
                long countFromTargetWord = Arrays.stream(arrTarget)
                        .filter(x -> x.equals(eachCh))
                        .count();
                //if they are not equal , fail it
                if (countFromListWord < countFromTargetWord) {
                    match = false;
                    break;
                }
            }
            if (match) {
                filteredWords.add(each);
            }
        }

        System.out.println("filteredWords = " + filteredWords);

        System.out.println("==========ANOTHER WAY=======================");

        String givenWord = "bib";

        List<String> filteredWords2 = new ArrayList<>();
        for (String word2 : words) {
            int len = word2.length();
            String tempWord = word2;
            for (int i = 0; i < givenWord.length(); i++) {
                tempWord = tempWord.replaceFirst(givenWord.charAt(i)+"", "");
            }
            if (len - tempWord.length() == givenWord.length()) {
                filteredWords2.add(word2);
            }
        }
        System.out.println(filteredWords2);

    }
}
