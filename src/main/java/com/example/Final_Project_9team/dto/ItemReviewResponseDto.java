package com.example.Final_Project_9team.dto;

import com.example.Final_Project_9team.entity.ItemReview;
import com.example.Final_Project_9team.entity.enums.Rating;
import com.example.Final_Project_9team.repository.ItemReviewRepository;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ItemReviewResponseDto {
    private String content;
    private String username;
    private Long id;
    private LocalDateTime createdAt;
    private Rating rating;
    private String title;
    public static ItemReviewResponseDto fromEntity(ItemReview itemReview) {
        ItemReviewResponseDto dto = new ItemReviewResponseDto();
        dto.setContent(itemReview.getContent());
        dto.setUsername(itemReview.getUser().getNickname());
        dto.setId(itemReview.getId());
        dto.setCreatedAt(itemReview.getCreatedAt());
        dto.setRating(itemReview.getRating());
        dto.setTitle(itemReview.getItem().getName());
        return dto;
    }
}
