public class SecongLargest {
    public static void main(String[] args) {
        int[] marks = { 10, 45, 20, 89, 50 };

        int largest = Integer.MIN_VALUE;// assuming the largest element is the minimum value of integer &&
                                        // value==-2147483648
        int secondlargest = Integer.MIN_VALUE;// assuming the second largest element is the minimum value of integer &&
                                              // value==-2147483648
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > largest) {
                secondlargest = largest;// if the current element is greater than the largest element then the largest
                                        // element will become the second largest element
                largest = marks[i];
            } else if (marks[i] > secondlargest && marks[i] != largest) {
                secondlargest = marks[i];
            }

        }
        System.out.println("The second largest element is: " + secondlargest);
        System.out.println("The largest element is: " + largest);
    }
}