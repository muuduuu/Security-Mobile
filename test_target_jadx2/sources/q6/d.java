package Q6;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d extends W6.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8267a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8268b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8269c;

    public d(boolean z10, long j10, long j11) {
        this.f8267a = z10;
        this.f8268b = j10;
        this.f8269c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f8267a == dVar.f8267a && this.f8268b == dVar.f8268b && this.f8269c == dVar.f8269c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(Boolean.valueOf(this.f8267a), Long.valueOf(this.f8268b), Long.valueOf(this.f8269c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f8267a + ",collectForDebugStartTimeMillis: " + this.f8268b + ",collectForDebugExpiryTimeMillis: " + this.f8269c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.c(parcel, 1, this.f8267a);
        W6.c.q(parcel, 2, this.f8269c);
        W6.c.q(parcel, 3, this.f8268b);
        W6.c.b(parcel, a10);
    }
}
