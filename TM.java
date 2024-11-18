public class TM {
    public static void main(String args[]) {
        Character ch = 'a';  // 'a' has an ASCII value of 97
        int a = 4;

        // Add the integer value to the ASCII value of the character
        int c = ch + a;

        // Convert the result back to a character
        Character f = (char) c;
        System.out.println(f);  // Should print the character corresponding to 'a' + 4, which is 'e'
    }
}
