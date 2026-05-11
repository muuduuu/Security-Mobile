package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2776s4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26330a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26331b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f26332c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f26333d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f26334e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f26335f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f26336g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f26337h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26338i;

    RunnableC2776s4(C2642b5 c2642b5, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f26330a = str;
        this.f26331b = str2;
        this.f26332c = j10;
        this.f26333d = bundle;
        this.f26334e = z10;
        this.f26335f = z11;
        this.f26336g = z12;
        this.f26337h = str3;
        Objects.requireNonNull(c2642b5);
        this.f26338i = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26338i.v(this.f26330a, this.f26331b, this.f26332c, this.f26333d, this.f26334e, this.f26335f, this.f26336g, this.f26337h);
    }
}
