package com.hrproject.dto.response;

import com.hrproject.repository.enums.EExpenseStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class CompanyExpenseListResponseDto {
    private Long expenseId;
    private String avatar;
    private String name;
    private String surname;
    private String expenseType;
    private String currency;
    private String billDate;
    private Double amount;
    private String description;
    private String recipePhoto;
    private EExpenseStatus eExpenseStatus;
}