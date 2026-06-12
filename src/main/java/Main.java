public class Main {
    public static void main (String[] args) {

        System.out.println(reverseString("Ruchika"));
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
}
