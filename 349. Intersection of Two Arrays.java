class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);
        if (set1.size() < set2.size()) {
            return set_intersection(set2, set1);
        }
        return set_intersection(set1, set2);
    }
    
    // set1.size() <= set2.size()
    public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] output = new int[set1.size()];
        int idx = 0;
        for (Integer n : set1) {
            if (set2.contains(n)) output[idx++] = n;
        }
        return Arrays.copyOf(output, idx);
    }
}