import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> obj = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(obj.containsKey(c)){
                int temp = obj.get(c);
                obj.put(c,++temp);
            }
            else
            obj.put(c,0);
        }
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            if(!obj.containsKey(c)) return false;
            if(obj.get(c)>0){
                int temp = obj.get(c);
                obj.put(c,--temp);
            }
            else if(obj.get(c)==0){
                obj.remove(c);
            }
        }
        return obj.isEmpty();

    }
}