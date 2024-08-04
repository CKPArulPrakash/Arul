class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double c=0;
        int n=nums1.length;
        int m=nums2.length;
        double [] a=new double[n+m];
        for(int i=0;i<n;i++){
            a[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            a[i+n]=nums2[i];
        }
        Arrays.sort(a);
        if((n+m)%2!=0){
            c=a[(n+m)/2];
        }
        else {
            c=(a[(n+m)/2-1]+a[(n+m)/2])/2;
        }
        return c;
    }
}