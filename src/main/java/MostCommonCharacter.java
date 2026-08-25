import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        String[] s=str.split("");
        char most=' ';
        int max=-1;
        Map<Character, Integer> freq=new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            char ch = str.charAt(i);
            if(freq.containsKey(ch))
            {
                freq.put(ch, freq.get(ch)+1);
            }
            else
            {
                freq.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                most = entry.getKey();
            }
        }
        return most;
    }
}
