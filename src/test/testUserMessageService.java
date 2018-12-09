import com.zhbit210.model.pojo.UserMessage;
import com.zhbit210.model.serviceImpl.UserMessageServiceImpl;

import java.io.IOException;

public class testUserMessageService {
    public static void main(String[] args) throws IOException {
        UserMessageServiceImpl userMessageService = new UserMessageServiceImpl();
        UserMessage userMessage = new UserMessage("墨爷",6,"女",123654);
//        userMessageService.showUserMessage(1);
//        userMessageService.changeUserMessage(1,userMessage);
    }
}
