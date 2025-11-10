package com.toodiefoodie.user_service.service;

import com.toodiefoodie.user_service.entity.UserServiceSequence;
import com.toodiefoodie.user_service.repository.UserSequenceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IdGenerationService {

    final UserSequenceRepository userSequenceRepository;


    public IdGenerationService(@Autowired UserSequenceRepository userSequenceRepository) {
        this.userSequenceRepository = userSequenceRepository;
    }

    public Long generateId(String key)
    {
        UserServiceSequence us = userSequenceRepository.findByKey(key);

        Long seq = us.getValue();
        us.setValue(seq+1);

        userSequenceRepository.save(us);

        return seq;
    }

}
