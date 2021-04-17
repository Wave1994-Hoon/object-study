package 영화예매V1.discountPolicy;

import 영화예매V1.Money;
import 영화예매V1.Screening;
import 영화예매V1.discountCondition.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy{

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
