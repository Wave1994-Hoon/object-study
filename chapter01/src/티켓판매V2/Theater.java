package 티켓판매V2;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /* relocated on TicketSeller */
    @Deprecated
    public void enterV1(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());

            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }

    /* 캡술화, Theater 는 더이상 TicketOffice에 접근하지 않는다. */
    public void enterV2(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
