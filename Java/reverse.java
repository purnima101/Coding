class reverse {
    public int reverse(int x) {
        int ans=0;
        int d=0;
        while(x!=0){
            d=x%10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10)
            return 0;

            ans=ans*10+d;
            x=x/10;
        }

        return ans;
    }
}