
public class LIS{
   static int incresingsubseq(int my_arr[], int arr_len){
      int seq_arr[] = new int[arr_len];
      
      int i, j, max = 0;
      for (i = 0; i < arr_len; i++){
         seq_arr[i] = 1;
        	 for (j = 0; j < i; j++){
        		 if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1){
        			 seq_arr[i] = seq_arr[j] + 1;
        		 }
        	 }
         
      }
      
      for (i = 0; i < arr_len; i++){
    	  if (max < seq_arr[i]){
    		  max = seq_arr[i];
    	  }
      }
      return max;
   }
   public static void main(String args[]){
      int my_arr[] = { 3, 10, 2, 1, 20, 41, 60 };
      int arr_len = my_arr.length;
      System.out.println("The length of the longest increasing subsequence is " +  incresingsubseq(my_arr, arr_len));
      
      int my_arr1[] = { 10, 22, 9, 33, 21, 50 };
      int arr_len1 = my_arr1.length;
      System.out.println("The length of the longest increasing subsequence is " +  incresingsubseq(my_arr1, arr_len1));
   }
}
