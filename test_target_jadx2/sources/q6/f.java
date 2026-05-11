package Q6;

import Q6.a;
import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.M1;
import com.google.android.gms.internal.clearcut.X1;
import java.util.Arrays;
import z7.C5262a;

/* loaded from: classes2.dex */
public final class f extends W6.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public X1 f8270a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8271b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f8272c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f8273d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f8274e;

    /* renamed from: f, reason: collision with root package name */
    private byte[][] f8275f;

    /* renamed from: g, reason: collision with root package name */
    private C5262a[] f8276g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8277h;

    /* renamed from: i, reason: collision with root package name */
    public final M1 f8278i;

    public f(X1 x12, M1 m12, a.c cVar, a.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, C5262a[] c5262aArr, boolean z10) {
        this.f8270a = x12;
        this.f8278i = m12;
        this.f8272c = iArr;
        this.f8273d = null;
        this.f8274e = iArr2;
        this.f8275f = null;
        this.f8276g = null;
        this.f8277h = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (AbstractC1286q.a(this.f8270a, fVar.f8270a) && Arrays.equals(this.f8271b, fVar.f8271b) && Arrays.equals(this.f8272c, fVar.f8272c) && Arrays.equals(this.f8273d, fVar.f8273d) && AbstractC1286q.a(this.f8278i, fVar.f8278i) && AbstractC1286q.a(null, null) && AbstractC1286q.a(null, null) && Arrays.equals(this.f8274e, fVar.f8274e) && Arrays.deepEquals(this.f8275f, fVar.f8275f) && Arrays.equals(this.f8276g, fVar.f8276g) && this.f8277h == fVar.f8277h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f8270a, this.f8271b, this.f8272c, this.f8273d, this.f8278i, null, null, this.f8274e, this.f8275f, this.f8276g, Boolean.valueOf(this.f8277h));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.f8270a);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.f8271b;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.f8272c));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.f8273d));
        sb2.append(", LogEvent: ");
        sb2.append(this.f8278i);
        sb2.append(", ExtensionProducer: ");
        sb2.append((Object) null);
        sb2.append(", VeProducer: ");
        sb2.append((Object) null);
        sb2.append(", ExperimentIDs: ");
        sb2.append(Arrays.toString(this.f8274e));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.f8275f));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.f8276g));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        sb2.append(this.f8277h);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 2, this.f8270a, i10, false);
        W6.c.f(parcel, 3, this.f8271b, false);
        W6.c.n(parcel, 4, this.f8272c, false);
        W6.c.v(parcel, 5, this.f8273d, false);
        W6.c.n(parcel, 6, this.f8274e, false);
        W6.c.g(parcel, 7, this.f8275f, false);
        W6.c.c(parcel, 8, this.f8277h);
        W6.c.x(parcel, 9, this.f8276g, i10, false);
        W6.c.b(parcel, a10);
    }

    f(X1 x12, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z10, C5262a[] c5262aArr) {
        this.f8270a = x12;
        this.f8271b = bArr;
        this.f8272c = iArr;
        this.f8273d = strArr;
        this.f8278i = null;
        this.f8274e = iArr2;
        this.f8275f = bArr2;
        this.f8276g = c5262aArr;
        this.f8277h = z10;
    }
}
