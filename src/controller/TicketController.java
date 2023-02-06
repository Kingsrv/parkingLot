package controller;

import dto.GenerateTicketRequestDto;
import dto.GenerateTicketResponseDto;
import model.Gate;
import model.Ticket;
import model.Vehicle;
import service.TicketService;

import java.util.Date;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){

        return null;
    }

    // - > hit generate ticket
    /*
    1. get Vehicle details
    2. get gate details
    3. choose operator
    4. assign a slot
    5. generate ticket, save and return.
     */
}
