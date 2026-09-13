# Assignment 1 - Builder Pattern

## About the project

This project demonstrates the Builder Design Pattern in Java.

The product of this project is a Travel Package.  
The Builder pattern is used to create different travel packages step by step.

The project contains two concrete builders:

- BudgetTravelPackageBuilder
- LuxuryTravelPackageBuilder

These builders create different representations of the TravelPackage object.

## Project structure

- `TravelPackage` - Product
- `TravelPackageBuilder` - Builder interface
- `BudgetTravelPackageBuilder` - Concrete Builder
- `LuxuryTravelPackageBuilder` - Concrete Builder
- `TravelPackageDirector` - Director
- `Main` - Client

## Travel package representations

### Budget Travel Package

- Destination: Almaty
- Hotel: Hostel
- Transport: Bus
- Meals included: No
- Excursions included: Yes

### Luxury Travel Package

- Destination: Dubai
- Hotel: 5-star Hotel
- Transport: Business Class Flight
- Meals included: Yes
- Excursions included: Yes

## How to run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java JDK 17 is selected.
4. Run `Main.java`.

## Example output

```text
Budget Travel Package:
TravelPackage{destination='Almaty', hotelType='Hostel', transport='Bus', mealsIncluded=false, excursionsIncluded=true}

Luxury Travel Package:
TravelPackage{destination='Dubai', hotelType='5-star Hotel', transport='Business Class Flight', mealsIncluded=true, excursionsIncluded=true}