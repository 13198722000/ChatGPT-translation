package com.start.api.translation.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
public class OpenAIRequest {

    private static final String API_URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_KEY = "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";

    public static String sendRequest(String prompt) throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", "Bearer " + API_KEY);

        String body = prompt;
        System.out.println("prompt\n"+prompt);
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());

        wr.write(body);
        wr.flush();

        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        wr.close();
        rd.close();

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String prompt = "Hello, how are you today?";
        String response = sendRequest(prompt);
        System.out.println(response);
    }
}