package jwt_test.jwt_test_1;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

public class App
{

    static String secret = System.getenv("JWT_SECRET");

    private static void bad1() {
        try {
            
            Algorithm algorithm = Algorithm.HMAC256(System.getenv("JWT_SECRET"));
            String token = JWT.create()
                .withIssuer("auth0")
                .sign(algorithm);
        } catch (JWTCreationException exception){
            
        }
    }

    private static void ok1(String secretKey) {
        try {
            
            Algorithm algorithm = Algorithm.HMAC256(System.getenv("JWT_SECRET"));
            String token = JWT.create()
                .withIssuer("auth0")
                .sign(algorithm);
        } catch (JWTCreationException exception){
            
        }
    }

    public static void main( String[] args )
    {
        bad1();
        ok1(args[0]);
    }
}

abstract class App2
{

    static String secret = System.getenv("JWT_SECRET");

    public void bad2() {
        try {
            Algorithm algorithm = Algorithm.HMAC256(System.getenv("JWT_SECRET"));
            String token = JWT.create()
                .withIssuer("auth0")
                .sign(algorithm);
        } catch (JWTCreationException exception){
            
        }
    }

}
