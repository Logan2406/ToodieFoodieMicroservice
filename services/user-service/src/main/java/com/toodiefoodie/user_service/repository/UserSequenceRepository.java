package com.toodiefoodie.user_service.repository;

import com.toodiefoodie.user_service.entity.UserServiceSequence;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSequenceRepository extends JpaRepository<UserServiceSequence,Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    UserServiceSequence findByKey(String key);
}
