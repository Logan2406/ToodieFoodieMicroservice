package com.toodiefoodie.user_service.utils;

import com.toodiefoodie.user_service.config.SpringContext;
import com.toodiefoodie.user_service.entity.FoodieUser;
import com.toodiefoodie.user_service.service.IdGenerationService;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

public class FoodieUserIdGenerator extends SequenceStyleGenerator
{
    private IdGenerationService idGenerationService;

    @Override
    public Object generate(SharedSessionContractImplementor session, Object owner) throws HibernateException {
        final String id;

        if (this.allowAssignedIdentifiers() && owner instanceof FoodieUser) {
            id = ((FoodieUser) owner).getUserId();
        } else {
            id = null;
        }
        return id != null ? id : customIdGenerate() ;
    }

    public synchronized String customIdGenerate()
    {
        if(idGenerationService==null)
        {
            idGenerationService = SpringContext.getBean(IdGenerationService.class);
        }
        return "FD_USR_"+idGenerationService.generateId("FOODIE_USER");
    }


    @Override
    public boolean allowAssignedIdentifiers() {
        return true;
    }
}