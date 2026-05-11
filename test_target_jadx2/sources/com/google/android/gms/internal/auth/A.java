package com.google.android.gms.internal.auth;

import android.net.Uri;
import j0.C3476a;

/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    private static final C3476a f23579a = new C3476a();

    public static synchronized Uri a(String str) {
        synchronized (A.class) {
            C3476a c3476a = f23579a;
            Uri uri = (Uri) c3476a.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            c3476a.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
