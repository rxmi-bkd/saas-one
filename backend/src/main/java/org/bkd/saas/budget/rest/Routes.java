package org.bkd.saas.budget.rest;

import static org.bkd.saas.shared.rest.Routes.*;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Routes {

  public static final String BUDGETS = "/budgets";

  public static final String PRIVATE_ENDPOINT = PRIVATE_BASE_PATH + BUDGETS;

  public static final String PRIVATE_MOBILE_ENDPOINT = PRIVATE_MOBILE_BASE_PATH + BUDGETS;
}
