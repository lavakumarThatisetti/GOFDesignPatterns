package behavioral.chainofresponsibility.authexample;

public class OAuthProcessor extends AuthenticationProcessor{

    public OAuthProcessor(AuthenticationProcessor authenticationProcessor){
        super(authenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProcessor authProvider) {
        if(authProvider instanceof OAuthProcessor) return true;
        else if(nextProcessor!=null) return nextProcessor.isAuthorized(authProvider);
        return false;
    }
}
