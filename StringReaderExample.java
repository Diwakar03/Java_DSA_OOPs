import java.io.StringReader;

public class StringReaderExample {
    public static void main(String[] args) throws Exception {
        String str = "Hello, World!";

        // Create a StringReader
        StringReader stringReader = new StringReader(str);

        int data;
        while ((data = stringReader.read()) != -1) { // Read character by character
            System.out.print((char) data);
        }

        stringReader.close();
    }
}
