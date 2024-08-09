class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] demo = new int[m+n];
        double median = 0;
        for(int i = 0, j = 0 , index =0; index<m+n;index++ ){
            if(i >= m){
                demo[index]=nums2[j];
                j++;
            }
            else if(j >= n){
                demo[index]=nums1[i];
                i++;
            }
            else if(i < m && nums1[i]<=nums2[j]){
                demo[index]=nums1[i];
                i++;
            }
            else if (j < n && nums1[i]>=nums2[j]){
                demo[index]=nums2[j];
                j++;
            }
        }
        
        for(int i =0 ; i<demo.length ;i++){
            System.out.print(demo[i]);
        }
        
        int x = demo.length;
        if((x)%2 != 0){
            median = demo[(int)(x)/2];
            System.out.println((int)(x)/2);
        }
        else{
            median =(double)(demo[(int)(x)/2 -1] + demo[(int)(x)/2])/2;
             System.out.println(demo[(int)(x)/2 -1]);
        }
        
        
    
        return median;
    }
}