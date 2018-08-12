package vehicles_extension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static final String DRIVE_COMMAND = "Drive";
    private static final String DRIVE_EMPTY_COMMAND = "DriveEmpty";
    private static final String REFUEL_COMMAND = "Refuel";

    private static final Map<String, Double> SUMMER_MODE_PERMANENT_ON = new HashMap<>() {{
        put("Car", 0.9);
        put("Truck", 1.6);
        put("Bus", 1.4);
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");
        String[] busTokens = reader.readLine().split("\\s+");

        String carType = carTokens[0];
        String truckType = truckTokens[0];
        String busType = busTokens[0];

        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carConsumption = Double.parseDouble(carTokens[2]);
        double carTankCapacity = Double.parseDouble(carTokens[3]);
        Vehicle car = new Car(carFuelQuantity, carConsumption, carTankCapacity);

        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckConsumption = Double.parseDouble(truckTokens[2]);
        double truckTankCapacity = Double.parseDouble(truckTokens[3]);
        Vehicle truck = new Truck(truckFuelQuantity, truckConsumption, truckTankCapacity);

        double busFuelQuantity = Double.parseDouble(busTokens[1]);
        double busConsumption = Double.parseDouble(busTokens[2]);
        double busTankCapacity = Double.parseDouble(busTokens[3]);
        Vehicle bus = new Bus(busFuelQuantity, busConsumption, busTankCapacity);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        vehicles.put(carType, car);
        vehicles.put(truckType, truck);
        vehicles.put(busType, bus);

        int commandsCount = Integer.parseInt(reader.readLine());

        DecimalFormat df = new DecimalFormat("#.##");

        while (commandsCount-- > 0) {
            String[] commandTokens = reader.readLine().split("\\s+");

            String command = commandTokens[0];
            String vehicleType = commandTokens[1];
            double parameter = Double.parseDouble(commandTokens[2]);

            switch (command) {
                case DRIVE_COMMAND:
                    boolean isTravelled = vehicles
                            .get(vehicleType)
                            .drive(parameter, SUMMER_MODE_PERMANENT_ON.get(vehicleType));

                    if (isTravelled) {
                        System.out.println(String.format("%s travelled %s km", vehicleType, df.format(parameter)));
                    } else {
                        System.out.println(String.format("%s needs refueling", vehicleType));
                    }
                    break;

                case DRIVE_EMPTY_COMMAND:
                    isTravelled = vehicles
                            .get(vehicleType)
                            .drive(parameter);

                    if (isTravelled) {
                        System.out.println(String.format("%s travelled %s km", vehicleType, df.format(parameter)));
                    } else {
                        System.out.println(String.format("%s needs refueling", vehicleType));
                    }
                    break;

                case REFUEL_COMMAND:
                    try {
                        vehicles.get(vehicleType).refuel(parameter);

                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
            }
        }

        vehicles.values().forEach(vehicle -> System.out.println(vehicle));
    }
}