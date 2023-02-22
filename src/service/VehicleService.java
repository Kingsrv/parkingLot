package service;

import model.Vehicle;
import model.VehicleType;

public interface VehicleService {

    Vehicle getVehicle(String vehicleNumber);
    Vehicle registerVehicle(String vehicleNumber, VehicleType vehicleType);
}
