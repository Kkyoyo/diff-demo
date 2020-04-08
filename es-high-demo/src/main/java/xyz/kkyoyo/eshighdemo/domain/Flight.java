package xyz.kkyoyo.eshighdemo.domain;

import lombok.Data;
import org.elasticsearch.common.geo.GeoPoint;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-3
 */
@Data
public class Flight {
    /**
     * FlightNum : ALQXRB0
     * DestCountry : IT
     * OriginWeather : Sunny
     * OriginCityName : Tokyo
     * AvgTicketPrice : 715.625681925628
     * DistanceMiles : 6019.984164267071
     * FlightDelay : false
     * DestWeather : Thunder & Lightning
     * Dest : Verona Villafranca Airport
     * FlightDelayType : No Delay
     * OriginCountry : JP
     * dayOfWeek : 4
     * DistanceKilometers : 9688.225394858226
     * timestamp : 2020-04-03T06:27:22
     * DestLocation : {"lat":"45.395699","lon":"10.8885"}
     * DestAirportID : VR10
     * Carrier : ES-Air
     * Cancelled : false
     * FlightTimeMin : 745.2481072967865
     * Origin : Narita International Airport
     * OriginLocation : {"lat":"35.76470184","lon":"140.3860016"}
     * DestRegion : IT-34
     * OriginAirportID : NRT
     * OriginRegion : SE-BD
     * DestCityName : Verona
     * FlightTimeHour : 12.420801788279777
     * FlightDelayMin : 0
     */


    private String FlightNum;

    private String DestCountry;

    private String OriginWeather;

    private String OriginCityName;

    private double AvgTicketPrice;

    private double DistanceMiles;

    private boolean FlightDelay;

    private String DestWeather;

    private String Dest;

    private String FlightDelayType;

    private String OriginCountry;

    private int dayOfWeek;

    private double DistanceKilometers;

    private String timestamp;

    private GeoPoint DestLocation;

    private String DestAirportID;

    private String Carrier;

    private boolean Cancelled;

    private double FlightTimeMin;

    private String Origin;

    private GeoPoint OriginLocation;

    private String DestRegion;

    private String OriginAirportID;

    private String OriginRegion;

    private String DestCityName;

    private double FlightTimeHour;

    private int FlightDelayMin;


}
