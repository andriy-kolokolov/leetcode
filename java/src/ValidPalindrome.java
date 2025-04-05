public class ValidPalindrome {
    public static boolean isPalindrome(int num) {
        if(num < 0) {
            return false;
        }

        int reversed = 0;
        int temp = num;

        while (temp != 0) {
            reversed += temp % 10;
            temp /= 10;
            if (temp == 0) {
                break;
            }
            reversed = reversed * 10;
        }

        return reversed == num;
    }
}

