abstract class Energy {
    int SourceID;
    String SourceName;
    double EnergyGenerated;

    Energy(int sourceID, String sourceName, double energyGenerated) {
        this.SourceID = sourceID;
        this.SourceName = sourceName;
        this.EnergyGenerated = energyGenerated;
    }

    abstract double calculateEfficiency();

    void display() {
        System.out.println("Source ID: " + SourceID);
        System.out.println("Souce Name: " + SourceName);
        System.out.println("Energy Generated: " + EnergyGenerated);
        System.out.println("Efficiency: " + calculateEfficiency());
    }
}

class SolarEnergy extends Energy {
    SolarEnergy(int sourceID, String sourceName, double energyGenerated) {
        super(sourceID, sourceName, energyGenerated);
    }
    double calculateEfficiency() {
        return (EnergyGenerated/5000)*100;
    }
}

class WindEnergy extends Energy {
    WindEnergy(int sourceID, String sourceName, double energyGenerated) {
        super(sourceID, sourceName, energyGenerated);
    }
    double calculateEfficiency() {
        return (EnergyGenerated/8000)*100;
    }
}

class Main {
    public static void main(String[] args) {
        Energy s1 = new SolarEnergy(001, "Source 1", 200);
        Energy s2 = new WindEnergy(002,"Source 2", 500);
        s1.display();
        s2.display();
    }
}
