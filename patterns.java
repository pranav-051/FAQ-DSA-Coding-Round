class sample {
    public void pattern1(){
        int r=5, c=5; 
        System.out.println("Pattern 1"); 
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    public void pattern2(){
        int r = 5; 
        System.out.println("\nPattern 2"); 
        for (int i=1; i<=r; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    public void pattern3(){
        System.out.println("\nPattern 3"); 
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" "); 
            }
            System.out.println(); 
        }
    }

    public void pattern4(){
        System.out.println("\nPattern 4"); 
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" "); 
            }
            System.out.println(); 
        }
    }

        public void pattern5(){
        System.out.println("\nPattern 5"); 
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    public void pattern6(){
        System.out.println("\nPattern 6"); 
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" "); 
            }
            System.out.println(); 
        }
    }
    
     public void pattern7(){
        System.out.println("\nPattern 7"); 
        
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }

            if (i != 5){
                for (int j=4; j>=i; j--){
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }
    }

    public void pattern8(){
        System.out.println("\nPattern 8"); 
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }
            if (i != 5){
                for (int j=4; j>=i; j--){
                    System.out.print("*"); 
                }
            }
            System.out.println();
        }
    }

    public void pattern9(){
        System.out.println("\nPattern 9"); 
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }

            if (i != 5){
                for (int j=4; j>=i; j--){
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }
        
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }
            if (i != 5){
                for (int j=4; j>=i; j--){
                    System.out.print("*"); 
                }
            }
            System.out.println();
        }
    }

    public void pattern10(){
        System.out.println("\nPattern 10");
        int r = 4; 
        for (int i=1; i<=r; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }
              for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    } 

    public void pattern11(){
        System.out.println("\nPattern 11");
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                boolean a = true;

                if (a == true) {
                    System.out.print("1");
                    a = false; 
                } 

            }
        }
    }

}

class patterns {
    public static void main (String args[]){
        sample s = new sample(); 
        s.pattern10();
    }
}