package dto;

import model.VehicleType;

public class GenerateTicketRequestDto {

    private String vehicleNumber;
    private Long geteId;
    private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Long getGeteId() {
        return geteId;
    }

    public void setGeteId(Long geteId) {
        this.geteId = geteId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
