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
}
