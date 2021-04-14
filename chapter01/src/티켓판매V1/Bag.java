package 티켓판매V1;

/* 관람객이 소지품을 보관할 객체 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /* 객체 생성 케이스
    * 1. 초대장 0, 현금 0
    * 2. 초대장 x, 현금 0
    *
    * Bag 객체 생성 시 제약을 강제할 수 있도록 생성자 코드 작성
    * */
    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount -= amount;
    }
}
