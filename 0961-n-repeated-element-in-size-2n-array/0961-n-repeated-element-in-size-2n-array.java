class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int e: nums){
            if(st.contains(e))
            {
                return e;
            }
            else {
                st.add(e);
            }
        }
        return -1;
    }
}