package com.example.FoodApp.menu.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuDTO {

    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    private String description;
    @NotBlank(message = "Price is required")
    @Positive(message = "Price must be positive")
    private BigDecimal price;
    private String imageUrl;

    @NotBlank(message = "CategoryId is required")
    private Long categoryId;  // required when adding new menu
    private MultipartFile imageFile;
    private List<ReviewDTO> reviews;

}


