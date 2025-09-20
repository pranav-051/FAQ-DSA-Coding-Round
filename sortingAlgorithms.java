class SortingAlgorithm{
    public int[] selection_sort(int nums[]){
        int n = nums.length;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (nums[i] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i]; 
                    nums[i] = temp; 
                }
            }
        }
        return nums;
    }

    public int[] bubble_sort(int nums[]){
        int n = nums.length; 

        for (int i=n-1; i>=0; i--){
            for (int j=0; j<=i-1; j++){
                if (nums[j+1] < nums[j]){
                    int temp = nums[j+1]; 
                    nums[j+1] = nums[j]; 
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public int[] insertion_sort(int[] nums){
        int n = nums.length; 

        for (int i=0; i<n; i++){
            int j = i; 

            while (j>0 && nums[j-1] > nums[j]){
                int temp = nums[j-1]; 
                nums[j-1] = nums[j]; 
                nums[j] = temp; 
                j--;
            }
        }
        return nums;
    }

    public void traversal (int[] nums){
        for (int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}

class sortingAlgorithms{
    public static void main (String args[]){
        int[] nums = {5,1,1,2,0,0};

        SortingAlgorithm s = new SortingAlgorithm(); 

        System.out.print("Selection Sort: ");
        s.traversal(s.selection_sort(nums));

        System.out.print("Bubble Sort: ");
        s.traversal(s.bubble_sort(nums));

        System.out.print("Insertion Sort: ");
        s.traversal(s.insertion_sort(nums));
    }
}