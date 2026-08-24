class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> temp=new Stack<>();
        int n=s.length();

        for(int i=n-1; i>=0; i--){
            char x=s.charAt(i);

            if(!temp.isEmpty() && x==temp.peek()){
                temp.pop();
            }
            else{
                temp.push(x);
            }
        }

        StringBuilder ap=new StringBuilder();

        while(!temp.isEmpty()){
            ap.append(temp.pop());
        }
        return ap.toString();
    }
}