package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.x7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4266x7 extends W6.a {
    public static final Parcelable.Creator<C4266x7> CREATOR = new C4089g();

    /* renamed from: a, reason: collision with root package name */
    public String f40491a;

    /* renamed from: b, reason: collision with root package name */
    public String f40492b;

    public C4266x7(String str, String str2) {
        this.f40491a = str;
        this.f40492b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f40491a, false);
        W6.c.u(parcel, 3, this.f40492b, false);
        W6.c.b(parcel, a10);
    }
}
