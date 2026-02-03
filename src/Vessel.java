/*
 * UC1: Create Vessel Model
 * ---------------------------------
 * This class represents the Vessel entity.
 * It follows JavaBeans conventions and
 * encapsulates vessel performance data.
 */

public class Vessel {

    // Unique identifier for the vessel
    private String vesselId;

    // Name of the vessel
    private String vesselName;

    // Average speed of the vessel in knots
    private double averageSpeed;

    // Type of the vessel (Cargo, Tanker, Cruise, etc.)
    private String vesselType;

    /*
     * No-argument constructor
     * Used when creating an empty Vessel object
     */
    public Vessel() {
        // Default constructor
    }

    /*
     * Parameterized constructor
     * Used to initialize all vessel attributes
     */
    public Vessel(String vesselId, String vesselName,
                  double averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    // Getter and Setter methods

    public String getVesselId() {
        return vesselId;
    }

    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}
