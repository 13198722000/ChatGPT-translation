package com.start.api.translation.model.entity;

import lombok.Data;

@Data
public class TranslationReq {
    private String language;

    private String content;

    private String userId;
}
