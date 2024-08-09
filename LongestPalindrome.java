class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length()==1){return s;}
        if(s.equals("")){return "";}
        
        String revString =reverse(s, 0);
        String longest ="";
        int resLen =0;
        
        for (int window = s.length();window>1;window--){
            for(int i = 0; i<s.length();i++){
                if(window-i ==1 || window-i ==0){
                     break;
                }
                
                String sub = s.substring(i,window);
                
                if (revString.contains(sub)){
                    if(sub.length()>longest.length()){
                        longest = sub ;
                    }
                }
            }
            
        }
        if(longest.equals("")){
            return ""+s.charAt(0);
        }
        
        return longest;
    }
    
    
    public static String reverse(String s,int i){
        if(i>s.length()-1){
            return "";
        }
        return reverse(s, i+1)+ s.charAt(i);
    }
    
}