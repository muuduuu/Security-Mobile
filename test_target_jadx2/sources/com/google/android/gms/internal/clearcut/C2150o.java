package com.google.android.gms.internal.clearcut;

import android.net.Uri;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.clearcut.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2150o {

    /* renamed from: a, reason: collision with root package name */
    private final String f24084a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f24085b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24086c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24087d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24088e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24089f;

    public C2150o(Uri uri) {
        this(null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false);
    }

    public final AbstractC2120e a(String str, Object obj, InterfaceC2147n interfaceC2147n) {
        AbstractC2120e c10;
        c10 = AbstractC2120e.c(this, str, obj, interfaceC2147n);
        return c10;
    }

    public final AbstractC2120e b(String str, String str2) {
        AbstractC2120e d10;
        d10 = AbstractC2120e.d(this, str, null);
        return d10;
    }

    public final AbstractC2120e e(String str, boolean z10) {
        AbstractC2120e e10;
        e10 = AbstractC2120e.e(this, str, false);
        return e10;
    }

    public final C2150o f(String str) {
        boolean z10 = this.f24088e;
        if (z10) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new C2150o(this.f24084a, this.f24085b, str, this.f24087d, z10, this.f24089f);
    }

    public final C2150o h(String str) {
        return new C2150o(this.f24084a, this.f24085b, this.f24086c, str, this.f24088e, this.f24089f);
    }

    private C2150o(String str, Uri uri, String str2, String str3, boolean z10, boolean z11) {
        this.f24084a = str;
        this.f24085b = uri;
        this.f24086c = str2;
        this.f24087d = str3;
        this.f24088e = z10;
        this.f24089f = z11;
    }
}
