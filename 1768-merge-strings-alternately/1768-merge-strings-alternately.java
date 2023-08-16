class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int m=word1.length();
        int n=word2.length();
        
        StringBuilder mergestring=new StringBuilder();
        int l=Math.max(m,n);
        for(int i=0;i<l;i++){
            if(i<m)
            {
                mergestring.append(word1.charAt(i));
            }  
            if(i<n)
            {
                mergestring.append(word2.charAt(i));
            }
        
        }
        return mergestring.toString();
    }
}