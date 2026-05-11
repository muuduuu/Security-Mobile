package com.google.android.gms.common;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* renamed from: com.google.android.gms.common.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2010b extends W6.a {

    /* renamed from: a, reason: collision with root package name */
    final int f23475a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23476b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f23477c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23478d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f23479e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2010b f23474f = new C2010b(0);
    public static final Parcelable.Creator<C2010b> CREATOR = new C2031x();

    C2010b(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f23475a = i10;
        this.f23476b = i11;
        this.f23477c = pendingIntent;
        this.f23478d = str;
        this.f23479e = num;
    }

    static String g1(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        return "TIMEOUT";
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        return "INTERRUPTED";
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        return "API_UNAVAILABLE";
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        return "API_DISABLED";
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public String F() {
        return this.f23478d;
    }

    public PendingIntent I() {
        return this.f23477c;
    }

    public boolean Z0() {
        return this.f23476b == 0;
    }

    public void a1(Activity activity, int i10) {
        if (y0()) {
            PendingIntent pendingIntent = this.f23477c;
            AbstractC1287s.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2010b)) {
            return false;
        }
        C2010b c2010b = (C2010b) obj;
        return this.f23476b == c2010b.f23476b && AbstractC1286q.a(this.f23477c, c2010b.f23477c) && AbstractC1286q.a(this.f23478d, c2010b.f23478d) && AbstractC1286q.a(this.f23479e, c2010b.f23479e);
    }

    public int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f23476b), this.f23477c, this.f23478d, this.f23479e);
    }

    public Integer j() {
        return this.f23479e;
    }

    public String toString() {
        AbstractC1286q.a c10 = AbstractC1286q.c(this);
        c10.a(Keys.STATUS_CODE, g1(this.f23476b));
        c10.a("resolution", this.f23477c);
        c10.a("message", this.f23478d);
        c10.a("clientMethodKey", this.f23479e);
        return c10.toString();
    }

    public int u() {
        return this.f23476b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23475a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.m(parcel, 2, u());
        W6.c.s(parcel, 3, I(), i10, false);
        W6.c.u(parcel, 4, F(), false);
        W6.c.p(parcel, 5, j(), false);
        W6.c.b(parcel, a10);
    }

    public boolean y0() {
        return (this.f23476b == 0 || this.f23477c == null) ? false : true;
    }

    public C2010b(int i10) {
        this(i10, null, null);
    }

    public C2010b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C2010b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
