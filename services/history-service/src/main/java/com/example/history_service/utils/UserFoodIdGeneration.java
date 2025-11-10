package com.example.history_service.utils;

import com.example.history_service.documents.UserFoodHistory;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class UserFoodIdGeneration extends AbstractMongoEventListener<UserFoodHistory> {

    @Override
    public synchronized void onBeforeConvert(BeforeConvertEvent<UserFoodHistory> bc)
    {
        UserFoodHistory userFoodHistory = bc.getSource();

        if(userFoodHistory.getId()==null||userFoodHistory.getId().isEmpty())
        {
            userFoodHistory.setId(generateId());
        }
    }

    public synchronized String generateId()
    {
        return "UFH_" + System.currentTimeMillis();
    }
}
