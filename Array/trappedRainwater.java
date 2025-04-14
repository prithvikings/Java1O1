public class trappedRainwater {

    public static int trappedRainwater(int height[]){
        int n = height.length;

        //calculate left max
        int left[] = new int[n];
        left[0] = height[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        //calculate right max

        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        //calculate trapped water->
        //loop
        //waterlevel= min(leftmax, rightmax)
        //trapped water = waterlevel - height[i]
        //add trapped water to total trapped water
        int trappedWater = 0;
        for(int i=0; i<n; i++){

            int waterLevel = Math.min(left[i], right[i]);
            trappedWater+= waterLevel - height[i];
        }
        return trappedWater;
        
    }
    public static void  main(String args[]){
        int[] array = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(array));// Output: 11
    }
}
