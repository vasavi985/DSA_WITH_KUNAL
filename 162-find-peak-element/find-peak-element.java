class Solution {
    public int findPeakElement(int[] arr) {
                int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // We are in the increasing part
                start = mid + 1;
            } else {
                // We are in the decreasing part or at the peak
                end = mid;
            }
        }

        return end;
        
    }
}