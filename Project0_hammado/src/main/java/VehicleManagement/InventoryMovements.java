package VehicleManagement;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InventoryMovements {
    private int movementId;
    private String VIN;
    private String userName;
    private MovementDestination destination;
    private double gasCharge;
    private LocalDateTime movementDate;

    public enum MovementDestination {
        REVAUCTION("REVauction"),
        COGAUCTION("COGauction"),
        METROAUCTION("Metroauction"),
        AUDIT("Audit");

        private final String displayName;

        MovementDestination(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }

        public boolean isAuction() {
            return this == REVAUCTION || this == COGAUCTION || this == METROAUCTION;
        }
    }

    // constructors
    public InventoryMovements(int movementId, String VIN, String userName, MovementDestination destination, double gasCharge) {
        this.movementId = movementId;
        this.VIN = VIN;
        this.userName = userName;
        this.destination = destination;
        this.gasCharge = gasCharge;
        this.movementDate = LocalDateTime.now();
    }

    //getters and setters
    public int getMovementId() {
        return movementId;
    }

    public void setMovementId(int movementId) {
        this.movementId = movementId;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MovementDestination getDestination() {
        return destination;
    }

    public void setDestination(MovementDestination destination) {
        this.destination = destination;
    }

    public double getGasCharge() {
        return gasCharge;
    }

    public void setGasCharge(double gasCharge) {
        this.gasCharge = gasCharge;
    }

    public LocalDateTime getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(LocalDateTime movementDate) {
        this.movementDate = movementDate;
    }

    //we need to generate a success message, basically letting the user know or manager of the system,
    // the final update on the vehicle(whether it is in auction or in office until further notice
    public String generateSuccessMessage() {
        if (destination.isAuction()) {
            return String.format("%s successfully dropped off vehicle to %s and charged the vehicle $%.2f in gas. LETS GET IT SOLD!!",
                    userName, destination.getDisplayName(), gasCharge);
        }else {
            return String.format("%s moved vehicle VIN %s to Audit", userName, VIN);
        }
    }
    @Override
    public String toString(){
        return String.format("Movement #%d | VIN: %s | User: %s | To: %s | Gas: $%.2f | Date: %s",
                movementId, VIN, userName, destination.getDisplayName(), gasCharge, movementDate);
    }
}
