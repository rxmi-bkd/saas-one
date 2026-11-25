package org.bkd.saas.budget.db;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "budget")
@Getter
@Setter
@NoArgsConstructor
public class BudgetEntity {

  @Id
  @Column(nullable = false, updatable = false, unique = true)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false, updatable = true, unique = false)
  private String name;

  @Column(nullable = false, updatable = true, unique = false)
  private String currency;
}
