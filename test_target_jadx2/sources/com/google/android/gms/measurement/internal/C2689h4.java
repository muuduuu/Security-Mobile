package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2689h4 {

    /* renamed from: a, reason: collision with root package name */
    final Context f26086a;

    /* renamed from: b, reason: collision with root package name */
    Boolean f26087b;

    /* renamed from: c, reason: collision with root package name */
    long f26088c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.measurement.H0 f26089d;

    /* renamed from: e, reason: collision with root package name */
    boolean f26090e;

    /* renamed from: f, reason: collision with root package name */
    final Long f26091f;

    /* renamed from: g, reason: collision with root package name */
    String f26092g;

    public C2689h4(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        this.f26090e = true;
        AbstractC1287s.m(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1287s.m(applicationContext);
        this.f26086a = applicationContext;
        this.f26091f = l10;
        if (h02 != null) {
            this.f26089d = h02;
            this.f26090e = h02.f24225c;
            this.f26088c = h02.f24224b;
            this.f26092g = h02.f24227e;
            Bundle bundle = h02.f24226d;
            if (bundle != null) {
                this.f26087b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
