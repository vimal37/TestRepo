public class lambdaEx {


    LambdaExamp safeDivide = (int a, int b) -> {
        if(b==0) {
            return 0;
        }
        return a/b;
    };

    interface LambdaExamp {
        int div(int a,int b);
    }

//



}
