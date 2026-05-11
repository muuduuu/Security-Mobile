package com.google.android.gms.internal.measurement;

import android.net.Uri;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class U3 {

    /* renamed from: a, reason: collision with root package name */
    private final j0.i f24388a;

    U3(j0.i iVar) {
        this.f24388a = iVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        j0.i iVar = uri != null ? (j0.i) this.f24388a.get(uri.toString()) : null;
        if (iVar == null) {
            return null;
        }
        return (String) iVar.get(BuildConfig.FLAVOR.concat(str3));
    }
}
