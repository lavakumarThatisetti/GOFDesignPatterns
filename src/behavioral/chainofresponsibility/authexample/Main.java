package behavioral.chainofresponsibility.authexample;

public class Main {
    public static void main(String[] args) {
        AuthenticationProcessor authenticationProcessor = new UserNamePasswordProcessor(
                new OAuthProcessor(null)
        );

        System.out.println(authenticationProcessor.isAuthorized(new OAuthProcessor(null)));
        System.out.println(authenticationProcessor.isAuthorized(new UserNamePasswordProcessor(null)));
        System.out.println(authenticationProcessor.isAuthorized(new TokenBasedProcessor(null)));
    }
}
