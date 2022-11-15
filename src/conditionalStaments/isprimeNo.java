package conditionalStaments;

public class isprimeNo {
    public static void main(String[] args) {


        int n = -1;

        if(n <= 1){
            System.out.println("NAN");
            return;
        }

        int count = 0;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                count++;
                System.out.println("Not Prime");
                break;
            }
        }
        if(count == 0){
            System.out.println("isPrime");
        }

    }
}
