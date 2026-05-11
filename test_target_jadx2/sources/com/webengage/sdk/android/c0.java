package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.actions.database.ReportingStrategy;

/* loaded from: classes2.dex */
public class c0 extends C2965m {
    protected c0(Context context) {
        super(context);
    }

    public void a(LocationTrackingStrategy locationTrackingStrategy) {
        a("location_tracking_strategy", (Object) locationTrackingStrategy.name());
    }

    void l(String str) {
        a("license_code", (Object) str);
    }

    public ReportingStrategy w() {
        return ReportingStrategy.valueOf(b("webengage_prefs.txt").getString("event_reporting_strategy", ReportingStrategy.BUFFER.name()));
    }

    String x() {
        return b("webengage_prefs.txt").getString("license_code", null);
    }

    public boolean y() {
        return b("webengage_prefs.txt").getBoolean("location_tracking_flag", true);
    }

    public LocationTrackingStrategy z() {
        return LocationTrackingStrategy.valueOf(b("webengage_prefs.txt").getString("location_tracking_strategy", LocationTrackingStrategy.ACCURACY_CITY.name()));
    }

    public void a(ReportingStrategy reportingStrategy) {
        a("event_reporting_strategy", (Object) reportingStrategy.name());
    }

    public void a(boolean z10) {
        a("location_tracking_flag", Boolean.valueOf(z10));
    }
}
