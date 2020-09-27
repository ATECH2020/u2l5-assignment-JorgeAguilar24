import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      //Creates Scanner and initializes variables
      Scanner in = new Scanner(System.in);
      double lat, lon, endLat, endLon, finalDistance;
      //Prints out prompts for the user to input the information for the lats. and longs.
      System.out.print("Enter the latitude of the starting location: ");
      lat = in.nextDouble();
      System.out.print("Enter the longitude of the starting location: ");
      lon = in.nextDouble();
      System.out.print("Enter the latitude of the ending location: ");
      endLat = in.nextDouble();
      System.out.print("Enter the longitude of the ending location: ");
      endLon = in.nextDouble();
      /*gets the methods from GeoLocation to input the location of both destinations
      *then it call the method distanceFrom to calculate the distance between both *locations in miles
      */
      GeoLocation beginDestination = new GeoLocation(lat, lon);
      GeoLocation endDestination = new GeoLocation(endLat, endLon);
      finalDistance = beginDestination.distanceFrom(endDestination);
      System.out.print("The distance is " + finalDistance + " miles.");
    }
}