public class Main {

    public static void main(String[] args) {

        TravelPackageDirector director = new TravelPackageDirector();

        TravelPackage budgetPackage = director.buildBudgetPackage(
                new BudgetTravelPackageBuilder()
        );

        TravelPackage luxuryPackage = director.buildLuxuryPackage(
                new LuxuryTravelPackageBuilder()
        );

        System.out.println("Budget Travel Package:");
        System.out.println(budgetPackage);

        System.out.println();

        System.out.println("Luxury Travel Package:");
        System.out.println(luxuryPackage);
    }
}
