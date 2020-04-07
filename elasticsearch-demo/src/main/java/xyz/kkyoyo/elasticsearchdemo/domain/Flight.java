package xyz.kkyoyo.elasticsearchdemo.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-3
 */
@Data
@Document(indexName = "kibana_sample_data_flights",type = "_doc",shards=5,replicas = 1)
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

    @Field(type = FieldType.Keyword)
    private String FlightNum;

    @Field(type = FieldType.Keyword)
    private String DestCountry;

    @Field(type = FieldType.Keyword)
    private String OriginWeather;

    @Field(type = FieldType.Keyword)
    private String OriginCityName;

    @Field(type = FieldType.Keyword)
    private double AvgTicketPrice;

    @Field(type = FieldType.Float)
    private double DistanceMiles;

    @Field(type = FieldType.Keyword)
    private boolean FlightDelay;

    @Field(type = FieldType.Keyword)
    private String DestWeather;

    @Field(type = FieldType.Keyword)
    private String Dest;

    @Field(type = FieldType.Boolean)
    private String FlightDelayType;

    @Field(type = FieldType.Keyword)
    private String OriginCountry;

    @Field(type = FieldType.Integer)
    private int dayOfWeek;

    @Field(type = FieldType.Float)
    private double DistanceKilometers;

    @Field(type = FieldType.Date)
    private String timestamp;

    @GeoPointField
    private GeoPoint DestLocation;

    @Field(type = FieldType.Keyword)
    private String DestAirportID;

    @Field(type = FieldType.Keyword)
    private String Carrier;

    @Field(type = FieldType.Boolean)
    private boolean Cancelled;

    @Field(type = FieldType.Boolean)
    private double FlightTimeMin;

    @Field(type = FieldType.Keyword)
    private String Origin;

    @GeoPointField
    private GeoPoint OriginLocation;

    @Field(type = FieldType.Keyword)
    private String DestRegion;

    @Field(type = FieldType.Keyword)
    private String OriginAirportID;

    @Field(type = FieldType.Keyword)
    private String OriginRegion;

    @Field(type = FieldType.Keyword)
    private String DestCityName;

    @Field(type = FieldType.Keyword)
    private double FlightTimeHour;

    @Field(type = FieldType.Integer)
    private int FlightDelayMin;



}
