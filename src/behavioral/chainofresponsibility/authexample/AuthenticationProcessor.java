package behavioral.chainofresponsibility.authexample;

public abstract class AuthenticationProcessor {
    public AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProcessor authProvider);
}
