package S6;

import V6.AbstractC1286q;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e extends W6.a {
    public static final Parcelable.Creator<e> CREATOR;

    /* renamed from: e, reason: collision with root package name */
    public static final e f8828e;

    /* renamed from: a, reason: collision with root package name */
    private final int f8829a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8830b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8831c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8832d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8833a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f8834b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f8835c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8836d = true;

        public e a() {
            return new e(this.f8833a, this.f8834b, this.f8835c, this.f8836d);
        }

        public a b(int i10) {
            this.f8833a = i10;
            return this;
        }

        public a c(int i10) {
            this.f8834b = i10;
            return this;
        }

        public a d(boolean z10) {
            this.f8836d = z10;
            return this;
        }

        public a e(int i10) {
            this.f8835c = i10;
            return this;
        }
    }

    static {
        a j10 = j();
        j10.b(-1);
        j10.c(-1);
        j10.e(0);
        j10.d(true);
        f8828e = j10.a();
        CREATOR = new y();
    }

    e(int i10, int i11, int i12, boolean z10) {
        this.f8829a = i10;
        this.f8830b = i11;
        this.f8831c = i12;
        this.f8832d = z10;
    }

    public static a j() {
        return new a();
    }

    public static final a u(Context context) {
        return j();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8829a == eVar.f8829a && this.f8830b == eVar.f8830b && this.f8831c == eVar.f8831c && this.f8832d == eVar.f8832d;
    }

    public final int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f8829a), Integer.valueOf(this.f8830b), Integer.valueOf(this.f8831c), Boolean.valueOf(this.f8832d));
    }

    public final String toString() {
        int i10 = this.f8829a;
        int length = String.valueOf(i10).length();
        int i11 = this.f8830b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f8831c;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f8832d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i10);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i11);
        sb2.append(", processingReason=");
        sb2.append(i12);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8829a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.m(parcel, 2, this.f8830b);
        W6.c.m(parcel, 3, this.f8831c);
        W6.c.c(parcel, 4, this.f8832d);
        W6.c.b(parcel, a10);
    }
}
