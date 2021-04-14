package 티켓판매V3;

/* 티켓 판매원 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    @Deprecated
    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    @Deprecated
    /* Audience 와 TicketSeller 가 직접 Bag와 TicketOffice를 처리하는 자율적인 존재로 재설계 */
    public void sellToV1(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());

            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }

    public void sellToV2(Audience audience) {
        ticketOffice.plusAmount(audience.buyV2(ticketOffice.getTicket()));
    }
}
