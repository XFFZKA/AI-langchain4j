package com.atguigu.AI.langchain4j.controller;

import com.atguigu.AI.langchain4j.assistant.XiaozhiAgent;
import com.atguigu.AI.langchain4j.bean.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "硅谷小智")
@RestController
@RequestMapping("/xiaozhi")
public class XiaozhiController {

    @Autowired
    private XiaozhiAgent xiaozhiAgent;

    @PostMapping("/chat")
    @Operation(summary = "对话")
    public String chat(@RequestBody ChatForm form) {

        return xiaozhiAgent.chat(form.getMemoryId(),form.getMessage());
    }
}
