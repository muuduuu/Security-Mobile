package co.hyperverge.hypersnapsdk.objects;

import O8.c;
import java.util.Date;

/* loaded from: classes.dex */
public class IPAddress {
    private Date createdAt;

    @c("geoDetails")
    private GeoDetails geoDetails;

    @c("ipAddress")
    private String ip;

    protected boolean canEqual(Object obj) {
        return obj instanceof IPAddress;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IPAddress)) {
            return false;
        }
        IPAddress iPAddress = (IPAddress) obj;
        if (!iPAddress.canEqual(this)) {
            return false;
        }
        String ip = getIp();
        String ip2 = iPAddress.getIp();
        if (ip != null ? !ip.equals(ip2) : ip2 != null) {
            return false;
        }
        GeoDetails geoDetails = getGeoDetails();
        GeoDetails geoDetails2 = iPAddress.getGeoDetails();
        if (geoDetails != null ? !geoDetails.equals(geoDetails2) : geoDetails2 != null) {
            return false;
        }
        Date createdAt = getCreatedAt();
        Date createdAt2 = iPAddress.getCreatedAt();
        return createdAt != null ? createdAt.equals(createdAt2) : createdAt2 == null;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public GeoDetails getGeoDetails() {
        return this.geoDetails;
    }

    public String getIp() {
        return this.ip;
    }

    public int hashCode() {
        String ip = getIp();
        int hashCode = ip == null ? 43 : ip.hashCode();
        GeoDetails geoDetails = getGeoDetails();
        int hashCode2 = ((hashCode + 59) * 59) + (geoDetails == null ? 43 : geoDetails.hashCode());
        Date createdAt = getCreatedAt();
        return (hashCode2 * 59) + (createdAt != null ? createdAt.hashCode() : 43);
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setGeoDetails(GeoDetails geoDetails) {
        this.geoDetails = geoDetails;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public String toString() {
        return "IPAddress(ip=" + getIp() + ", geoDetails=" + getGeoDetails() + ", createdAt=" + getCreatedAt() + ")";
    }
}
