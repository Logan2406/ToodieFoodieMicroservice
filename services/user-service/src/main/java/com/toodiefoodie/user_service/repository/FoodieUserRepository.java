package com.toodiefoodie.user_service.repository;

import com.toodiefoodie.user_service.entity.FoodieUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodieUserRepository extends JpaRepository<FoodieUser,String> {

}
