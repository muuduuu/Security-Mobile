package com.google.android.gms.internal.measurement;

import android.net.Uri;
import j0.C3476a;

/* renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2217d4 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3476a f24477a = new C3476a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24478b = 0;

    public static synchronized Uri a(String str) {
        synchronized (AbstractC2217d4.class) {
            C3476a c3476a = f24477a;
            Uri uri = (Uri) c3476a.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            c3476a.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
