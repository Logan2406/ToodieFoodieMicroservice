package com.toodiefoodie.user_service.entity;

import com.toodiefoodie.user_service.annotations.FoodieUserGeneratedId;
import com.toodiefoodie.user_service.utils.FoodieUserIdGenerator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IdGeneratorType;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FoodieUser {

    @Id
    @FoodieUserGeneratedId
    private String userId;

    private String email;

    private String name;

    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<FoodieUserAddress> addresses;

}
