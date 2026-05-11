package com.google.android.gms.location;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import W6.e;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Array;
import java.util.List;
import x7.C5116A;
import x7.C5119b;

/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends W6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C5116A();

    /* renamed from: a, reason: collision with root package name */
    List f25229a;

    /* renamed from: b, reason: collision with root package name */
    long f25230b;

    /* renamed from: c, reason: collision with root package name */
    long f25231c;

    /* renamed from: d, reason: collision with root package name */
    int f25232d;

    /* renamed from: e, reason: collision with root package name */
    Bundle f25233e;

    public ActivityRecognitionResult(List list, long j10, long j11, int i10, Bundle bundle) {
        AbstractC1287s.b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        AbstractC1287s.b(j10 > 0 && j11 > 0, "Must set times");
        this.f25229a = list;
        this.f25230b = j10;
        this.f25231c = j11;
        this.f25232d = i10;
        this.f25233e = bundle;
    }

    public static boolean F(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List I10 = I(intent);
        return (I10 == null || I10.isEmpty()) ? false : true;
    }

    public static List I(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return e.c(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ActivityRecognitionResult j(Intent intent) {
        Bundle extras;
        ActivityRecognitionResult activityRecognitionResult;
        if (F(intent) && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) e.a((byte[]) obj, CREATOR);
            } else if (obj instanceof ActivityRecognitionResult) {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            }
            if (activityRecognitionResult == null) {
                return activityRecognitionResult;
            }
            List I10 = I(intent);
            if (I10 == null || I10.isEmpty()) {
                return null;
            }
            return (ActivityRecognitionResult) I10.get(I10.size() - 1);
        }
        activityRecognitionResult = null;
        if (activityRecognitionResult == null) {
        }
    }

    private static boolean y0(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!y0(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i10 = 0; i10 < length; i10++) {
                            if (AbstractC1286q.a(Array.get(obj, i10), Array.get(obj2, i10))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f25230b == activityRecognitionResult.f25230b && this.f25231c == activityRecognitionResult.f25231c && this.f25232d == activityRecognitionResult.f25232d && AbstractC1286q.a(this.f25229a, activityRecognitionResult.f25229a) && y0(this.f25233e, activityRecognitionResult.f25233e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(Long.valueOf(this.f25230b), Long.valueOf(this.f25231c), Integer.valueOf(this.f25232d), this.f25229a, this.f25233e);
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + String.valueOf(this.f25229a) + ", timeMillis=" + this.f25230b + ", elapsedRealtimeMillis=" + this.f25231c + "]";
    }

    public C5119b u() {
        return (C5119b) this.f25229a.get(0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.y(parcel, 1, this.f25229a, false);
        W6.c.q(parcel, 2, this.f25230b);
        W6.c.q(parcel, 3, this.f25231c);
        W6.c.m(parcel, 4, this.f25232d);
        W6.c.e(parcel, 5, this.f25233e, false);
        W6.c.b(parcel, a10);
    }
}
