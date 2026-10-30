
abstract class EnergySource {
    int Sourceid;
    String Sourcename;
    double energygenerated;

    EnergySource(int id, String name, double energy) {
        Sourceid = id;
        Sourcename = name;
        energygenerated = energy;
    }

    abstract double CalculateEfficiency();

    void displayDetails() {
        System.out.println("Source id: " + Sourceid);
        System.out.println("Source name: " + Sourcename);
        System.out.println("Energy generated: " + energygenerated + " kWh");
        System.out.println("Efficiency: " + CalculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double CalculateEfficiency() {
        return (energygenerated / 5000.0) * 100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double CalculateEfficiency() {
        return (energygenerated / 8000.0) * 100;
    }
}

public class energysourceMain {
    public static void main(String[] args) {
        EnergySource Source;

        Source = new SolarEnergy(101, "Solar Panel", 4000);
        System.out.println("Solar energy details:");
        Source.displayDetails();

        System.out.println();

        Source = new WindEnergy(102, "Wind Turbine", 6000);
        System.out.println("Wind energy details:");
        Source.displayDetails();
    }
}

