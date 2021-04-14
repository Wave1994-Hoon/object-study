package 영화예매V1;

import java.time.LocalDateTime;

/* 영화를 애매한 후 예매 정보를 담고 있는 Reservation 객체 생성 */
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, CalculateFee(audienceCount), audienceCount);
    }

    private Money CalculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}

