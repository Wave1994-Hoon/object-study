package 영화예매V1;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
