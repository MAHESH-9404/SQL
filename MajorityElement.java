public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int majority = arr[0]; // Assume the first element as the majority element
        int count = 1; // Initialize the count of the majority element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                // If count becomes 0, update the majority element and reset the count
                majority = arr[i];
                count = 1;
            }
        }

        // Verify if the majority element occurs more than n/2 times
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majority) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return majority;
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 5, 5, 5, 5 };

        int majorityElement = findMajorityElement(arr);

        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
