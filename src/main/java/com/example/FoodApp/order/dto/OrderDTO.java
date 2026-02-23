package com.example.FoodApp.order.dto;

import com.example.FoodApp.auth_users.dto.UserDTO;
import com.example.FoodApp.enums.OrderStatus;
import com.example.FoodApp.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {
    private Long id;

    private LocalDateTime orderDate;

    private BigDecimal totalAmount;

    private PaymentStatus paymentStatus;

    private OrderStatus orderStatus;

    private UserDTO user;

    private List<OrderItemDTO> orderItems;
}
