package ec;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;

/* renamed from: ec.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3120b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f32549b = C3120b.class.getCanonicalName() + ".KEY";

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f32550a;

    public C3120b(Context context) {
        this.f32550a = context.getSharedPreferences("LOCATION_STORE", 0);
    }

    private String b(String str, String str2) {
        return f32549b + "_" + str + "_" + str2;
    }

    public Location a(String str) {
        SharedPreferences sharedPreferences = this.f32550a;
        if (sharedPreferences == null || !sharedPreferences.contains(b(str, "LATITUDE")) || !this.f32550a.contains(b(str, "LONGITUDE"))) {
            return null;
        }
        Location location = new Location(this.f32550a.getString("PROVIDER", "LocationStore"));
        location.setLatitude(Double.longBitsToDouble(this.f32550a.getLong(b(str, "LATITUDE"), 0L)));
        location.setLongitude(Double.longBitsToDouble(this.f32550a.getLong(b(str, "LONGITUDE"), 0L)));
        location.setAccuracy(this.f32550a.getFloat(b(str, "ACCURACY"), 0.0f));
        location.setAltitude(Double.longBitsToDouble(this.f32550a.getLong(b(str, "ALTITUDE"), 0L)));
        location.setSpeed(this.f32550a.getFloat(b(str, "SPEED"), 0.0f));
        location.setTime(this.f32550a.getLong(b(str, "TIME"), 0L));
        location.setBearing(this.f32550a.getFloat(b(str, "BEARING"), 0.0f));
        return location;
    }

    public void c(String str, Location location) {
        SharedPreferences.Editor edit = this.f32550a.edit();
        edit.putString(b(str, "PROVIDER"), location.getProvider());
        edit.putLong(b(str, "LATITUDE"), Double.doubleToLongBits(location.getLatitude()));
        edit.putLong(b(str, "LONGITUDE"), Double.doubleToLongBits(location.getLongitude()));
        edit.putFloat(b(str, "ACCURACY"), location.getAccuracy());
        edit.putLong(b(str, "ALTITUDE"), Double.doubleToLongBits(location.getAltitude()));
        edit.putFloat(b(str, "SPEED"), location.getSpeed());
        edit.putLong(b(str, "TIME"), location.getTime());
        edit.putFloat(b(str, "BEARING"), location.getBearing());
        edit.apply();
    }
}
