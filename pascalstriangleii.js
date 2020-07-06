//Objective is to return the kth row of a pascal triangle.

let k = 4


//O(k^2) solution that uses dynamic programming.

let dp = []
    
for (let i = 0; i < k; i++) {
    dp[i] = []
    for (let j = 0; j <= i; j++) {
        //If it's on the border or it's a diagonal, return 1
        dp[i][j] = (i == 0 || j == 0 || i == j) ? 1 : dp[i - 1][j - 1] + dp[i - 1][j]
    }
}
    
return dp[k - 1]