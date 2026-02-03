/*
 * UC7: Display Vessel Details by ID
 * --------------------------------
 * Retrieves vessel details using vesselId
 * and displays formatted output.
 */

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        // Step 1: Accept number of vessels
        System.out.println("Enter the number of vessels to be added");
        int n = sc.nextInt();
        sc.nextLine();

        // Step 2: Accept vessel details
        System.out.println("Enter vessel details");
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(":");

            util.addVesselPerformance(
                    new Vessel(
                            data[0],
                            data[1],
                            Double.parseDouble(data[2]),
                            data[3]
                    )
            );
        }

        // Step 3: Retrieve vessel by ID
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = sc.nextLine();

        Vessel vessel = util.getVesselById(searchId);

        // Step 4: Display result
        if (vessel != null) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        sc.close();
    }
}
