public class Solution {

    // Encode list of strings into one string
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for(String s : strs){
            // store: length + '#' + string
            // example: "cat" -> "3#cat"
            res.append(s.length()).append('#').append(s);
        }

        return res.toString();
    }

    // Decode the encoded string back to list
    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {

            int j = i;

            // find '#' which separates length and string
            while(str.charAt(j) != '#'){
                j++;
            }

            // get length of the string
            int length = Integer.parseInt(str.substring(i, j));

            // move to start of actual string
            i = j + 1;

            // end index of string
            j = i + length;

            // extract the string
            res.add(str.substring(i, j));

            // move to next encoded block
            i = j;
        }

        return res;
    }
}