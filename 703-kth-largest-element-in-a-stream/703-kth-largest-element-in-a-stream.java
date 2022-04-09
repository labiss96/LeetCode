class KthLargest {
    private List<Integer> list;
    private int k;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        sort();
    }

    public int add(int val) {
        list.add(val);
        sort();
        return list.get(k-1);
    }

    private void sort() {
        Collections.sort(list, Collections.reverseOrder());
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */