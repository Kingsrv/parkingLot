package service;

import model.Ticket;
import model.VehicleType;
import repository.TicketRepository;
import repository.TicketRepositoryImpl;

public class TicketServiceImpl implements TicketService{

    private TicketRepository ticketRepository;

    public TicketServiceImpl(){
        ticketRepository = new TicketRepositoryImpl();
    }

    @Override
    public Ticket generateTicket(String vehicleNumber, Long gateId, VehicleType vehicleType) {
        return null;
    }
}
