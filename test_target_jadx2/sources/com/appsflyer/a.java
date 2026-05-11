package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f20113a;

    public /* synthetic */ a(Function1 function1) {
        this.f20113a = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMonetizationNetwork(this.f20113a);
    }
}
