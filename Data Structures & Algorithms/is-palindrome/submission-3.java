class Solution {
    public boolean isPalindrome(String s) {
  
        int i=0;
        int j = s.length() -1;
        s = s.toLowerCase();

        while( i<=j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }

        while( i <= j && !Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            while(i<=j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            j--;
            while(i<=j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

        }

        return true;
        
    }
}
