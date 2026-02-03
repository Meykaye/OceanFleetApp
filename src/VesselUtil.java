/*
 * UC2: Store Vessel Records Using List
 * -----------------------------------
 * Introduces Java Collection (List)
 * for storing multiple Vessel objects.
 */

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    /*
     * List to hold Vessel objects
     */
    private List<Vessel> vesselList = new ArrayList<>();

    /*
     * Adds a vessel to the list
     */
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    /*
     * Getter for vessel list
     */
    public List<Vessel> getVesselList() {
        return vesselList;
    }

    /*
     * UC4: Identify High-Performance Vessels
     * --------------------------------------
     * Finds vessels with highest average speed.
     */

    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> result = new ArrayList<>();

        double maxSpeed = 0;

        // Find maximum speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Collect vessels with max speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                result.add(vessel);
            }
        }

        return result;
    }
}
