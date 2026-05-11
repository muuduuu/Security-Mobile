package co.hyperverge.hypersnapsdk.service.sensorbiometrics;

/* loaded from: classes.dex */
public class SensorData {
    private float azimuth;
    private float pitch;
    private float roll;

    public SensorData(float f10, float f11, float f12) {
        this.azimuth = f10;
        this.pitch = f11;
        this.roll = f12;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof SensorData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SensorData)) {
            return false;
        }
        SensorData sensorData = (SensorData) obj;
        return sensorData.canEqual(this) && Float.compare(getAzimuth(), sensorData.getAzimuth()) == 0 && Float.compare(getPitch(), sensorData.getPitch()) == 0 && Float.compare(getRoll(), sensorData.getRoll()) == 0;
    }

    public float getAzimuth() {
        return this.azimuth;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float getRoll() {
        return this.roll;
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(getAzimuth()) + 59) * 59) + Float.floatToIntBits(getPitch())) * 59) + Float.floatToIntBits(getRoll());
    }

    public void setAzimuth(float f10) {
        this.azimuth = f10;
    }

    public void setPitch(float f10) {
        this.pitch = f10;
    }

    public void setRoll(float f10) {
        this.roll = f10;
    }

    public String toString() {
        return "SensorData(azimuth=" + getAzimuth() + ", pitch=" + getPitch() + ", roll=" + getRoll() + ")";
    }
}
