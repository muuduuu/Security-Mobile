package p7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;

/* renamed from: p7.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3807c0 extends W6.a {
    public static final Parcelable.Creator<C3807c0> CREATOR = new B0();

    /* renamed from: a, reason: collision with root package name */
    private final int f38404a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38405b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38406c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38407d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38408e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38409f;

    /* renamed from: g, reason: collision with root package name */
    private final C3807c0 f38410g;

    /* renamed from: h, reason: collision with root package name */
    private final List f38411h;

    static {
        Process.myUid();
        Process.myPid();
    }

    C3807c0(int i10, int i11, String str, String str2, String str3, int i12, List list, C3807c0 c3807c0) {
        this.f38404a = i10;
        this.f38405b = i11;
        this.f38406c = str;
        this.f38407d = str2;
        this.f38409f = str3;
        this.f38408e = i12;
        this.f38411h = v0.u(list);
        this.f38410g = c3807c0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3807c0) {
            C3807c0 c3807c0 = (C3807c0) obj;
            if (this.f38404a == c3807c0.f38404a && this.f38405b == c3807c0.f38405b && this.f38408e == c3807c0.f38408e && this.f38406c.equals(c3807c0.f38406c) && AbstractC3831o0.a(this.f38407d, c3807c0.f38407d) && AbstractC3831o0.a(this.f38409f, c3807c0.f38409f) && AbstractC3831o0.a(this.f38410g, c3807c0.f38410g) && this.f38411h.equals(c3807c0.f38411h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f38404a), this.f38406c, this.f38407d, this.f38409f});
    }

    public final String toString() {
        int length = this.f38406c.length() + 18;
        String str = this.f38407d;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f38404a);
        sb2.append("/");
        sb2.append(this.f38406c);
        if (this.f38407d != null) {
            sb2.append("[");
            if (this.f38407d.startsWith(this.f38406c)) {
                sb2.append((CharSequence) this.f38407d, this.f38406c.length(), this.f38407d.length());
            } else {
                sb2.append(this.f38407d);
            }
            sb2.append("]");
        }
        if (this.f38409f != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(this.f38409f.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f38404a);
        W6.c.m(parcel, 2, this.f38405b);
        W6.c.u(parcel, 3, this.f38406c, false);
        W6.c.u(parcel, 4, this.f38407d, false);
        W6.c.m(parcel, 5, this.f38408e);
        W6.c.u(parcel, 6, this.f38409f, false);
        W6.c.s(parcel, 7, this.f38410g, i10, false);
        W6.c.y(parcel, 8, this.f38411h, false);
        W6.c.b(parcel, a10);
    }
}
