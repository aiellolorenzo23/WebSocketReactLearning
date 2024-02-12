package web.socket.learn.WebSocketReactLearning.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String processCommand(String command) {
        switch (command) {
            case "Hello":
                return "Hello, SockJS!";
            case "How are you?":
                return "I'm fine! Thank you!";
            case "Peter Griffin":
                return "Ehehehehehehhehe!";
            default:
                return "Invalid command!";
        }
    }
}
