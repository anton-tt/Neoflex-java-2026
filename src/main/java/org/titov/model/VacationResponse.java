package org.titov.model;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class VacationResponse {
    private BigDecimal vacationPayAmount;
    private int paidDays;
}
