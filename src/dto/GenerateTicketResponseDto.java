package dto;

import model.ResponseStatus;
import model.Ticket;
import sun.security.provider.certpath.OCSPResponse;

public class GenerateTicketResponseDto {

    private ResponseStatus responseStatus;

    //TODO : add relevant attributes only

    private Ticket ticket; //NOTE -> please don't add the entire ticket class as it violates the purpose of DTOs

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
