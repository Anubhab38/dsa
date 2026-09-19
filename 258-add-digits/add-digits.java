class Solution {
    public int sumOfDigit(int x){
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum=sum+digit;
            x=x/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>=10){
            num=sumOfDigit(num);
        }
        return num;
    }
}