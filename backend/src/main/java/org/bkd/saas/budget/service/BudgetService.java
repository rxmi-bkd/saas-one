package org.bkd.saas.budget.service;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.bkd.saas.budget.db.BudgetEntity;
import org.bkd.saas.budget.db.BudgetMembershipEntity;
import org.bkd.saas.budget.db.BudgetMembershipRepository;
import org.bkd.saas.budget.db.BudgetRepository;
import org.bkd.saas.budget.dto.BudgetDto;
import org.bkd.saas.budget.dto.BudgetRoleEnum;
import org.bkd.saas.budget.mapper.BudgetMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BudgetService {

  private final BudgetRepository budgetRepository;
  private final BudgetMembershipRepository budgetMembershipRepository;
  private final BudgetMapper budgetMapper;

  @Transactional
  public BudgetDto createBudget(UUID userId, String name, String currency, BudgetRoleEnum role) {
    BudgetEntity budget = new BudgetEntity(name, currency);
    budget = budgetRepository.save(budget);

    BudgetMembershipEntity membership = new BudgetMembershipEntity(userId, budget.getId(), role);
    budgetMembershipRepository.save(membership);

    return budgetMapper.toBudgetDto(budget);
  }
}
