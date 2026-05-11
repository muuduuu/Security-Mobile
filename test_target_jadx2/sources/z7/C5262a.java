package z7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5262a extends W6.a {

    /* renamed from: i, reason: collision with root package name */
    private static final byte[][] f45763i;

    /* renamed from: j, reason: collision with root package name */
    private static final C5262a f45764j;

    /* renamed from: a, reason: collision with root package name */
    private final String f45769a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f45770b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f45771c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[][] f45772d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[][] f45773e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[][] f45774f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f45775g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[][] f45776h;
    public static final Parcelable.Creator<C5262a> CREATOR = new g();

    /* renamed from: k, reason: collision with root package name */
    private static final InterfaceC0674a f45765k = new c();

    /* renamed from: l, reason: collision with root package name */
    private static final InterfaceC0674a f45766l = new d();

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC0674a f45767m = new e();

    /* renamed from: n, reason: collision with root package name */
    private static final InterfaceC0674a f45768n = new f();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z7.a$a, reason: collision with other inner class name */
    interface InterfaceC0674a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f45763i = bArr;
        f45764j = new C5262a(BuildConfig.FLAVOR, null, bArr, bArr, bArr, bArr, null, null);
    }

    public C5262a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f45769a = str;
        this.f45770b = bArr;
        this.f45771c = bArr2;
        this.f45772d = bArr3;
        this.f45773e = bArr4;
        this.f45774f = bArr5;
        this.f45775g = iArr;
        this.f45776h = bArr6;
    }

    private static void F(StringBuilder sb2, String str, byte[][] bArr) {
        String str2;
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb2.append("(");
            int length = bArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr2 = bArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i10++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    private static List j(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List u(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5262a) {
            C5262a c5262a = (C5262a) obj;
            if (j.a(this.f45769a, c5262a.f45769a) && Arrays.equals(this.f45770b, c5262a.f45770b) && j.a(u(this.f45771c), u(c5262a.f45771c)) && j.a(u(this.f45772d), u(c5262a.f45772d)) && j.a(u(this.f45773e), u(c5262a.f45773e)) && j.a(u(this.f45774f), u(c5262a.f45774f)) && j.a(j(this.f45775g), j(c5262a.f45775g)) && j.a(u(this.f45776h), u(c5262a.f45776h))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String sb2;
        StringBuilder sb3 = new StringBuilder("ExperimentTokens");
        sb3.append("(");
        String str = this.f45769a;
        if (str == null) {
            sb2 = "null";
        } else {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 2);
            sb4.append("'");
            sb4.append(str);
            sb4.append("'");
            sb2 = sb4.toString();
        }
        sb3.append(sb2);
        sb3.append(", ");
        byte[] bArr = this.f45770b;
        sb3.append("direct");
        sb3.append("=");
        if (bArr == null) {
            sb3.append("null");
        } else {
            sb3.append("'");
            sb3.append(Base64.encodeToString(bArr, 3));
            sb3.append("'");
        }
        sb3.append(", ");
        F(sb3, "GAIA", this.f45771c);
        sb3.append(", ");
        F(sb3, "PSEUDO", this.f45772d);
        sb3.append(", ");
        F(sb3, "ALWAYS", this.f45773e);
        sb3.append(", ");
        F(sb3, "OTHER", this.f45774f);
        sb3.append(", ");
        int[] iArr = this.f45775g;
        sb3.append("weak");
        sb3.append("=");
        if (iArr == null) {
            sb3.append("null");
        } else {
            sb3.append("(");
            int length = iArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z10) {
                    sb3.append(", ");
                }
                sb3.append(i11);
                i10++;
                z10 = false;
            }
            sb3.append(")");
        }
        sb3.append(", ");
        F(sb3, "directs", this.f45776h);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f45769a, false);
        W6.c.f(parcel, 3, this.f45770b, false);
        W6.c.g(parcel, 4, this.f45771c, false);
        W6.c.g(parcel, 5, this.f45772d, false);
        W6.c.g(parcel, 6, this.f45773e, false);
        W6.c.g(parcel, 7, this.f45774f, false);
        W6.c.n(parcel, 8, this.f45775g, false);
        W6.c.g(parcel, 9, this.f45776h, false);
        W6.c.b(parcel, a10);
    }
}
