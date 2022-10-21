package io.nology.quadra.moneyapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CurrencyRates {

    private String base;
    private String date;
    private Currencies rates;
    private boolean success;
    private Date timestamp;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Currencies getRates() {
        return rates;
    }

    public void setRates(Currencies rates) {
        this.rates = rates;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyRates that = (CurrencyRates) o;
        return Objects.equals(base, that.base) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CurrencyRates{");
        sb.append("base='").append(base).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append(", rates=").append(rates);
        sb.append(", success=").append(success);
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }

    public static class Currencies {
        @JsonProperty double AED;
        @JsonProperty double AFN;
        @JsonProperty double ALL;
        @JsonProperty double AMD;
        @JsonProperty double ANG;
        @JsonProperty double AOA;
        @JsonProperty double ARS;
        @JsonProperty double AUD;
        @JsonProperty double AWG;
        @JsonProperty double AZN;
        @JsonProperty double BAM;
        @JsonProperty double BBD;
        @JsonProperty double BDT;
        @JsonProperty double BGN;
        @JsonProperty double BHD;
        @JsonProperty double BIF;
        @JsonProperty double BMD;
        @JsonProperty double BND;
        @JsonProperty double BOB;
        @JsonProperty double BRL;
        @JsonProperty double BSD;
        @JsonProperty double BTC;
        @JsonProperty double BTN;
        @JsonProperty double BWP;
        @JsonProperty double BYN;
        @JsonProperty double BYR;
        @JsonProperty double BZD;
        @JsonProperty double CAD;
        @JsonProperty double CDF;
        @JsonProperty double CHF;
        @JsonProperty double CLF;
        @JsonProperty double CLP;
        @JsonProperty double CNY;
        @JsonProperty double COP;
        @JsonProperty double CRC;
        @JsonProperty double CUC;
        @JsonProperty double CUP;
        @JsonProperty double CVE;
        @JsonProperty double CZK;
        @JsonProperty double DJF;
        @JsonProperty double DKK;
        @JsonProperty double DOP;
        @JsonProperty double DZD;
        @JsonProperty double EGP;
        @JsonProperty double ERN;
        @JsonProperty double ETB;
        @JsonProperty double EUR;
        @JsonProperty double FJD;
        @JsonProperty double FKP;
        @JsonProperty double GBP;
        @JsonProperty double GEL;
        @JsonProperty double GGP;
        @JsonProperty double GHS;
        @JsonProperty double GIP;
        @JsonProperty double GMD;
        @JsonProperty double GNF;
        @JsonProperty double GTQ;
        @JsonProperty double GYD;
        @JsonProperty double HKD;
        @JsonProperty double HNL;
        @JsonProperty double HRK;
        @JsonProperty double HTG;
        @JsonProperty double HUF;
        @JsonProperty double IDR;
        @JsonProperty double ILS;
        @JsonProperty double IMP;
        @JsonProperty double INR;
        @JsonProperty double IQD;
        @JsonProperty double IRR;
        @JsonProperty double ISK;
        @JsonProperty double JEP;
        @JsonProperty double JMD;
        @JsonProperty double JOD;
        @JsonProperty double JPY;
        @JsonProperty double KES;
        @JsonProperty double KGS;
        @JsonProperty double KHR;
        @JsonProperty double KMF;
        @JsonProperty double KPW;
        @JsonProperty double KRW;
        @JsonProperty double KWD;
        @JsonProperty double KYD;
        @JsonProperty double KZT;
        @JsonProperty double LAK;
        @JsonProperty double LBP;
        @JsonProperty double LKR;
        @JsonProperty double LRD;
        @JsonProperty double LSL;
        @JsonProperty double LTL;
        @JsonProperty double LVL;
        @JsonProperty double LYD;
        @JsonProperty double MAD;
        @JsonProperty double MDL;
        @JsonProperty double MGA;
        @JsonProperty double MKD;
        @JsonProperty double MMK;
        @JsonProperty double MNT;
        @JsonProperty double MOP;
        @JsonProperty double MRO;
        @JsonProperty double MUR;
        @JsonProperty double MVR;
        @JsonProperty double MWK;
        @JsonProperty double MXN;
        @JsonProperty double MYR;
        @JsonProperty double MZN;
        @JsonProperty double NAD;
        @JsonProperty double NGN;
        @JsonProperty double NIO;
        @JsonProperty double NOK;
        @JsonProperty double NPR;
        @JsonProperty double NZD;
        @JsonProperty double OMR;
        @JsonProperty double PAB;
        @JsonProperty double PEN;
        @JsonProperty double PGK;
        @JsonProperty double PHP;
        @JsonProperty double PKR;
        @JsonProperty double PLN;
        @JsonProperty double PYG;
        @JsonProperty double QAR;
        @JsonProperty double RON;
        @JsonProperty double RSD;
        @JsonProperty double RUB;
        @JsonProperty double RWF;
        @JsonProperty double SAR;
        @JsonProperty double SBD;
        @JsonProperty double SCR;
        @JsonProperty double SDG;
        @JsonProperty double SEK;
        @JsonProperty double SGD;
        @JsonProperty double SHP;
        @JsonProperty double SLL;
        @JsonProperty double SOS;
        @JsonProperty double SRD;
        @JsonProperty double STD;
        @JsonProperty double SVC;
        @JsonProperty double SYP;
        @JsonProperty double SZL;
        @JsonProperty double THB;
        @JsonProperty double TJS;
        @JsonProperty double TMT;
        @JsonProperty double TND;
        @JsonProperty double TOP;
        @JsonProperty double TRY;
        @JsonProperty double TTD;
        @JsonProperty double TWD;
        @JsonProperty double TZS;
        @JsonProperty double UAH;
        @JsonProperty double UGX;
        @JsonProperty double USD;
        @JsonProperty double UYU;
        @JsonProperty double UZS;
        @JsonProperty double VND;
        @JsonProperty double VUV;
        @JsonProperty double WST;
        @JsonProperty double XAF;
        @JsonProperty double XAG;
        @JsonProperty double XAU;
        @JsonProperty double XCD;
        @JsonProperty double XDR;
        @JsonProperty double XOF;
        @JsonProperty double XPF;
        @JsonProperty double YER;
        @JsonProperty double ZAR;
        @JsonProperty double ZMK;
        @JsonProperty double ZMW;
        @JsonProperty double ZWL;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Currencies{");
            sb.append("AED=").append(AED);
            sb.append(", AFN=").append(AFN);
            sb.append(", ALL=").append(ALL);
            sb.append(", AMD=").append(AMD);
            sb.append(", ANG=").append(ANG);
            sb.append(", AOA=").append(AOA);
            sb.append(", ARS=").append(ARS);
            sb.append(", AUD=").append(AUD);
            sb.append(", AWG=").append(AWG);
            sb.append(", AZN=").append(AZN);
            sb.append(", BAM=").append(BAM);
            sb.append(", BBD=").append(BBD);
            sb.append(", BDT=").append(BDT);
            sb.append(", BGN=").append(BGN);
            sb.append(", BHD=").append(BHD);
            sb.append(", BIF=").append(BIF);
            sb.append(", BMD=").append(BMD);
            sb.append(", BND=").append(BND);
            sb.append(", BOB=").append(BOB);
            sb.append(", BRL=").append(BRL);
            sb.append(", BSD=").append(BSD);
            sb.append(", BTC=").append(BTC);
            sb.append(", BTN=").append(BTN);
            sb.append(", BWP=").append(BWP);
            sb.append(", BYN=").append(BYN);
            sb.append(", BYR=").append(BYR);
            sb.append(", BZD=").append(BZD);
            sb.append(", CAD=").append(CAD);
            sb.append(", CDF=").append(CDF);
            sb.append(", CHF=").append(CHF);
            sb.append(", CLF=").append(CLF);
            sb.append(", CLP=").append(CLP);
            sb.append(", CNY=").append(CNY);
            sb.append(", COP=").append(COP);
            sb.append(", CRC=").append(CRC);
            sb.append(", CUC=").append(CUC);
            sb.append(", CUP=").append(CUP);
            sb.append(", CVE=").append(CVE);
            sb.append(", CZK=").append(CZK);
            sb.append(", DJF=").append(DJF);
            sb.append(", DKK=").append(DKK);
            sb.append(", DOP=").append(DOP);
            sb.append(", DZD=").append(DZD);
            sb.append(", EGP=").append(EGP);
            sb.append(", ERN=").append(ERN);
            sb.append(", ETB=").append(ETB);
            sb.append(", EUR=").append(EUR);
            sb.append(", FJD=").append(FJD);
            sb.append(", FKP=").append(FKP);
            sb.append(", GBP=").append(GBP);
            sb.append(", GEL=").append(GEL);
            sb.append(", GGP=").append(GGP);
            sb.append(", GHS=").append(GHS);
            sb.append(", GIP=").append(GIP);
            sb.append(", GMD=").append(GMD);
            sb.append(", GNF=").append(GNF);
            sb.append(", GTQ=").append(GTQ);
            sb.append(", GYD=").append(GYD);
            sb.append(", HKD=").append(HKD);
            sb.append(", HNL=").append(HNL);
            sb.append(", HRK=").append(HRK);
            sb.append(", HTG=").append(HTG);
            sb.append(", HUF=").append(HUF);
            sb.append(", IDR=").append(IDR);
            sb.append(", ILS=").append(ILS);
            sb.append(", IMP=").append(IMP);
            sb.append(", INR=").append(INR);
            sb.append(", IQD=").append(IQD);
            sb.append(", IRR=").append(IRR);
            sb.append(", ISK=").append(ISK);
            sb.append(", JEP=").append(JEP);
            sb.append(", JMD=").append(JMD);
            sb.append(", JOD=").append(JOD);
            sb.append(", JPY=").append(JPY);
            sb.append(", KES=").append(KES);
            sb.append(", KGS=").append(KGS);
            sb.append(", KHR=").append(KHR);
            sb.append(", KMF=").append(KMF);
            sb.append(", KPW=").append(KPW);
            sb.append(", KRW=").append(KRW);
            sb.append(", KWD=").append(KWD);
            sb.append(", KYD=").append(KYD);
            sb.append(", KZT=").append(KZT);
            sb.append(", LAK=").append(LAK);
            sb.append(", LBP=").append(LBP);
            sb.append(", LKR=").append(LKR);
            sb.append(", LRD=").append(LRD);
            sb.append(", LSL=").append(LSL);
            sb.append(", LTL=").append(LTL);
            sb.append(", LVL=").append(LVL);
            sb.append(", LYD=").append(LYD);
            sb.append(", MAD=").append(MAD);
            sb.append(", MDL=").append(MDL);
            sb.append(", MGA=").append(MGA);
            sb.append(", MKD=").append(MKD);
            sb.append(", MMK=").append(MMK);
            sb.append(", MNT=").append(MNT);
            sb.append(", MOP=").append(MOP);
            sb.append(", MRO=").append(MRO);
            sb.append(", MUR=").append(MUR);
            sb.append(", MVR=").append(MVR);
            sb.append(", MWK=").append(MWK);
            sb.append(", MXN=").append(MXN);
            sb.append(", MYR=").append(MYR);
            sb.append(", MZN=").append(MZN);
            sb.append(", NAD=").append(NAD);
            sb.append(", NGN=").append(NGN);
            sb.append(", NIO=").append(NIO);
            sb.append(", NOK=").append(NOK);
            sb.append(", NPR=").append(NPR);
            sb.append(", NZD=").append(NZD);
            sb.append(", OMR=").append(OMR);
            sb.append(", PAB=").append(PAB);
            sb.append(", PEN=").append(PEN);
            sb.append(", PGK=").append(PGK);
            sb.append(", PHP=").append(PHP);
            sb.append(", PKR=").append(PKR);
            sb.append(", PLN=").append(PLN);
            sb.append(", PYG=").append(PYG);
            sb.append(", QAR=").append(QAR);
            sb.append(", RON=").append(RON);
            sb.append(", RSD=").append(RSD);
            sb.append(", RUB=").append(RUB);
            sb.append(", RWF=").append(RWF);
            sb.append(", SAR=").append(SAR);
            sb.append(", SBD=").append(SBD);
            sb.append(", SCR=").append(SCR);
            sb.append(", SDG=").append(SDG);
            sb.append(", SEK=").append(SEK);
            sb.append(", SGD=").append(SGD);
            sb.append(", SHP=").append(SHP);
            sb.append(", SLL=").append(SLL);
            sb.append(", SOS=").append(SOS);
            sb.append(", SRD=").append(SRD);
            sb.append(", STD=").append(STD);
            sb.append(", SVC=").append(SVC);
            sb.append(", SYP=").append(SYP);
            sb.append(", SZL=").append(SZL);
            sb.append(", THB=").append(THB);
            sb.append(", TJS=").append(TJS);
            sb.append(", TMT=").append(TMT);
            sb.append(", TND=").append(TND);
            sb.append(", TOP=").append(TOP);
            sb.append(", TRY=").append(TRY);
            sb.append(", TTD=").append(TTD);
            sb.append(", TWD=").append(TWD);
            sb.append(", TZS=").append(TZS);
            sb.append(", UAH=").append(UAH);
            sb.append(", UGX=").append(UGX);
            sb.append(", USD=").append(USD);
            sb.append(", UYU=").append(UYU);
            sb.append(", UZS=").append(UZS);
            sb.append(", VND=").append(VND);
            sb.append(", VUV=").append(VUV);
            sb.append(", WST=").append(WST);
            sb.append(", XAF=").append(XAF);
            sb.append(", XAG=").append(XAG);
            sb.append(", XAU=").append(XAU);
            sb.append(", XCD=").append(XCD);
            sb.append(", XDR=").append(XDR);
            sb.append(", XOF=").append(XOF);
            sb.append(", XPF=").append(XPF);
            sb.append(", YER=").append(YER);
            sb.append(", ZAR=").append(ZAR);
            sb.append(", ZMK=").append(ZMK);
            sb.append(", ZMW=").append(ZMW);
            sb.append(", ZWL=").append(ZWL);
            sb.append('}');
            return sb.toString();
        }
    }

}
