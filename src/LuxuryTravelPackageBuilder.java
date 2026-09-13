public class LuxuryTravelPackageBuilder implements TravelPackageBuilder {

    private String destination = "Dubai";
    private String hotelType = "5-star Hotel";
    private String transport = "Business Class Flight";
    private boolean mealsIncluded = true;
    private boolean excursionsIncluded = true;

    @Override
    public TravelPackageBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public TravelPackageBuilder setHotelType(String hotelType) {
        this.hotelType = hotelType;
        return this;
    }

    @Override
    public TravelPackageBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public TravelPackageBuilder setMealsIncluded(boolean mealsIncluded) {
        this.mealsIncluded = mealsIncluded;
        return this;
    }

    @Override
    public TravelPackageBuilder setExcursionsIncluded(boolean excursionsIncluded) {
        this.excursionsIncluded = excursionsIncluded;
        return this;
    }

    @Override
    public TravelPackage build() {
        if (destination == null || destination.isEmpty()) {
            throw new IllegalStateException("Destination cannot be empty");
        }

        return new TravelPackage(
                destination,
                hotelType,
                transport,
                mealsIncluded,
                excursionsIncluded
        );
    }
}
