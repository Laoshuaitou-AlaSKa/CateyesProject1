import com.zhbit210.model.pojo.User;
import com.zhbit210.model.pojo.UserMessage;
import com.zhbit210.model.serviceImpl.UserServiceImpl;

import java.io.IOException;

public class testUserService {
    public static void main(String[] args) throws IOException {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        User user = new User("nemo@leohome.com","654321");
        UserMessage userMessage = new UserMessage("NEMO",2,"女",321654);
//        userServiceImpl.regist(user,userMessage);
//        userServiceImpl.login(user);
    }
}
