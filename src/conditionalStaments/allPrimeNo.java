package conditionalStaments;

public class allPrimeNo {
    public static void main(String[] args) {
        //find all prime no given integer
        int n = 11;
        int count = 0;

        for(int i=2; i<=n; i++){
            boolean flag = false;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                //if flag = true, then make it false
                flag = false;
            }else{
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.print("\nAll Prime No" + count);
    }
}
