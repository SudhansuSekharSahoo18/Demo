class Solution {
    public static void main(String []args){
        int arr[][] = {{1,1},{1,1}};
        Solution s = new Solution();
        System.out.println(s.solve(arr));
    }
    public int solve(int[][] arr) {
        int n = arr.length;

        int sum = 0;
        int x=0,y=0;
        
        for(int i=0;i<n;i++){
            sum += sumX(arr,i);                 
            System.out.println(sum);
        }
        for(int i=0;i<n;i++){            
            sum += sumY(arr,i); 
            System.out.println(sum);
        }

        return sum;
    }


    public int sumX(int arr[][],int x){
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sum = + arr[x][j];
            }            
        }

        return sum;
    }

    
    public int sumY(int arr[][],int y){
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sum = + arr[j][y];
            }            
        }

        return sum;
    }
}
