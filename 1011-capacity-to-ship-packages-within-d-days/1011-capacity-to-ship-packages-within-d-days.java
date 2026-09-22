class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int min = Arrays.stream(weights).max().getAsInt();
        int max = Arrays.stream(weights).sum();

        while (min <= max) {
            int mid = min + (max - min)/2;

            if (possible(weights, mid, days)) {
                max = mid-1;
            }
            else {
                min = mid+1;
            }
        }
        return min;
        
    }

    static boolean possible (int[] arr, int capacity, int days) {

        int sum = 0;
        int day = 1;

        for (int item : arr) {
            
            if (item + sum > capacity){
                day++;

                sum = item;
            }
            else {
                sum += item;
            }
        }
        return day <= days;
    }
}