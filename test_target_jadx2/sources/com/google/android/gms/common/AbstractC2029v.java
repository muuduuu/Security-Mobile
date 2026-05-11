package com.google.android.gms.common;

import android.content.Intent;

/* renamed from: com.google.android.gms.common.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2029v extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f23550a;

    public AbstractC2029v(String str, Intent intent) {
        super(str);
        this.f23550a = intent;
    }

    public Intent a() {
        return new Intent(this.f23550a);
    }
}
