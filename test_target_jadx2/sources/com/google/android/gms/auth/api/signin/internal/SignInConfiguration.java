package com.google.android.gms.auth.api.signin.internal;

import O6.b;
import O6.y;
import V6.AbstractC1287s;
import W6.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes2.dex */
public final class SignInConfiguration extends W6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final String f23276a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f23277b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f23276a = AbstractC1287s.g(str);
        this.f23277b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f23276a.equals(signInConfiguration.f23276a)) {
            GoogleSignInOptions googleSignInOptions = this.f23277b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f23277b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f23276a).a(this.f23277b).b();
    }

    public final GoogleSignInOptions j() {
        return this.f23277b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23276a;
        int a10 = c.a(parcel);
        c.u(parcel, 2, str, false);
        c.s(parcel, 5, this.f23277b, i10, false);
        c.b(parcel, a10);
    }
}
