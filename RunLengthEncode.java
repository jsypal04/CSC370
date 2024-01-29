import java.util.LinkedList;
import java.util.Queue;

public class RunLengthEncode {

    /**
     * @param input - the string to be encoded
     * @return - the encoded string using run length encoding
     */
    public static String encode(String input) {
        String output = "";
        Queue<Character> q = new LinkedList<Character>();

        // for every character in the input
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // if the the queue is empty or the character is the same as what is in the queue, add it
            if (q.size() == 0 || c == q.peek()) {
                q.add(c);
            }
            // if the character is different and the queue is has 4 or fewer items, 
            // add all items to the ouput and add the character to the queue
            else if (q.size() <= 4 && c != q.peek()) {
                while (q.size() > 0) {
                    output += q.remove();
                }
                q.add(c);
            }
            // if the character is different and there are more then 4 items in the queue,
            // encode the run and add it to the output, clean out the queue and add the new character
            else if (q.size() > 4 && c != q.peek()) {
                output += "/" + String.format("%02d", q.size()) + q.remove();
                while (q.size() > 0) {
                    q.remove();
                }
                q.add(c);
            }
        }

        // handle the last run in the same way as above
        if (q.size() <= 4) {
            while (q.size() > 0) {
                output += q.remove();
            }
        }
        else {
            output += "/" + String.format("%02d", q.size()) + q.remove();
        }

        // return the output
        return output;
    }

    public static void main(String[] args) {
        System.out.println(encode("aaaaa"));
        System.out.println(encode("aaaa"));
        System.out.println(encode("abcabcabcabcabc"));
        System.out.println(encode("if(a){if(b){if(c){if(d){if(e){5 deeeeeeep}}}}}"));
        System.out.println(encode(""));
    }
}