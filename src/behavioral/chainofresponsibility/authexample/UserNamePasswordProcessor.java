package behavioral.chainofresponsibility.authexample;

public class UserNamePasswordProcessor extends AuthenticationProcessor {

    public UserNamePasswordProcessor(AuthenticationProcessor authenticationProcessor){
        super(authenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProcessor authProvider) {
        if(authProvider instanceof UserNamePasswordProcessor) return true;
        else if(nextProcessor!=null) return nextProcessor.isAuthorized(authProvider);
        return false;
    }
}
