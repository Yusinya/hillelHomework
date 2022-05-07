package homework4;

public class Zoo {
    public static void main(String[] args) {
        int bearCount = 9;
        int tigerCount = 7;
        int parrotCount = 15;
        int elephantCount = 8;
        int racoonCount = 5;
        int porcupineCount = 15;
        double bearGrowth = bearCount + (bearCount * 0.3);
        double tigerGrowth = tigerCount + (tigerCount * 0.2);
        double parrotGrowth = parrotCount + (parrotCount * 0.4);
        double elephantGrowth = elephantCount + (elephantCount * 0.05);
        double racoonGrowth = racoonCount + (racoonCount * 0.8);
        double porcupineGrowth = porcupineCount + (porcupineCount * 0.15);

        int countAllAnimal = countAnimals(bearCount, tigerCount, parrotCount, elephantCount, racoonCount);
        System.out.println(countAllAnimal);

        int count5AnimalNextYear = countAnimalsNextYear(bearGrowth, tigerGrowth, parrotGrowth, elephantGrowth, racoonGrowth);
        System.out.println(count5AnimalNextYear);

        int count6AnimalNextYear = count6AnimalsNextYear(bearGrowth, tigerGrowth, parrotGrowth, elephantGrowth, racoonGrowth, porcupineGrowth);
        System.out.println(count6AnimalNextYear);
    }

    public static int countAnimals(int bearCount, int tigerCount, int parrotCount, int elephantCount, int racoonCount) {
        return bearCount + tigerCount + parrotCount + elephantCount + racoonCount;
    }

    public static int countAnimalsNextYear(double bearGrowth, double tigerGrowth, double parrotGrowth,
                                           double elephantGrowth, double racoonGrowth) {
        int animalGrowth = (int) (bearGrowth + tigerGrowth + parrotGrowth + elephantGrowth + racoonGrowth);
        return animalGrowth;
    }

    public static int count6AnimalsNextYear(double bearGrowth, double tigerGrowth, double parrotGrowth,
                                            double elephantGrowth, double racoonGrowth, double porcupineGrowth) {
        int animal6Growth = (int) (bearGrowth + tigerGrowth + parrotGrowth + elephantGrowth + racoonGrowth + porcupineGrowth);
        return animal6Growth;
    }
}
