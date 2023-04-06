package com.start.api.translation.service;

import com.start.api.translation.model.entity.TranslationReq;
import com.start.api.translation.model.entity.TranslationResponse;

public interface  translationService {
    String translationText(TranslationReq requestParam);
}
