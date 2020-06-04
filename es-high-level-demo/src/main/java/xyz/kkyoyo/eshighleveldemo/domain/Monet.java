package xyz.kkyoyo.eshighleveldemo.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Kyokyo
 * @Date: 2020-4-22
 */
@Data
public class Monet {

    /**
     * TRUE_OD_FEEDER_OPCARR : null
     * TRUE_OD_DEST : AMS
     * OPCARR : MF
     * COLLCUR : CNY
     * DOCTYPE : TKT
     * FLDATE : 20190202
     * FREE_BAG_ALLOWANCE : null
     * TRIP_ORIG : XMN
     * TRUE_OD_OPCARR_PATH : MF
     * PLDATE_ARR_GMT : null
     * PLFROM : XMN
     * FLDATE_LOC : 20190202
     * BACKEND_DISCOUNT : null
     * PAXNAME : null
     * PRV_FRTH_REJ : null
     * TRUE_OD_PLFROM : XMN
     * BOOKCLASS : K
     * TRUE_OD_BEYOND_OPCARR : null
     * ORG_ISS_AIRLCD : null
     * TRUE_OD_OPCARR : MF
     * RPTSYSID : 1A
     * NET_VALUE : 4072
     * REQ_AGT_ISO : CN
     * PLDATE_ARR : 20190202
     * STAY_TIME : null
     * OUTG_INV_INCL_TAX : null
     * FREQ_FLY_ACCR : null
     * CC_COMPANY : null
     * FLFROM : XMN
     * FLAG_CORPORATE_CLIENT : N
     * TRUE_OD_OPNR : 0811
     * OUTG_INV_PAID_ISC : null
     * FLNR : 0811
     * CONJ_PRIME_SERNR : 2419052484
     * FFP_ADD_AWARD : null
     * REQ_AGT_IATA : 08389360
     * TRUE_OD_NR_CPNS : 1
     * STOPOVER_TIME : 299
     * PLFH_DATE : 20190202
     * TRUE_OD_OPER_BOOKCLASS : K
     * PNR_BOOKDATE : 20190102
     * TRUE_OD_BEYOND_OPNR : null
     * AIRCRAFT_OWNER : MF
     * TOURCODE : null
     * TRIP_DURATION : 12.5
     * OPNR : 0811
     * ISS_AGT_ISO : CN
     * COUPON : 1
     * COMM_AMT : 277
     * PAXTYPE : I
     * RFS_CODE : null
     * FLTO : AMS
     * G8_CODE : null
     * ORG_ISS_SERNR : null
     * ISS_AGT_IATA : 08389360
     * FREQ_FLY_AWARD : null
     * FAREBASIS : KL1SFCN
     * PLTO : AMS
     * DESCDE : null
     * PLDATE_GMT : null
     * ORG_SALDATE : null
     * SERNR : 2419052484
     * PREFREV : MF
     * TRUE_OD_ORIG : XMN
     * TRUE_OD_BOOKCLASS : K
     * TRUE_OD_AIRP_PATH : XMN-AMS
     * SALDATE : 2019-01-01T16:00:00.000Z
     * TRUE_OD_PLCARR_PATH : KL
     * PNR_BOOKCLASS : K
     * TRUE_OD_PLTO : AMS
     * PNR_OWNER : KL
     * FLCARR : MF
     * AGENT_NAME : null
     * GRO_GRO : 3088
     * COLMONTH : 201901
     * CALC_TAX_TOTAL : null
     * AIRLCD : 074
     * FIRSTSERNR : 2419052484
     * PLNR : 4911
     * YQYR : 984
     * TKT_LEAD_TIME : 31
     * SUBLGR : null
     * CPN_SEQ_NR : 1
     * Q_SURCHARGE : null
     * OUTG_INV_PAID_GSA : null
     * REVENUE_IND : Y
     * TRIP_DEST : AMS
     * TRUE_OD_DIRECTION : null
     * PLCARR : KL
     * CORP_REFERENCE : null
     * JOURNEY_TYPE : R
     * SAT_NITE_STAY : Y
     * FREQ_FLY_IND : N
     * ORG_ISS_CITY : null
     * TRUE_OD_STOPOVER_TIME : 12
     * OPER_BOOKCLASS : L
     * PNRREF : R2Z6AE
     * INVENTORY_PNR : NDNZCE
     * TRUE_OD_FEEDER_OPNR : null
     * NR_PAX : 1
     * UPFRONT_DISCOUNT : null
     */

    private String TRUE_OD_FEEDER_OPCARR;
    private String TRUE_OD_DEST;
    private String OPCARR;
    private String COLLCUR;
    private String DOCTYPE;
    private String FLDATE;
    private String FREE_BAG_ALLOWANCE;
    private String TRIP_ORIG;
    private String TRUE_OD_OPCARR_PATH;
    private String PLDATE_ARR_GMT;
    private String PLFROM;
    private String FLDATE_LOC;
    private String BACKEND_DISCOUNT;
    private String PAXNAME;
    private String PRV_FRTH_REJ;
    private String TRUE_OD_PLFROM;
    private String BOOKCLASS;
    private String TRUE_OD_BEYOND_OPCARR;
    private String ORG_ISS_AIRLCD;
    private String TRUE_OD_OPCARR;
    private String RPTSYSID;
    private String NET_VALUE;
    private String REQ_AGT_ISO;
    private String PLDATE_ARR;
    private String STAY_TIME;
    private String OUTG_INV_INCL_TAX;
    private String FREQ_FLY_ACCR;
    private String CC_COMPANY;
    private String FLFROM;
    private String FLAG_CORPORATE_CLIENT;
    private String TRUE_OD_OPNR;
    private String OUTG_INV_PAID_ISC;
    private String FLNR;
    private String CONJ_PRIME_SERNR;
    private String FFP_ADD_AWARD;
    private String REQ_AGT_IATA;
    private String TRUE_OD_NR_CPNS;
    private String STOPOVER_TIME;
    private String PLFH_DATE;
    private String TRUE_OD_OPER_BOOKCLASS;
    private String PNR_BOOKDATE;
    private String TRUE_OD_BEYOND_OPNR;
    private String AIRCRAFT_OWNER;
    private String TOURCODE;
    private String TRIP_DURATION;
    private String OPNR;
    private String ISS_AGT_ISO;
    private String COUPON;
    private String COMM_AMT;
    private String PAXTYPE;
    private String RFS_CODE;
    private String FLTO;
    private String G8_CODE;
    private String ORG_ISS_SERNR;
    private String ISS_AGT_IATA;
    private String FREQ_FLY_AWARD;
    private String FAREBASIS;
    private String PLTO;
    private String DESCDE;
    private String PLDATE_GMT;
    private String ORG_SALDATE;
    private String SERNR;
    private String PREFREV;
    private String TRUE_OD_ORIG;
    private String TRUE_OD_BOOKCLASS;
    private String TRUE_OD_AIRP_PATH;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date SALDATE;
    private String TRUE_OD_PLCARR_PATH;
    private String PNR_BOOKCLASS;
    private String TRUE_OD_PLTO;
    private String PNR_OWNER;
    private String FLCARR;
    private String AGENT_NAME;
    private String GRO_GRO;
    private String COLMONTH;
    private String CALC_TAX_TOTAL;
    private String AIRLCD;
    private String FIRSTSERNR;
    private String PLNR;
    private String YQYR;
    private String TKT_LEAD_TIME;
    private String SUBLGR;
    private String CPN_SEQ_NR;
    private String Q_SURCHARGE;
    private String OUTG_INV_PAID_GSA;
    private String REVENUE_IND;
    private String TRIP_DEST;
    private String TRUE_OD_DIRECTION;
    private String PLCARR;
    private String CORP_REFERENCE;
    private String JOURNEY_TYPE;
    private String SAT_NITE_STAY;
    private String FREQ_FLY_IND;
    private String ORG_ISS_CITY;
    private String TRUE_OD_STOPOVER_TIME;
    private String OPER_BOOKCLASS;
    private String PNRREF;
    private String INVENTORY_PNR;
    private String TRUE_OD_FEEDER_OPNR;
    private String NR_PAX;
    private String UPFRONT_DISCOUNT;

}
