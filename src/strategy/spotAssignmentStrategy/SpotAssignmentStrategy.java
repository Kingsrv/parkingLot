package strategy.spotAssignmentStrategy;

import model.Gate;
import model.ParkingSpot;
import model.VehicleType;

public interface SpotAssignmentStrategy {

    ParkingSpot assign(VehicleType vehicleType, Gate gate);
}

