class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ap = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                ap.add("FizzBuzz");
            }
            else if(i%3==0){
                ap.add("Fizz");
            }
            else if(i%5==0){
                ap.add("Buzz");
            }
            else{
                String x=String.valueOf(i);
                ap.add(x);
            }
        }
        return ap;
    }
}