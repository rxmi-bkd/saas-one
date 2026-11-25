package org.bkd.saas.budget.mapper;

import org.bkd.saas.budget.db.BudgetEntity;
import org.bkd.saas.budget.dto.BudgetDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BudgetMapper {

  BudgetDto toBudgetDto(BudgetEntity budgetEntity);
}
