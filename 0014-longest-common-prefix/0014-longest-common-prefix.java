class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs == null || strs.length == 0){
        return "";
       } 
       String lprefix = strs[0];
       for(int i = 1;i<strs.length;i++){
        while(strs[i].indexOf(lprefix) != 0){
            lprefix = lprefix.substring(0, lprefix.length()-1);
            if(lprefix.isEmpty()){
                return "";
            }
        }
       }
       return lprefix;
    }
}