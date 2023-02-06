package model;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private Vehicle vehicle;
    private Gate gate;
    private Operator operator; // If on a gate multiple operators are present then add a list
    private ParkingSpot parkingSpot;

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSpot getParkingSlot() {
        return parkingSpot;
    }

    public void setParkingSlot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
