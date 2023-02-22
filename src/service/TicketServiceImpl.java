package service;

import exception.NoParkingSpotAvailableException;
import model.*;
import repository.TicketRepository;
import strategy.spotAssignmentStrategy.SpotAssignmentStrategy;

import java.util.Date;

public class TicketServiceImpl implements TicketService{

    private TicketRepository ticketRepository;
    private VehicleService vehicleService;
    private GateService gateService;
    private SpotAssignmentStrategy spotAssignmentStrategy;

    public TicketServiceImpl(TicketRepository ticketRepository, VehicleService vehicleService, GateService gateService, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.ticketRepository = ticketRepository;
        this.vehicleService = vehicleService;
        this.gateService = gateService;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    @Override
    public Ticket generateTicket(String vehicleNumber, Long gateId, VehicleType vehicleType) {
        /*
            1. check if the vehicle is present in the db
            2. we need vehicle number (call vehicle service -> vehicle Repo)
            3. If the vehicle is not present in the database then save it
            4. create the ticket
         */

        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
        if(vehicle == null ){
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGate(gateId);

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        ticket.setOperator(gate.getOperator());
        ticket.setGate(gate);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assign(vehicleType,gate);

        if(parkingSpot == null ){
            throw new NoParkingSpotAvailableException("CCurrently no parking spot available !!");
        }

        ticket.setParkingSpot(parkingSpot);
        Ticket savedTicket = ticketRepository.save(ticket);
        return savedTicket;
    }
}
