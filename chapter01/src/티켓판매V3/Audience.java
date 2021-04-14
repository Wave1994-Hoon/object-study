package 티켓판매V3;

/* 관람겍 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    @Deprecated
    public Bag getBag() {
        return bag;
    }

    @Deprecated
    public Long buyV1(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public Long buyV2(Ticket ticket) {
        return bag.hold(ticket);
    }
}


