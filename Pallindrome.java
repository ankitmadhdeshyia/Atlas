public class Pallindrome {
    public static void main(String[] args) {
        int number = 1234321;
        int rev = 0;
        int temp = number;// temp variable is used to store the value of number because we will change the
                          // value of number in the while loop
        while (temp != 0) {
            int div = temp % 10;
            rev = rev + (div * 10);
            temp = temp / 10;
        }
        if (number == rev) {// checking the new number with the original number if they are equal then it is
                            // a palindrome otherwise not
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
