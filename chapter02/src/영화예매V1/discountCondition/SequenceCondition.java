package 영화예매V1.discountCondition;

import 영화예매V1.Screening;

/* Screening 의 상영 순번 일치 확인 */
public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
