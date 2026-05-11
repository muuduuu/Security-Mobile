package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class h0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f28192d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f28193a;

    /* renamed from: b, reason: collision with root package name */
    private d0 f28194b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f28195c;

    private h0(SharedPreferences sharedPreferences, Executor executor) {
        this.f28195c = executor;
        this.f28193a = sharedPreferences;
    }

    public static synchronized h0 b(Context context, Executor executor) {
        h0 h0Var;
        synchronized (h0.class) {
            try {
                WeakReference weakReference = f28192d;
                h0Var = weakReference != null ? (h0) weakReference.get() : null;
                if (h0Var == null) {
                    h0Var = new h0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    h0Var.d();
                    f28192d = new WeakReference(h0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h0Var;
    }

    private synchronized void d() {
        this.f28194b = d0.d(this.f28193a, "topic_operation_queue", ",", this.f28195c);
    }

    synchronized boolean a(g0 g0Var) {
        return this.f28194b.b(g0Var.e());
    }

    synchronized g0 c() {
        return g0.a(this.f28194b.f());
    }

    synchronized boolean e(g0 g0Var) {
        return this.f28194b.g(g0Var.e());
    }
}
