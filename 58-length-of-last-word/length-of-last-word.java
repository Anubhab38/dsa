class Solution {
    public int lengthOfLastWord(String s) {
        String[] z=s.split(" ");

        String lastWord=z[z.length-1];
        int ap=lastWord.length();

        return ap;
    }
}