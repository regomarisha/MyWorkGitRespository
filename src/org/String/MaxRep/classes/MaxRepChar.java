package org.String.MaxRep.classes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class MaxRepChar {
    public String userinput;

        public char findmax() {
            if (userinput.equals(null)|| userinput.equals("")){
                throw new NullPointerException();
            }
            char[] charArray = userinput.toCharArray();
            LinkedHashMap<Character, Integer> str = new LinkedHashMap<Character, Integer>();
            for (int i = 0; i < charArray.length; i++) {
                int value = 1;
                Character key = charArray[i];
                if (str.containsKey(key)) {
                    value = str.get(key) + 1;
                    str.put(key, value);

                } else {
                    str.put(key, value);
                }
            }

            Character maxChar = '\0';
            int greatestValue = 0;
            for (Map.Entry<Character, Integer> entry : str.entrySet()) {
                if (entry.getValue() > greatestValue) {
                    maxChar = entry.getKey();
                    greatestValue = entry.getValue();
                }

            }
            return maxChar;
        }
}
