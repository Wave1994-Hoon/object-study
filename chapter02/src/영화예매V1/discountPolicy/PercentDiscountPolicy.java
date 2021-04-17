package 영화예매V1.discountPolicy;

import 영화예매V1.Money;
import 영화예매V1.Screening;
import 영화예매V1.discountCondition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy{

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
