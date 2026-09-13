public class TravelPackageDirector {

    public TravelPackage buildBudgetPackage(TravelPackageBuilder builder) {
        return builder
                .setDestination("Almaty")
                .setHotelType("Hostel")
                .setTransport("Bus")
                .setMealsIncluded(false)
                .setExcursionsIncluded(true)
                .build();
    }

    public TravelPackage buildLuxuryPackage(TravelPackageBuilder builder) {
        return builder
                .setDestination("Dubai")
                .setHotelType("5-star Hotel")
                .setTransport("Business Class Flight")
                .setMealsIncluded(true)
                .setExcursionsIncluded(true)
                .build();
    }
}
