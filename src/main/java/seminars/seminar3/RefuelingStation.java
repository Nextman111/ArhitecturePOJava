package seminars.seminar3;

import seminars.seminar3.enums.FuelTiype;
import seminars.seminar3.interfaces.Refueling;

public class RefuelingStation implements Refueling {
    @Override
    public void fuel(FuelTiype fuelTiype) {
        System.out.println("Идет заправкa топливом " + fuelTiype);
    }

}
