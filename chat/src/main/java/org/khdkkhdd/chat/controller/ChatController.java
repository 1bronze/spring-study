package org.khdkkhdd.chat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class ChatController {

    @GetMapping("/chat")
    public String chatGET(Model model, @RequestParam String name) {

        log.info("@ChatController, chat GET()");
        model.addAttribute("name", name);
        return "chat";
    }
}
