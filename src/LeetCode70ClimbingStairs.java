class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int a = 3;
        int b =2;
        int temp = 0;
        for(int i =4;i<=n;i++){
            temp = a+b;
             b = a;
            a=temp;
        }
        return temp;
}
}