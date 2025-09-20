class Sample {
    public void largestItem (int nums[]){
        int max = nums[0]; 
        for (int i=1; i<nums.length; i++){
            if (nums[i] > max) {
                max = nums[i]; 
            }
        }
        System.out.println("Largest Item: "+max); 
    }

    public void secondLargestItem(int nums[]){
        int n = nums.length; 
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        
        for (int num : nums){
            if (num > firstMax){
                secondMax = firstMax; 
                firstMax = num; 
            }else if (num > secondMax && num != firstMax){
                secondMax = num;
            }
        }

        System.out.println("First Large: "+firstMax); 
        System.out.println("Second Large: "+secondMax);      
    }
}

class arrayProblem {
    public static void main (String args[]){
        int[] arr = {1,5,2,54,2,6,0,4}; 

        Sample s = new Sample(); 
        s.secondLargestItem(arr); 
        
        
    } 
}