package com.atguigu.AI.langchain4j.config;

import com.atguigu.AI.langchain4j.store.MongoChatMemoryStore;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatMemoryProviderXiaozhiConfig {

    @Autowired
    private MongoChatMemoryStore chatMemoryStore;


    @Bean
    public ChatMemoryProvider chatMemoryProviderXiaozhi() {

        return memoryId ->
                MessageWindowChatMemory
                        .builder()
                        .maxMessages(30)
                        .id(memoryId)
                        .chatMemoryStore(chatMemoryStore)
                .build();
    }
}
