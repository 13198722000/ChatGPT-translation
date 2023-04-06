package com.start.api.translation.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.start.api.translation.util.OpenAIRequest.sendRequest;

public class OpenAIChatRequest {
    private String model;
    private int maxTokens;
    private double temperature;
    private int n;
    private boolean stop;
    private ArrayList<Map> messages;

    public OpenAIChatRequest(String model, int maxTokens, double temperature, int n, boolean stop, ArrayList<Map> messages) {
        this.model = model;
        this.messages = messages;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.n = n;
        this.stop = stop;
    }


    public Map<String, Object> toJson() {
        Map<String, Object> json = new HashMap<>();
        json.put("model", model);
        json.put("max_tokens", maxTokens);
        json.put("temperature", temperature);
        json.put("n", n);
        json.put("stop", stop);
        json.put("messages", messages);
        return json;
    }
}
class test{
    public static void main(String[] args) throws Exception {
        HashMap<String, String> messageMap = new HashMap<>();
        messageMap.put("role","user");
        messageMap.put("content","什么是golang");
        ArrayList<Map> arr = new ArrayList<>();
        arr.add(messageMap);
        OpenAIChatRequest request = new OpenAIChatRequest("gpt-3.5-turbo", 50, 0.5, 1, true,arr);
        Map<String, Object> json = request.toJson();
        String response = sendRequest(json.toString());
        System.out.println(response);
    }
}
