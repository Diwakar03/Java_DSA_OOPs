// new code with sexy ouput
import java.util.Scanner;

public class InfixToPostfix {
    private static final int LP = 10;
    private static final int RP = 20;
    private static final int OPERATOR = 30;
    private static final int OPERAND = 40;
    private static final int LPP = 0;
    private static final int AP = 1;
    private static final int SP = 1;
    private static final int MP = 2;
    private static final int DP = 2;
    private static final int REMP = 2;
    private static final int NONE = 9;

    private static char[] stack;
    private static char[] postfix;
    private static int top;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            top = -1;
            System.out.println("\nEnter an Infix expression : ");
            String infix = scanner.nextLine();
            postfix = new char[infix.length()];
            stack = new char[infix.length()]; // Initialize the stack array
            infixToPostfix(infix);
            System.out.println("Postfix expression is : " + new String(postfix));
            System.out.println("Do you want to convert one more(y/n) : ");
            ch = scanner.next().charAt(0);
            scanner.nextLine(); // consume newline
        } while (ch == 'y');
    }

    private static void infixToPostfix(String infix) {
        int i, p, l, type, prec;
        char next;
        i = p = 0;
        l = infix.length();
        while (i < l) {
            type = getType(infix.charAt(i));
            switch (type) {
                case LP:
                    push(infix.charAt(i));
                    break;
                case RP:
                    while (top > -1 && (next = pop()) != '(') { // Handle empty stack case
                        postfix[p++] = next;
                    }
                    break;
                case OPERAND:
                    postfix[p++] = infix.charAt(i);
                    break;
                case OPERATOR:
                    prec = getPrecedence(infix.charAt(i));
                    while (top > -1 && prec <= getPrecedence(stack[top])) {
                        postfix[p++] = pop();
                    }
                    push(infix.charAt(i));
                    break;
            }
            i++;
        }
        while (top > -1) {
            postfix[p++] = pop();
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
            case '(':
                return LPP;
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
        if (top == -1) { // Handle empty stack case
            return '\0'; // Return null character
        }
        return stack[top--];
    }
}