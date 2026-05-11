package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class O8 extends W6.a {
    public static final Parcelable.Creator<O8> CREATOR = new d9();

    /* renamed from: a, reason: collision with root package name */
    private final S8 f39584a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39585b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39586c;

    /* renamed from: d, reason: collision with root package name */
    private final T8[] f39587d;

    /* renamed from: e, reason: collision with root package name */
    private final Q8[] f39588e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f39589f;

    /* renamed from: g, reason: collision with root package name */
    private final K8[] f39590g;

    public O8(S8 s82, String str, String str2, T8[] t8Arr, Q8[] q8Arr, String[] strArr, K8[] k8Arr) {
        this.f39584a = s82;
        this.f39585b = str;
        this.f39586c = str2;
        this.f39587d = t8Arr;
        this.f39588e = q8Arr;
        this.f39589f = strArr;
        this.f39590g = k8Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, this.f39584a, i10, false);
        W6.c.u(parcel, 2, this.f39585b, false);
        W6.c.u(parcel, 3, this.f39586c, false);
        W6.c.x(parcel, 4, this.f39587d, i10, false);
        W6.c.x(parcel, 5, this.f39588e, i10, false);
        W6.c.v(parcel, 6, this.f39589f, false);
        W6.c.x(parcel, 7, this.f39590g, i10, false);
        W6.c.b(parcel, a10);
    }
}
