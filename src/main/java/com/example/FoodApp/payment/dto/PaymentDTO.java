package com.example.FoodApp.payment.dto;

import com.example.FoodApp.auth_users.dto.UserDTO;
import com.example.FoodApp.auth_users.entity.User;
import com.example.FoodApp.enums.PaymentGateway;
import com.example.FoodApp.enums.PaymentStatus;
import com.example.FoodApp.order.dto.OrderDTO;
import com.example.FoodApp.order.entity.Order;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {
    private Long id;


    private Long orderId;

    private BigDecimal amount;


    private PaymentStatus paymentStatus;

    private String transactionId;


    private PaymentGateway paymentGateway;

    private String failureReason;

    private LocalDateTime paymentDate;

    private boolean success;

    private OrderDTO order;

    private UserDTO user;

}
