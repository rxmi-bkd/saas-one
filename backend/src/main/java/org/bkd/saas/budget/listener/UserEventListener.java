package org.bkd.saas.budget.listener;

import lombok.RequiredArgsConstructor;
import org.bkd.saas.budget.dto.BudgetRoleEnum;
import org.bkd.saas.budget.service.BudgetService;
import org.bkd.saas.user.event.UserCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service("budgetUserEventListener")
@RequiredArgsConstructor
public class UserEventListener {

  private static final String DEFAULT_BUDGET_NAME = "My budget";
  private static final String DEFAULT_BUDGET_CURRENCY = "EUR";

  private final BudgetService budgetService;

  // Plain @EventListener so the budget is created in the user's transaction:
  // if it fails, the user creation is rolled back too.
  @EventListener
  public void onUserCreatedEvent(UserCreatedEvent event) {
    budgetService.createBudget(
        event.userId(), DEFAULT_BUDGET_NAME, DEFAULT_BUDGET_CURRENCY, BudgetRoleEnum.OWNER);
  }
}
