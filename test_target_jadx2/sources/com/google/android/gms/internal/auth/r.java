package com.google.android.gms.internal.auth;

import android.net.Uri;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final j0.i f23764a;

    r(j0.i iVar) {
        this.f23764a = iVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        j0.i iVar;
        if (uri != null) {
            iVar = (j0.i) this.f23764a.get(uri.toString());
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        return (String) iVar.get(BuildConfig.FLAVOR.concat(str3));
    }
}
