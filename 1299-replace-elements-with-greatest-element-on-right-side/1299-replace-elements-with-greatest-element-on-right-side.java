class Solution {
    public int[] replaceElements(int[] arr) {
        int[] list = new int[arr.length];

        int max = -1;
        for (int i=arr.length-1; i>=0; i--) {
            list[i] = max;
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return list;
    }
}