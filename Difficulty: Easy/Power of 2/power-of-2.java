// User function Template for Java

class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(int n) {
        // code here
        boolean check = false;
        int no = 1;
        int k =2;
        int max = Integer.MAX_VALUE;
        if(n!=1&&n!=2){
            while(no<n){
                k*=2;
                if(k==n){
                    check = true;
                    break;
                }
                no++;
            }

        }else if(n==1|| n==2){
            check =true;
        }return check;
        }
    }
   
