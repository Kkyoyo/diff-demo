package xyz.kkyoyo.javafaker.domain;


import lombok.Data;
import lombok.experimental.Accessors;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@Table(name = "BA_MS_ALL")
public class BaMsAll {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 采集日期
     */
    @Column(name = "DATADATE")
    private String datadate;

    /**
     * 实际承运航司
     */
    @Column(name = "OPERATE_CARRIER_CODE")
    private String operateCarrierCode;

    /**
     * 市场方航司
     */
    @Column(name = "MARKET_CARRIER_CODE")
    
    private String marketCarrierCode;

    /**
     * 出票方航司
     */
    @Column(name = "ISS_CARRIER_CODE")
    
    private String issCarrierCode;

    /**
     * 物理舱位
     */
    @Column(name = "CABIN")
    
    private String cabin;

    /**
     * 子舱位
     */
    @Column(name = "SUBCABIN")
    
    private String subcabin;

    /**
     * 区域
     */
    @Column(name = "REGION")
    
    private String region;

    /**
     * 子区
     */
    @Column(name = "SUBREGION")
    
    private String subregion;

    /**
     * 国家及地区
     */
    @Column(name = "COUNTRY")
    
    private String country;

    /**
     * 航点
     */
    @Column(name = "AIRPORT")
    
    private String airport;

    /**
     * 航线
     */
    @Column(name = "ROUTE")
    
    private String route;

    /**
     * 航段
     */
    @Column(name = "FLTSEG")
    
    private String fltseg;

    /**
     * 航班号
     */
    @Column(name = "FLTNO")
    
    private String fltno;

    /**
     * 来回程
     */
    @Column(name = "ROUND_FLAG")
    
    private String roundFlag;

    /**
     * 航班日期
     */
    @Column(name = "FLT_DATE")
    private String fltDate;

    /**
     * 航班农历
     */
    @Column(name = "FLT_DATE_LUNAR")
    private String fltDateLunar;

    /**
     * 航班周期
     */
    @Column(name = "DOW")
    private Short dow;

    /**
     * true_od
     */
    @Column(name = "TRUE_OD")
    
    private String trueOd;

    /**
     * true_OD往返类型
     */
    @Column(name = "TRUE_OD_RT")
    
    private String trueOdRt;

    /**
     * true_OD客源类型
     */
    @Column(name = "TRUE_OD_TRANS")
    
    private String trueOdTrans;

    /**
     * true_od_O机场
     */
    @Column(name = "TRUE_O_AIRPORT")
    
    private String trueOAirport;

    /**
     * true_od_O城市
     */
    @Column(name = "TRUE_O_CITY")
    
    private String trueOCity;

    /**
     * true_od_O国家地区
     */
    @Column(name = "TRUE_O_COUNTRY")
    
    private String trueOCountry;

    /**
     * true_od_O洲际
     */
    @Column(name = "TRUE_O_INTERCONTINENTAL")
    
    private String trueOIntercontinental;

    /**
     * true_od_D机场
     */
    @Column(name = "TRUE_D_AIRPORT")
    
    private String trueDAirport;

    /**
     * true_od_D城市
     */
    @Column(name = "TRUE_D_CITY")
    
    private String trueDCity;

    /**
     * true_od_D国家地区
     */
    @Column(name = "TRUE_D_COUNTRY")
    
    private String trueDCountry;

    /**
     * true_od_D洲际
     */
    @Column(name = "TRUE_D_INTERCONTINENTAL")
    
    private String trueDIntercontinental;

    /**
     * trip_od
     */
    @Column(name = "TRIP_OD")
    
    private String tripOd;

    /**
     * trip_OD往返类型
     */
    @Column(name = "TRIP_OD_RT")
    
    private String tripOdRt;

    /**
     * trip_od客源类型
     */
    @Column(name = "TRIP_OD_TRANS")
    
    private String tripOdTrans;

    /**
     * trip_od_O机场
     */
    @Column(name = "TRIP_O_AIRPORT")
    
    private String tripOAirport;

    /**
     * trip_od_O城市
     */
    @Column(name = "TRIP_O_CITY")
    
    private String tripOCity;

    /**
     * trip_od_O国家地区
     */
    @Column(name = "TRIP_O_COUNTRY")
    
    private String tripOCountry;

    /**
     * trip_od_O洲际
     */
    @Column(name = "TRIP_O_INTERCONTINENTAL")
    
    private String tripOIntercontinental;

    /**
     * trip_od_D机场
     */
    @Column(name = "TRIP_D_AIRPORT")
    
    private String tripDAirport;

    /**
     * trip_od_D城市
     */
    @Column(name = "TRIP_D_CITY")
    
    private String tripDCity;

    /**
     * trip_od_D国家地区
     */
    @Column(name = "TRIP_D_COUNTRY")
    
    private String tripDCountry;

    /**
     * trip_od_D洲际
     */
    @Column(name = "TRIP_D_INTERCONTINENTAL")
    private String tripDIntercontinental;

    /**
     * 客源地_机场
     */
    @Column(name = "CUSTOM_AIRPORT")
    private String customAirport;

    /**
     * 客源地_城市
     */
    @Column(name = "CUSTOM_CITY")
    private String customCity;

    /**
     * 客源地_国家地区
     */
    @Column(name = "CUSTOM_COUNTRY")
    private String customCountry;

    /**
     * 客源地_洲际
     */
    @Column(name = "CUSTOM_INTERCONTINENTAL")
    private String customIntercontinental;

    /**
     * 销售地_城市
     */
    @Column(name = "SALE_CITY")
    private String saleCity;

    /**
     * 销售地_国家地区
     */
    @Column(name = "SALE_COUNTRY")
    private String saleCountry;

    /**
     * 销售地_洲际
     */
    @Column(name = "SALE_INTERCONTINENTAL")
    private String saleIntercontinental;

    /**
     * 散团
     */
    @Column(name = "GRP_FLAG")
    private String grpFlag;

    /**
     * FareBasis
     */
    @Column(name = "FAREBASIS")
    private String farebasis;

    /**
     * 分配座位数
     */
    @Column(name = "ALCT_CAP")
    
    private Short alctCap;

    /**
     * 航距
     */
    @Column(name = "FLT_DISTANCE")
    
    private Long fltDistance;

    /**
     * 收入含油
     */
    @Column(name = "FARE_FUEL")
    
    private BigDecimal fareFuel;

    /**
     * 收入不含油
     */
    @Column(name = "FARE_NOFUEL")
    
    private BigDecimal fareNofuel;

    /**
     * OD收入含油
     */
    @Column(name = "FARE_OD_FUEL")
    
    private BigDecimal fareOdFuel;

    /**
     * OD收入含油
     */
    @Column(name = "FARE_OD_NOFUEL")
    
    private BigDecimal fareOdNofuel;

    /**
     * 销售日
     */
    @Column(name = "ISS_DATE")
    private String issDate;

    /**
     * 出票状态
     */
    @Column(name = "ISS_STATUS")
    private String issStatus;

    /**
     * 票号
     */
    @Column(name = "T_NO")
    private String tNo;

    /**
     * ODID
     */
    @Column(name = "OD_ID")
    
    private String odId;

    /**
     * 航段连接码
     */
    @Column(name = "CONJ_ID")
    
    private String conjId;
}