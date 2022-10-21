

public class Algo{



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,80,11,9,8,7,6,5,4};
        int k = arr[5];
        double array_divide = Math.ceil(arr.length/2);
        //int n = arr.length;
        
        while(array_divide != k){
            if(arr[(int)array_divide] <= arr[(int)array_divide -1]){
                array_divide = Math.ceil(array_divide/2);
                
                
            }
            else{
                array_divide = array_divide + Math.ceil(array_divide/2);
    
            }
            
    
            
        }
        System.out.println(k);
    
      
        
        
        }
    }