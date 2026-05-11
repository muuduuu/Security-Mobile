package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class E implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f20767a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f20768b;

    public E(h0 h0Var, g0 g0Var) {
        this.f20767a = h0Var;
        this.f20768b = g0Var;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void a(e0 context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f20767a;
        if (h0Var != null) {
            h0Var.g(context.getId(), str, str2);
        }
        g0 g0Var = this.f20768b;
        if (g0Var != null) {
            g0Var.a(context, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 context, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f20767a;
        if (h0Var != null) {
            h0Var.e(context.getId(), str, z10);
        }
        g0 g0Var = this.f20768b;
        if (g0Var != null) {
            g0Var.c(context, str, z10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f20767a;
        if (h0Var != null) {
            h0Var.d(context.getId(), str, map);
        }
        g0 g0Var = this.f20768b;
        if (g0Var != null) {
            g0Var.d(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void e(e0 context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f20767a;
        if (h0Var != null) {
            h0Var.b(context.getId(), str);
        }
        g0 g0Var = this.f20768b;
        if (g0Var != null) {
            g0Var.e(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean g(e0 context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f20767a;
        Boolean valueOf = h0Var != null ? Boolean.valueOf(h0Var.f(context.getId())) : null;
        if (!Intrinsics.b(valueOf, Boolean.TRUE)) {
            g0 g0Var = this.f20768b;
            valueOf = g0Var != null ? Boolean.valueOf(g0Var.g(context, str)) : null;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 context, String str, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f20767a;
        if (h0Var != null) {
            h0Var.h(context.getId(), str, map);
        }
        g0 g0Var = this.f20768b;
        if (g0Var != null) {
            g0Var.j(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 context, String str, Throwable th, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        h0 h0Var = this.f20767a;
        if (h0Var != null) {
            h0Var.i(context.getId(), str, th, map);
        }
        g0 g0Var = this.f20768b;
        if (g0Var != null) {
            g0Var.k(context, str, th, map);
        }
    }
}
