package Loops;

public class patternQuestions {
    public static void main(String[] args) {
//        que1: print the pattern:
//              * * * * *
//              * * * * *
//              * * * * *
//              * * * * *
//            int n = 5;
//          for(int i=0; i<n; i++){
//              for(int j=0; j<n; j++){
//                  System.out.print("* ");
//              }
//              System.out.println();
//          }


//        que2: print the pattern:
//              * * * * *
//              *       *
//              *       *
//              * * * * *
//        int n = 4;
//        int m = 5;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=m; j++){
//
//                  if((i==1 || i==n) || (j==1 || j==m)){
//                      System.out.print("* ");
//                  }else {
//                      System.out.print("  ");
//                  }
//              }
//              System.out.println();
//          }


//        que3: print the pattern:
//              *
//              * *
//              * * *
//              * * * *
//        int n = 4;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=i; j++){
//                  System.out.print("* ");
//              }
//              System.out.println();
//          }

//        que4: print the pattern:
//              * * * *
//              * * *
//              * *
//              *
//        int n = 4;
//          for(int i=n; i>=1; i--){
//              for(int j=1; j<=i; j++){
//                      System.out.print("* ");
//              }
//              System.out.println();
//          }

//        que5: print the pattern:
//              * * * *
//              * * *
//              * *
//              *
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
