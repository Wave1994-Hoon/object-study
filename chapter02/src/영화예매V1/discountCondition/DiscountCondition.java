package 영화예매V1.discountCondition;

import 영화예매V1.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
