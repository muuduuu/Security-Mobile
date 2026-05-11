package com.google.android.gms.auth;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import W6.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class TokenData extends W6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f23219a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23220b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f23221c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23222d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23223e;

    /* renamed from: f, reason: collision with root package name */
    private final List f23224f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23225g;

    TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f23219a = i10;
        this.f23220b = AbstractC1287s.g(str);
        this.f23221c = l10;
        this.f23222d = z10;
        this.f23223e = z11;
        this.f23224f = list;
        this.f23225g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f23220b, tokenData.f23220b) && AbstractC1286q.a(this.f23221c, tokenData.f23221c) && this.f23222d == tokenData.f23222d && this.f23223e == tokenData.f23223e && AbstractC1286q.a(this.f23224f, tokenData.f23224f) && AbstractC1286q.a(this.f23225g, tokenData.f23225g);
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f23220b, this.f23221c, Boolean.valueOf(this.f23222d), Boolean.valueOf(this.f23223e), this.f23224f, this.f23225g);
    }

    public final String j() {
        return this.f23220b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f23219a);
        c.u(parcel, 2, this.f23220b, false);
        c.r(parcel, 3, this.f23221c, false);
        c.c(parcel, 4, this.f23222d);
        c.c(parcel, 5, this.f23223e);
        c.w(parcel, 6, this.f23224f, false);
        c.u(parcel, 7, this.f23225g, false);
        c.b(parcel, a10);
    }
}
