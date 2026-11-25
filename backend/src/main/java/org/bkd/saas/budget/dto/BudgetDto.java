package org.bkd.saas.budget.dto;

import java.util.UUID;

public record BudgetDto(UUID id, String name, String currency) {
}
