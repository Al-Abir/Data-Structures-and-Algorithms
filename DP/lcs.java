package DP;

public class lcs {
    public static int lcs_count(String str1 , String str2){
        int n = str1.length();
        int m = str2.length();
    
         int dp[][] = new int[n+1][m+1];

         for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0){
                    dp[i][j]= 0;
                }
            }
         }

         //tabluation code
         for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){

                if(str1.charAt(i-1)== str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
         }
         return dp[n][m];
    
    
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";

        System.out.println(lcs_count(str1,str2));

    }
}
