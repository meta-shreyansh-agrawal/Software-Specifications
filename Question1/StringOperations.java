public class StringOperations {
    public static boolean isEqual(String a, String b){
        if(a.length()!=b.length()){
            return false; 
        }
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false; 
            }
        }
        return true;
    }
    public static String reverse(String s){
        String reverseString = ""; 
        for(int i = 0;i<s.length();i++){
            reverseString = s.charAt(i) + reverseString; 
        }
        return reverseString; 
    }
    public static String replace(String s){
        String ans = ""; 
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i); 
            int assci = (int)c; 
            if(assci>64 && assci<91){
                assci += 32; 
            }else if (assci>96  && assci<123){
                assci -= 32; 
            }
            c = (char)assci; 
            ans = ans + c; 
        }
        return ans; 
    }
    public static String largestWord(String input){
        String[] words = input.split("\\s+");
            
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord; 
    }
}
