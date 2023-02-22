package strategy.feesCalculationStrategy;

import model.VehicleType;

import java.util.Date;

public interface FeesCalculationStrategy {

    double calculateFees(VehicleType vehicleType, Date entryTime, Date exitTime);
}
