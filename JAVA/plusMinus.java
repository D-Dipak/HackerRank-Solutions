public class plusMinus {
    public static void main(String args[]){
        int arr[]={-1,3,-2,1,0,6};
        int n=arr.length;
        double positive_r=0,negative_r=0,zero_r=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]<0){
                positive_r++;
            }
            else if (arr[i]>0) {
                negative_r++;
                
            } else {
                zero_r++;
            }    
        }
        System.out.printf("%.6f %n",positive_r/n);
        System.out.printf("%.6f %n",negative_r/n);
        System.out.printf("%.6f %n",zero_r/n);
        System.out.println(n);    
    }
    
}
