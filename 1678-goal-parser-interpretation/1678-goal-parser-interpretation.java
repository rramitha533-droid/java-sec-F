class Solution {
    public String interpret(String command) {
     
        StringBuilder output = new StringBuilder();
        boolean isPreviousBracket = false;

        for (char c : command.toCharArray()) {
            if (c == '(') {
                isPreviousBracket = true;
            } else if (c == ')') {
                if (isPreviousBracket) {
                    output.append("o");
                }
            } else {
                isPreviousBracket = false;
                output.append(c);
            }
        }

        return output.toString();
    }
}   
    