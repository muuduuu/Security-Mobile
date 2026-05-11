package com.google.android.gms.auth.api.signin;

import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes2.dex */
public class SignInAccount extends W6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final String f23271a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f23272b;

    /* renamed from: c, reason: collision with root package name */
    final String f23273c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f23272b = googleSignInAccount;
        this.f23271a = AbstractC1287s.h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f23273c = AbstractC1287s.h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount j() {
        return this.f23272b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23271a;
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 4, str, false);
        W6.c.s(parcel, 7, this.f23272b, i10, false);
        W6.c.u(parcel, 8, this.f23273c, false);
        W6.c.b(parcel, a10);
    }
}
