public class TravelPackage {

    private final String destination;
    private final String hotelType;
    private final String transport;
    private final boolean mealsIncluded;
    private final boolean excursionsIncluded;

    public TravelPackage(
            String destination,
            String hotelType,
            String transport,
            boolean mealsIncluded,
            boolean excursionsIncluded
    ) {
        this.destination = destination;
        this.hotelType = hotelType;
        this.transport = transport;
        this.mealsIncluded = mealsIncluded;
        this.excursionsIncluded = excursionsIncluded;
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "destination='" + destination + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", transport='" + transport + '\'' +
                ", mealsIncluded=" + mealsIncluded +
                ", excursionsIncluded=" + excursionsIncluded +
                '}';
    }
}