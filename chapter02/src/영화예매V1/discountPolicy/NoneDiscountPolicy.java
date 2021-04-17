package 영화예매V1.discountPolicy;

import 영화예매V1.Money;
import 영화예매V1.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
