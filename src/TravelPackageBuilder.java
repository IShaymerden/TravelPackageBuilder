public interface TravelPackageBuilder {

    TravelPackageBuilder setDestination(String destination);

    TravelPackageBuilder setHotelType(String hotelType);

    TravelPackageBuilder setTransport(String transport);

    TravelPackageBuilder setMealsIncluded(boolean mealsIncluded);

    TravelPackageBuilder setExcursionsIncluded(boolean excursionsIncluded);

    TravelPackage build();
}
