
import static java.lang.Math.*;
import com.google.com.common.math.BigIntegerMath;


public class givenformula {
    static void binomialExpression(a,b,n){
        (a + b)^n
    }
}

public class nCr {
    static void binomial_coefficient_function(n,r){
        assert lefthandSide := int[][] = new int[n][r]
        righthandSide = BigIntegerMath.factorial(n) / BigIntegerMath.factorial(r) * BigIntegerMath.factorial(n-r)
       System.out.printIn("The binomail coefficient function (given your constants) is: " + lefthandSide / righthandSide)
    }
}
