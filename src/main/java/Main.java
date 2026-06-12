public class Main {
    public static void main (String[] args) {
        System.out.println(reverseString("Ruchika"));
        System.out.println(reverseString2("Ruchika"));
        System.out.println(reverseString3("Ruchika"));
    }

    public static String reverseString(String s) {
        char[] ch = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static String reverseString2(String s) {

        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseString3(String s) {

        return s.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (acc, c) -> c + acc);
    }
}
