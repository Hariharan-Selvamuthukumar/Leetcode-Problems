class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev))
        return true;
        else
        return false;
    }
}