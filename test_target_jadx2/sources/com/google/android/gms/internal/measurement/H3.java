package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class H3 {

    /* renamed from: a, reason: collision with root package name */
    private static final J3 f24229a;

    static {
        Uri uri = I3.f24236a;
        f24229a = K3.b();
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        return f24229a.a(contentResolver, str, null);
    }
}
