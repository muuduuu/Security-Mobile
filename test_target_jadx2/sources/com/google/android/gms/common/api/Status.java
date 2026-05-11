package com.google.android.gms.common.api;

import S6.d;
import S6.o;
import V6.AbstractC1286q;
import V6.AbstractC1287s;
import W6.c;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.m;

/* loaded from: classes2.dex */
public final class Status extends W6.a implements o, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f23346a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23347b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f23348c;

    /* renamed from: d, reason: collision with root package name */
    private final C2010b f23349d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f23338e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f23339f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f23340g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f23341h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f23342i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f23343j = new Status(16);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f23344k = new Status(17);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f23345l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i10, String str, PendingIntent pendingIntent, C2010b c2010b) {
        this.f23346a = i10;
        this.f23347b = str;
        this.f23348c = pendingIntent;
        this.f23349d = c2010b;
    }

    public String F() {
        return this.f23347b;
    }

    public boolean I() {
        return this.f23348c != null;
    }

    public boolean Z0() {
        return this.f23346a <= 0;
    }

    public void a1(Activity activity, int i10) {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        if (I()) {
            if (m.j()) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            PendingIntent pendingIntent = this.f23348c;
            AbstractC1287s.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle2);
        }
    }

    @Override // S6.o
    public Status c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f23346a == status.f23346a && AbstractC1286q.a(this.f23347b, status.f23347b) && AbstractC1286q.a(this.f23348c, status.f23348c) && AbstractC1286q.a(this.f23349d, status.f23349d);
    }

    public final String g1() {
        String str = this.f23347b;
        return str != null ? str : d.a(this.f23346a);
    }

    public int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f23346a), this.f23347b, this.f23348c, this.f23349d);
    }

    public C2010b j() {
        return this.f23349d;
    }

    public String toString() {
        AbstractC1286q.a c10 = AbstractC1286q.c(this);
        c10.a(Keys.STATUS_CODE, g1());
        c10.a("resolution", this.f23348c);
        return c10.toString();
    }

    public int u() {
        return this.f23346a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, u());
        c.u(parcel, 2, F(), false);
        c.s(parcel, 3, this.f23348c, i10, false);
        c.s(parcel, 4, j(), i10, false);
        c.b(parcel, a10);
    }

    public boolean y0() {
        return this.f23346a == 16;
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(C2010b c2010b, String str) {
        this(c2010b, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(C2010b c2010b, String str, int i10) {
        this(i10, str, c2010b.I(), c2010b);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
