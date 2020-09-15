
package day.seven;
import java.util.HashMap;
import java.util.Map;
public class CharFreqMap {
static void characterCount(String inputString){
        HashMap<Character,Integer>charCountMap = new HashMap<Character,Integer>();
        char[] strArray = inputString.toCharArray();
       
        for(char X : strArray) {
        if(charCountMap.containsKey(X)) {
        charCountMap.put(X, charCountMap.get(X) + 1);
        } else {
        charCountMap.put(X, 1);
        }
        }
       
        for(Map.Entry Y : charCountMap.entrySet()) {
        System.out.println(Y.getKey() + " " + Y.getValue());
        }
}

public static void main(String[] args) {
String str = "monika sai";
characterCount(str);
}
}