package org.titov.model;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class VacationRequest {
    @NotNull
    @Positive
    private BigDecimal averageSalary;
    @Positive
    private Integer vacationDays;
    private LocalDate startDate;
    private LocalDate endDate;
}
