class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();

        for(int num: nums1){
            set.add(num);
        }

        HashSet<Integer> common = new HashSet<>();

        for(int num : nums2){
            if(set.contains(num)){
                common.add(num);
            }
        }
        int[] ans= new int[common.size()];
        int i=0;
        for(int num: common){
            ans[i]=num;
            i++;
        }
        return ans;
    }
}