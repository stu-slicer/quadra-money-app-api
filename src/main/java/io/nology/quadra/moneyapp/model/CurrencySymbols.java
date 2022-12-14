package io.nology.quadra.moneyapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencySymbols {

    private Symbols symbols;
    private boolean success;

    public Symbols getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class Symbols {
        @JsonProperty public String AED;
        @JsonProperty public String AFN;
        @JsonProperty public String ALL;
        @JsonProperty public String AMD;
        @JsonProperty public String ANG;
        @JsonProperty public String AOA;
        @JsonProperty public String ARS;
        @JsonProperty public String AUD;
        @JsonProperty public String AWG;
        @JsonProperty public String AZN;
        @JsonProperty public String BAM;
        @JsonProperty public String BBD;
        @JsonProperty public String BDT;
        @JsonProperty public String BGN;
        @JsonProperty public String BHD;
        @JsonProperty public String BIF;
        @JsonProperty public String BMD;
        @JsonProperty public String BND;
        @JsonProperty public String BOB;
        @JsonProperty public String BRL;
        @JsonProperty public String BSD;
        @JsonProperty public String BTC;
        @JsonProperty public String BTN;
        @JsonProperty public String BWP;
        @JsonProperty public String BYN;
        @JsonProperty public String BYR;
        @JsonProperty public String BZD;
        @JsonProperty public String CAD;
        @JsonProperty public String CDF;
        @JsonProperty public String CHF;
        @JsonProperty public String CLF;
        @JsonProperty public String CLP;
        @JsonProperty public String CNY;
        @JsonProperty public String COP;
        @JsonProperty public String CRC;
        @JsonProperty public String CUC;
        @JsonProperty public String CUP;
        @JsonProperty public String CVE;
        @JsonProperty public String CZK;
        @JsonProperty public String DJF;
        @JsonProperty public String DKK;
        @JsonProperty public String DOP;
        @JsonProperty public String DZD;
        @JsonProperty public String EGP;
        @JsonProperty public String ERN;
        @JsonProperty public String ETB;
        @JsonProperty public String EUR;
        @JsonProperty public String FJD;
        @JsonProperty public String FKP;
        @JsonProperty public String GBP;
        @JsonProperty public String GEL;
        @JsonProperty public String GGP;
        @JsonProperty public String GHS;
        @JsonProperty public String GIP;
        @JsonProperty public String GMD;
        @JsonProperty public String GNF;
        @JsonProperty public String GTQ;
        @JsonProperty public String GYD;
        @JsonProperty public String HKD;
        @JsonProperty public String HNL;
        @JsonProperty public String HRK;
        @JsonProperty public String HTG;
        @JsonProperty public String HUF;
        @JsonProperty public String IDR;
        @JsonProperty public String ILS;
        @JsonProperty public String IMP;
        @JsonProperty public String INR;
        @JsonProperty public String IQD;
        @JsonProperty public String IRR;
        @JsonProperty public String ISK;
        @JsonProperty public String JEP;
        @JsonProperty public String JMD;
        @JsonProperty public String JOD;
        @JsonProperty public String JPY;
        @JsonProperty public String KES;
        @JsonProperty public String KGS;
        @JsonProperty public String KHR;
        @JsonProperty public String KMF;
        @JsonProperty public String KPW;
        @JsonProperty public String KRW;
        @JsonProperty public String KWD;
        @JsonProperty public String KYD;
        @JsonProperty public String KZT;
        @JsonProperty public String LAK;
        @JsonProperty public String LBP;
        @JsonProperty public String LKR;
        @JsonProperty public String LRD;
        @JsonProperty public String LSL;
        @JsonProperty public String LTL;
        @JsonProperty public String LVL;
        @JsonProperty public String LYD;
        @JsonProperty public String MAD;
        @JsonProperty public String MDL;
        @JsonProperty public String MGA;
        @JsonProperty public String MKD;
        @JsonProperty public String MMK;
        @JsonProperty public String MNT;
        @JsonProperty public String MOP;
        @JsonProperty public String MRO;
        @JsonProperty public String MUR;
        @JsonProperty public String MVR;
        @JsonProperty public String MWK;
        @JsonProperty public String MXN;
        @JsonProperty public String MYR;
        @JsonProperty public String MZN;
        @JsonProperty public String NAD;
        @JsonProperty public String NGN;
        @JsonProperty public String NIO;
        @JsonProperty public String NOK;
        @JsonProperty public String NPR;
        @JsonProperty public String NZD;
        @JsonProperty public String OMR;
        @JsonProperty public String PAB;
        @JsonProperty public String PEN;
        @JsonProperty public String PGK;
        @JsonProperty public String PHP;
        @JsonProperty public String PKR;
        @JsonProperty public String PLN;
        @JsonProperty public String PYG;
        @JsonProperty public String QAR;
        @JsonProperty public String RON;
        @JsonProperty public String RSD;
        @JsonProperty public String RUB;
        @JsonProperty public String RWF;
        @JsonProperty public String SAR;
        @JsonProperty public String SBD;
        @JsonProperty public String SCR;
        @JsonProperty public String SDG;
        @JsonProperty public String SEK;
        @JsonProperty public String SGD;
        @JsonProperty public String SHP;
        @JsonProperty public String SLL;
        @JsonProperty public String SOS;
        @JsonProperty public String SRD;
        @JsonProperty public String STD;
        @JsonProperty public String SVC;
        @JsonProperty public String SYP;
        @JsonProperty public String SZL;
        @JsonProperty public String THB;
        @JsonProperty public String TJS;
        @JsonProperty public String TMT;
        @JsonProperty public String TND;
        @JsonProperty public String TOP;
        @JsonProperty public String TRY;
        @JsonProperty public String TTD;
        @JsonProperty public String TWD;
        @JsonProperty public String TZS;
        @JsonProperty public String UAH;
        @JsonProperty public String UGX;
        @JsonProperty public String USD;
        @JsonProperty public String UYU;
        @JsonProperty public String UZS;
        @JsonProperty public String VND;
        @JsonProperty public String VUV;
        @JsonProperty public String WST;
        @JsonProperty public String XAF;
        @JsonProperty public String XAG;
        @JsonProperty public String XAU;
        @JsonProperty public String XCD;
        @JsonProperty public String XDR;
        @JsonProperty public String XOF;
        @JsonProperty public String XPF;
        @JsonProperty public String YER;
        @JsonProperty public String ZAR;
        @JsonProperty public String ZMK;
        @JsonProperty public String ZMW;
        @JsonProperty public String ZWL;

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
