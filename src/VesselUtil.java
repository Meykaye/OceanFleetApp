/*
 * UC3: Retrieve Vessel by Vessel ID
 * --------------------------------
 * Adds searching capability using vesselId.
 */

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    /*
     * Searches vessel by ID (case-sensitive)
     * Returns null if not found
     */
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
}
