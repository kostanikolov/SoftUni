package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static final String DRIVE_COMMAND = "Drive";
    private static final String REFUEL_COMMAND = "Refuel";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");

        String carType = carTokens[0];
        String truckType = truckTokens[0];

        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carConsumption = Double.parseDouble(carTokens[2]);
        Vehicle car = new Car(carFuelQuantity, carConsumption);

        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckConsumption = Double.parseDouble(truckTokens[2]);
        Vehicle truck = new Truck(truckFuelQuantity, truckConsumption);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        vehicles.put(carType, car);
        vehicles.put(truckType, truck);

        int commandsCount = Integer.parseInt(reader.readLine());

        DecimalFormat df = new DecimalFormat("#.##");

        while (commandsCount-- > 0) {
            String[] commandTokens = reader.readLine().split("\\s+");

            String command = commandTokens[0];
            String vehicleType = commandTokens[1];
            double parameter = Double.parseDouble(commandTokens[2]);

            switch (command) {
                case DRIVE_COMMAND:
                    boolean isTravelled = vehicles.get(vehicleType).drive(parameter);

                    if (isTravelled) {
                        System.out.println(String.format("%s travelled %s km", vehicleType, df.format(parameter)));
                    } else {
                        System.out.println(String.format("%s needs refueling", vehicleType));
                    }
                    break;

                case REFUEL_COMMAND:
                    vehicles.get(vehicleType).refuel(parameter);
                    break;
            }
        }

        vehicles.values().forEach(vehicle -> System.out.println(vehicle));
    }
}