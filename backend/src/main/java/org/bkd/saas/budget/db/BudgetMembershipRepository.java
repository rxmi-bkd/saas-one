package org.bkd.saas.budget.db;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetMembershipRepository extends JpaRepository<BudgetMembershipEntity, UUID> {

  List<BudgetMembershipEntity> findAllByUserId(UUID userId);
}
