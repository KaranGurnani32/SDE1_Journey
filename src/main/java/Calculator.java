public class Calculator {
    public static void main(String[] args) {
        String op = new String("/");
        System.out.println(calculatorMethod(5, 0, op));
    }

    public static int calculatorMethod(int a, int b, String operator) {
        // I used == instead of .equals() which checks content == is for reference inside String Pool
        // If I create a String using new keyword then it will not work
        if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }
    }
}

//public class Invalidoperator extends Exception {
//
//}

