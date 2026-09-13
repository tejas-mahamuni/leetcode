class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return res;
        }

        int ele1 = 0;
        int ele2 = 0;

        int cnt1 = 0;
        int cnt2 = 0;

        for (int i=0; i<nums.length; i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {
                cnt1 = 1;
                ele1 = nums[i];
            }
            else if (cnt2 == 0 && ele1 != nums[i]) {
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if (ele1 == nums[i]) cnt1++;
            else if (ele2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;

        for (int i : nums) {
            if (i == ele1) cnt1++;
            if (i == ele2) cnt2++;
        }

        if (cnt1 > nums.length/3) res.add(ele1);
        if (cnt2 > nums.length/3 && ele1 != ele2) res.add(ele2);

        return res;
        
    }
}