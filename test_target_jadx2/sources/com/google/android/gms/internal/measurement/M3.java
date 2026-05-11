package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class M3 extends Exception {
    public M3(String str) {
        super(str);
    }

    public M3(String str, Throwable th) {
        super("ContentProvider query failed", th);
    }
}
