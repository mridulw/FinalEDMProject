package net.codejava;

public class VQuarterRevenue {
   String quarters;
   String sales_r001;
   String sales_r002;
   String sales_r003;

    public String getQuarters() {
        return this.quarters;
    }

    public void setQuarters(String quarters) {
        this.quarters = quarters;
    }

    public String getSales_r001() {
        return this.sales_r001;
    }

    public void setSales_r001(String sales_r001) {
        this.sales_r001 = sales_r001;
    }

    public String getSales_r002() {
        return this.sales_r002;
    }

    public void setSales_r002(String sales_r002) {
        this.sales_r002 = sales_r002;
    }

    public String getSales_r003() {
        return this.sales_r003;
    }

    public void setSales_r003(String sales_r003) {
        this.sales_r003 = sales_r003;
    }

    public VQuarterRevenue(String quarters, String sales_r001, String sales_r002, String sales_r003) {
        this.quarters = quarters;
        this.sales_r001 = sales_r001;
        this.sales_r002 = sales_r002;
        this.sales_r003 = sales_r003;
    }

    public VQuarterRevenue() {
    }

    @Override
    public String toString() {
        return "{" +
            " quarters='" + getQuarters() + "'" +
            ", sales_r001='" + getSales_r001() + "'" +
            ", sales_r002='" + getSales_r002() + "'" +
            ", sales_r003='" + getSales_r003() + "'" +
            "}";
    }

}
