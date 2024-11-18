import java.util.*;

class abc {

    public int fixTheFormula(String input1) {
        // Extract numbers and operators
        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);

            if (Character.isDigit(ch)) {
                numbers.add(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            }
        }

        // Process '*' and '/' first
        List<Integer> tempNumbers = new ArrayList<>();
        List<Character> tempOperators = new ArrayList<>();
        tempNumbers.add(numbers.get(0)); // Start with the first number

        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            int num = numbers.get(i + 1);

            if (op == '*') {
                // Apply multiplication
                int lastNumber = tempNumbers.remove(tempNumbers.size() - 1);
                tempNumbers.add(lastNumber * num);
            } else if (op == '/') {
                // Apply division
                int lastNumber = tempNumbers.remove(tempNumbers.size() - 1);
                tempNumbers.add(lastNumber / num);
            } else {
                // Handle '+' and '-' later
                tempNumbers.add(num);
                tempOperators.add(op);
            }
        }

        // Process '+' and '-' now
        int result = tempNumbers.get(0);

        for (int i = 0; i < tempOperators.size(); i++) {
            char op = tempOperators.get(i);
            int num = tempNumbers.get(i + 1);

            if (op == '+') {
                result += num;
            } else if (op == '-') {
                result -= num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        abc abcInstance = new abc();
        String input1 = "we8+you2-7to/*32";
        int result = abcInstance.fixTheFormula(input1);
        System.out.println("Final Answer: " + result); // Expected output: 3
    }
}
