package K6;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class a extends W6.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    private final int f5463a;

    /* renamed from: K6.a$a, reason: collision with other inner class name */
    public static final class C0102a {
        /* synthetic */ C0102a(byte[] bArr) {
        }

        public a a() {
            return new a(0);
        }
    }

    a(int i10) {
        this.f5463a = i10;
    }

    public static C0102a j() {
        return new C0102a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return AbstractC1286q.a(Integer.valueOf(this.f5463a), Integer.valueOf(((a) obj).f5463a));
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f5463a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f5463a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.b(parcel, a10);
    }
}
