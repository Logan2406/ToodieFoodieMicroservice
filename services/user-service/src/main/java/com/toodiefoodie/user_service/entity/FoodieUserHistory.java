package com.toodiefoodie.user_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FoodieUserHistory {
    @Id
    private String historyId;

    private LocalDateTime oderAt;

    private String itemId;

    private String userId;
}
