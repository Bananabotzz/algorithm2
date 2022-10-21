public class algo{
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int k = 13;
    double array_divide = (Math.ceil(arr.length/2)-1);
    
    while(array_divide != k){
        if(arr[(int)array_divide] <= arr[(int)array_divide -1]){
            array_divide = Math.ceil(array_divide/2);
            System.out.println(array_divide);
            
            
        }
        else{
            array_divide = array_divide + Math.floor(((arr.length -array_divide)/2));
            System.out.println(array_divide);

        }
        

        
    }
    System.out.println(array_divide);

    
    
    }
}