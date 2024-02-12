package web.socket.learn.WebSocketReactLearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import web.socket.learn.WebSocketReactLearning.entity.SocketResponse;
import web.socket.learn.WebSocketReactLearning.service.MessageService;

@Controller
@CrossOrigin
public class SocketController {

    @Autowired
    private MessageService messageService;

    @MessageMapping("/message")
    @SendTo("/topic/command")
    public SocketResponse processMessage(String command, SimpMessageHeaderAccessor headerAccessor) {
        String result = messageService.processCommand(command);
        return new SocketResponse(result);
    }
}
