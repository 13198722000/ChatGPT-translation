package com.start.api.translation.service.impl;

import com.start.api.translation.model.entity.TranslationReq;
import com.start.api.translation.model.entity.TranslationResponse;
import com.start.api.translation.service.translationService;
import org.springframework.stereotype.Service;

@Service
public class translationServiceImpl implements translationService {
    @Override
    public String translationText(TranslationReq requestParam){
        String str = "你好";
        return str;
    };
}
