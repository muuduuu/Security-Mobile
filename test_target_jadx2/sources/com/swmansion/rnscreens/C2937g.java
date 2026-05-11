package com.swmansion.rnscreens;

import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2937g {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentCallbacksC1573o f29956a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.activity.n f29957b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29958c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29959d;

    public C2937g(ComponentCallbacksC1573o fragment, androidx.activity.n onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f29956a = fragment;
        this.f29957b = onBackPressedCallback;
        this.f29959d = true;
    }

    public final boolean a() {
        return this.f29959d;
    }

    public final void b() {
        androidx.activity.o onBackPressedDispatcher;
        if (this.f29958c || !this.f29959d) {
            return;
        }
        AbstractActivityC1577t activity = this.f29956a.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.b(this.f29956a, this.f29957b);
        }
        this.f29958c = true;
    }

    public final void c() {
        if (this.f29958c) {
            this.f29957b.d();
            this.f29958c = false;
        }
    }

    public final void d(boolean z10) {
        this.f29959d = z10;
    }
}
