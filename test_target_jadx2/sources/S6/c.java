package S6;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c extends W6.a {
    public static final Parcelable.Creator<c> CREATOR = w.a();

    /* renamed from: d, reason: collision with root package name */
    private static final c f8820d = F().a();

    /* renamed from: e, reason: collision with root package name */
    public static final c f8821e;

    /* renamed from: a, reason: collision with root package name */
    private final e f8822a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8823b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8824c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f8825a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8826b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8827c;

        public c a() {
            c cVar = new c(this.f8825a, this.f8826b);
            cVar.I(this.f8827c);
            return cVar;
        }

        public a b(e eVar) {
            this.f8825a = eVar;
            return this;
        }

        final /* synthetic */ a c(boolean z10) {
            this.f8827c = z10;
            return this;
        }
    }

    static {
        a F10 = F();
        F10.c(true);
        f8821e = F10.a();
    }

    c(e eVar, boolean z10) {
        this.f8822a = eVar;
        this.f8823b = z10;
    }

    public static a F() {
        return new a();
    }

    public static final c j(e eVar) {
        a F10 = F();
        F10.b(eVar);
        return F10.a();
    }

    public static final c u() {
        return f8820d;
    }

    final /* synthetic */ void I(boolean z10) {
        this.f8824c = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC1286q.a(this.f8822a, cVar.f8822a) && this.f8824c == cVar.f8824c && this.f8823b == cVar.f8823b;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f8822a, Boolean.valueOf(this.f8824c), Boolean.valueOf(this.f8823b));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8822a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 31);
        sb2.append("ApiMetadata(complianceOptions=");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f8824c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, this.f8822a, i10, false);
        W6.c.c(parcel, 2, this.f8823b);
        W6.c.b(parcel, a10);
    }
}
