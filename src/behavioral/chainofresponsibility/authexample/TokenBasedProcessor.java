package behavioral.chainofresponsibility.authexample;

public class TokenBasedProcessor extends AuthenticationProcessor{

    public TokenBasedProcessor(AuthenticationProcessor authenticationProcessor){
        super(authenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProcessor authProvider) {
        if(authProvider instanceof TokenBasedProcessor) return true;
        else if(nextProcessor!=null) return nextProcessor.isAuthorized(authProvider);
        return false;
    }
}
