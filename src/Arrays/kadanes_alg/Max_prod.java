package Arrays.kadanes_alg;

public class Max_prod {
    public int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int minProd=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int old_max=maxProd;
            int old_min=minProd;
            maxProd=Math.max(nums[i],Math.max(nums[i]*old_max,nums[i]*old_min));
            minProd=Math.min(nums[i],Math.min(nums[i]*old_max,nums[i]*old_min));
            ans=Math.max(ans,maxProd);
        }
        return ans;

    }
}
