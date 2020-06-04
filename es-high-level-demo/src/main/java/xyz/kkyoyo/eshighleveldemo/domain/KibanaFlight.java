package xyz.kkyoyo.eshighleveldemo.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.elasticsearch.common.geo.GeoPoint;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-14
 */
@Data
public class KibanaFlight implements Serializable {

    /**
     * FlightNum : DSC19IY
     * DestCountry : ZA
     * OriginWeather : Cloudy
     * OriginCityName : Bangor
     * AvgTicketPrice : 971.3158607502636
     * DistanceMiles : 7793.933414904342
     * FlightDelay : false
     * DestWeather : Thunder & Lightning
     * Dest : OR Tambo International Airport
     * FlightDelayType : No Delay
     * OriginCountry : US
     * dayOfWeek : 4
     * DistanceKilometers : 12543.119977675813
     * timestamp : 2020-04-24T14:46:48
     * DestLocation : {"lat":"-26.1392","lon":"28.246"}
     * DestAirportID : JNB
     * Carrier : Logstash Airways
     * Cancelled : false
     * FlightTimeMin : 1140.2836343341648
     * Origin : Bangor International Airport
     * OriginLocation : {"lat":"44.80739975","lon":"-68.82810211"}
     * DestRegion : SE-BD
     * OriginAirportID : BGR
     * OriginRegion : US-ME
     * DestCityName : Johannesburg
     * FlightTimeHour : 19.00472723890275
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
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date timestamp;
    @JSONField(serializeUsing = GeoPoint.class)
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
