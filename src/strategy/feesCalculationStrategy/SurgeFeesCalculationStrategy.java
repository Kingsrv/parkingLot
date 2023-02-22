package strategy.feesCalculationStrategy;

import model.VehicleType;

import java.util.Date;

public class SurgeFeesCalculationStrategy implements FeesCalculationStrategy{
    @Override
    public double calculateFees(VehicleType vehicleType, Date entryTime, Date exitTime) {
        return 0;
    }
}
