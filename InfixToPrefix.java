/*
 *
 * Reverse the expression string.
2. Read next element in the input expression.
3. If it is an operand, output it.
4. If it is a closing parenthesis, push on to the Stack.
5. If it is an operator, then
a. If the Stack is empty, push operator on Stack
b. If the Top of stack is closing parenthesis, push operator on to the Stack.
// If the operator has "same or higher priority" than the top of the Stack, push
operator on to the Stack else Pop operator from the Stack and output it, repeat
Step 5.
6. If the is an Opening parenthesis, pop operators from stack and output them until closing
parenthesis is encountered. POP and discard closing parenthesis.
7. If there is more input go to step 2.
8. If no more input, un stack all operators and output.
9. Reverse Output expression that is Prefix

 */

import java.util.Scanner;

public class InfixToPrefix {
    private static final int LP = 10;
    private static final int RP = 20;
    private static final int OPERATOR = 30;
    private static final int OPERAND = 40;
    private static final int RPP = 0;
    private static final int AP = 1;
    private static final int SP = 1;
    private static final int MP = 2;
    private static final int DP = 2;
    private static final int REMP = 2;
    private static final int NONE = 9;

    private static char[] stack;
    private static char[] prefix;
    private static int top;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            top = -1;
            System.out.print("Enter an Infix expression : ");
            String infix = scanner.nextLine();
            infix = new StringBuilder(infix).reverse().toString();
            prefix = new char[infix.length()];
            stack = new char[infix.length()]; // Initialize stack array
            InfixToPrefix(infix);
            prefix = new StringBuilder(new String(prefix)).reverse().toString().toCharArray();
            System.out.println("Prefix expression : " + new String(prefix));
            System.out.print("Do you want to convert one more (y/n) : ");
            ch = scanner.next().charAt(0);
            scanner.nextLine(); // consume newline
        } while (ch == 'y');
    }


    private static void InfixToPrefix(String infix) {
        int i, p, l, type, prec;
        char next;
        i = p = 0;
        l = infix.length();
        while (i < l) {
            type = getType(infix.charAt(i));
            switch (type) {
                case RP:
                    push(infix.charAt(i));
                    break;
                case LP:
                    while ((next = pop()) != ')') {
                        prefix[p++] = next;
                    }
                    break;
                case OPERAND:
                    prefix[p++] = infix.charAt(i);
                    break;
                case OPERATOR:
                    prec = getPrecedence(infix.charAt(i));
                    while (top > -1 && prec < getPrecedence(stack[top])) {
                        prefix[p++] = pop();
                    }
                    push(infix.charAt(i));
                    break;
            }
            i++;
        }
        while (top > -1) {
            prefix[p++] = pop();
        }
    }

    private static int getType(char sym) {
        switch (sym) {
            case '(':
                return LP;
            case ')':
                return RP;
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
                return OPERATOR;
            default:
                return OPERAND;
        }
    }

    private static int getPrecedence(char sym) {
        switch (sym) {
            case ')':
                return RPP;
            case '+':
                return AP;
            case '-':
                return SP;
            case '*':
                return MP;
            case '/':
                return DP;
            case '%':
                return REMP;
            default:
                return NONE;
        }
    }

    private static void push(char sym) {
        stack[++top] = sym;
    }

    private static char pop() {
        return stack[top--];
    }
}