package JavaDSA;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder str = new StringBuilder();
        int i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                str.append(ch);
            }
        }
        String result = str.toString().toLowerCase();

        int start = 0, end = str.length()-1;
        while (start <= end) {
            char x = result.charAt(start);
            char y = result.charAt(end);
            if (x != y) {
                System.out.println("not");
                break;
            }
            start++;
            end--;
        }

        System.out.println("yes");

    }
}
