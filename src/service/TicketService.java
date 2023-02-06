package service;

import model.Ticket;
import model.VehicleType;

public interface TicketService {

    Ticket generateTicket(String vehicleNumber, Long gateId, VehicleType vehicleType);
}
