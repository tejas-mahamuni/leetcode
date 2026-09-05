/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        int first = binarySearch(mountainArr, target, 0, peak, true);

        if (first != -1) {
            return first;
        }

        int second = binarySearch(mountainArr, target, peak+1, mountainArr.length()-1, false);

        if (second != -1) {
            return second;
        }

        return -1;

    }

    static int findPeak (MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            }
            else {
                start = mid+1;
            }

            if (start == end){
                break;
            }
        }
        return start;
    }

    static int binarySearch (MountainArray mountainArr, int target, int start, int end, boolean isAscend) {

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }
            if (isAscend == true) {
                if (mountainArr.get(mid) > target) {
                end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
            else {
                if (mountainArr.get(mid) > target) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}