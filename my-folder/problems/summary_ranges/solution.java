class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        ArrayList<String> ranges = new ArrayList<String>();

        if(nums.length == 0){
            return ranges;
        }

        int range = 0;
        int num = nums[0];
        int current = 0;

        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] == num + 1 + range){
                range++;
                System.out.println("reached first" + i);
            }
            else if(range > 0){
                ranges.add(num + "->" + (num + range));
                range = 0;
                num = nums[i];
                System.out.println("Number" + i);
            }
            else{
                System.out.println("Reached");
                ranges.add(""+num);
                num = nums[i];
            }


        }

        if(range > 0){
            ranges.add(num + "->" + (num + range));
        }
        else{
            System.out.println("Reached");
            ranges.add(""+num);
        }

        return ranges;

    }
}