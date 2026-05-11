package V6;

import V6.InterfaceC1280k;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.common.api.Scope;

/* renamed from: V6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1275g extends W6.a {
    public static final Parcelable.Creator<C1275g> CREATOR = new u0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f10948o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C2012d[] f10949p = new C2012d[0];

    /* renamed from: a, reason: collision with root package name */
    final int f10950a;

    /* renamed from: b, reason: collision with root package name */
    final int f10951b;

    /* renamed from: c, reason: collision with root package name */
    final int f10952c;

    /* renamed from: d, reason: collision with root package name */
    String f10953d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f10954e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f10955f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f10956g;

    /* renamed from: h, reason: collision with root package name */
    Account f10957h;

    /* renamed from: i, reason: collision with root package name */
    C2012d[] f10958i;

    /* renamed from: j, reason: collision with root package name */
    C2012d[] f10959j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f10960k;

    /* renamed from: l, reason: collision with root package name */
    final int f10961l;

    /* renamed from: m, reason: collision with root package name */
    boolean f10962m;

    /* renamed from: n, reason: collision with root package name */
    private final String f10963n;

    C1275g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2012d[] c2012dArr, C2012d[] c2012dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f10948o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c2012dArr = c2012dArr == null ? f10949p : c2012dArr;
        c2012dArr2 = c2012dArr2 == null ? f10949p : c2012dArr2;
        this.f10950a = i10;
        this.f10951b = i11;
        this.f10952c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f10953d = "com.google.android.gms";
        } else {
            this.f10953d = str;
        }
        if (i10 < 2) {
            this.f10957h = iBinder != null ? AbstractBinderC1263a.l1(InterfaceC1280k.a.k1(iBinder)) : null;
        } else {
            this.f10954e = iBinder;
            this.f10957h = account;
        }
        this.f10955f = scopeArr;
        this.f10956g = bundle;
        this.f10958i = c2012dArr;
        this.f10959j = c2012dArr2;
        this.f10960k = z10;
        this.f10961l = i13;
        this.f10962m = z11;
        this.f10963n = str2;
    }

    public String j() {
        return this.f10963n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        u0.a(this, parcel, i10);
    }
}
