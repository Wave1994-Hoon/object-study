package 영화예매V1;

import 영화예매V1.discountPolicy.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    /* 어떤 할인 정책이 사용되었는지 Movie는 알지 못한 채 단지 메시지만 전달한다. */
    public Money calculateMovieFee(Screening screening) {

        /*`할인 정책이 없는 경우를 예외 케이스로 취급 --> 일관성 있던 협력 방식 무너짐 */
//        if (discountPolicy == null) {
//            return fee;
//        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
