package org.bkd.saas.budget.db;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bkd.saas.budget.dto.BudgetRoleEnum;

@Entity(name = "budget_membership")
@Getter
@Setter
@NoArgsConstructor
public class BudgetMembershipEntity {

  @Id
  @Column(nullable = false, updatable = false, unique = true)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false, updatable = false, unique = false)
  private UUID userId;

  @Column(nullable = false, updatable = false, unique = false)
  private UUID budgetId;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, updatable = true, unique = false)
  private BudgetRoleEnum role;

  public BudgetMembershipEntity(UUID userId, UUID budgetId, BudgetRoleEnum role) {
    this.userId = userId;
    this.budgetId = budgetId;
    this.role = role;
  }
}
