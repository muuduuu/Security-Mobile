package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4169o extends W6.a {
    public static final Parcelable.Creator<C4169o> CREATOR = new C4179p();

    /* renamed from: a, reason: collision with root package name */
    public int f40164a;

    /* renamed from: b, reason: collision with root package name */
    public int f40165b;

    /* renamed from: c, reason: collision with root package name */
    public int f40166c;

    /* renamed from: d, reason: collision with root package name */
    public long f40167d;

    /* renamed from: e, reason: collision with root package name */
    public int f40168e;

    public C4169o(int i10, int i11, int i12, long j10, int i13) {
        this.f40164a = i10;
        this.f40165b = i11;
        this.f40166c = i12;
        this.f40167d = j10;
        this.f40168e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f40164a);
        W6.c.m(parcel, 3, this.f40165b);
        W6.c.m(parcel, 4, this.f40166c);
        W6.c.q(parcel, 5, this.f40167d);
        W6.c.m(parcel, 6, this.f40168e);
        W6.c.b(parcel, a10);
    }
}
