
package com.start.api.translation.controller;

import com.start.api.translation.model.entity.TranslationReq;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ChatGPT")
public class TranslationController {
    @RequestMapping("/translation")
    @ResponseBody
    public String translation(@RequestBody TranslationReq reqParams) {
        return "Hello World!";
    }

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }
}