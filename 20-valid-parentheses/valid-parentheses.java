class Solution {
    public boolean isValid(String s) {
        Stack<Character> ap=new Stack<>();

        for(int i=0; i<s.length(); i++){
            char x=s.charAt(i);

            if(x=='[' || x=='{' || x=='('){
                ap.push(x);
            }
            else{
                if(ap.isEmpty()){
                    return false;
                }
                char top=ap.peek();

                if(x==']' && top=='[' || x=='}' && top=='{' || x==')' && top=='('){
                    ap.pop();
                }
                else{
                    return false;
                }
            }
        }
        return ap.isEmpty();
    }
}