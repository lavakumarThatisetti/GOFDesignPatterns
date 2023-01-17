package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class ChatMediatorImpl implements ChatMediator {

    private final List<User> users;

    ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            if(u != user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}