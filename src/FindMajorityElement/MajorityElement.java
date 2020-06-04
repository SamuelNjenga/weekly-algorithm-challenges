package FindMajorityElement;
// Java  program to find Majority element in an array
//It makes use of for loops
//It has a time complexity of O(n*n) as
// A nested loop is needed where both the loops traverse the array from start to end and
// a space complexity of O(1) as no
// extra space is required for any operation
// so the space complexity is constant

class MajorityElement {

    // Function to find Majority element in an array
    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println("The majority element is " + arr[index]);

        else
            System.out.println("No Majority Element");
    }

    // Driver code
    public static void main(String[] args) {

        int array[] = {2, 1, 1, 2, 1, 3, 5, 1, 1};
        int n = array.length;

        // Function calling
        findMajority(array, n);
    }
//This code is contributed by Samuel Njenga.
}