package co.hyperverge.hypersnapsdk.objects;

/* loaded from: classes.dex */
public class HVExifData {
    private String aperture;
    private String datetime;
    private String exposureTime;
    private String flash;
    private String focalLength;
    private String iso;
    private float latitude;
    private float longitude;
    private String make;
    private String model;
    private String userComment;
    private String whiteBalance;

    public String getAperture() {
        return this.aperture;
    }

    public String getDatetime() {
        return this.datetime;
    }

    public String getExposureTime() {
        return this.exposureTime;
    }

    public String getFlash() {
        return this.flash;
    }

    public String getFocalLength() {
        return this.focalLength;
    }

    public String getIso() {
        return this.iso;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getUserComment() {
        return this.userComment;
    }

    public String getWhiteBalance() {
        return this.whiteBalance;
    }

    public void setAperture(String str) {
        this.aperture = str;
    }

    public void setDatetime(String str) {
        this.datetime = str;
    }

    public void setExposureTime(String str) {
        this.exposureTime = str;
    }

    public void setFlash(String str) {
        this.flash = str;
    }

    public void setFocalLength(String str) {
        this.focalLength = str;
    }

    public void setIso(String str) {
        this.iso = str;
    }

    public void setLatitude(float f10) {
        this.latitude = f10;
    }

    public void setLongitude(float f10) {
        this.longitude = f10;
    }

    public void setMake(String str) {
        this.make = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setUserComment(String str) {
        this.userComment = str;
    }

    public void setWhiteBalance(String str) {
        this.whiteBalance = str;
    }

    public String toString() {
        return "HVExifData{aperture='" + this.aperture + "', datetime='" + this.datetime + "', exposureTime='" + this.exposureTime + "', flash='" + this.flash + "', focalLength='" + this.focalLength + "', iso='" + this.iso + "', make='" + this.make + "', model='" + this.model + "', whiteBalance='" + this.whiteBalance + "', longitude=" + this.longitude + ", latitude=" + this.latitude + ", userComment=" + this.userComment + '}';
    }
}
