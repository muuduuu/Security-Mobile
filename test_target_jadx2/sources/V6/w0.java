package V6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import b7.C1653b;
import com.google.android.gms.common.C2010b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class w0 implements ServiceConnection, z0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11028a;

    /* renamed from: b, reason: collision with root package name */
    private int f11029b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11030c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f11031d;

    /* renamed from: e, reason: collision with root package name */
    private final v0 f11032e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f11033f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y0 f11034g;

    public w0(y0 y0Var, v0 v0Var) {
        Objects.requireNonNull(y0Var);
        this.f11034g = y0Var;
        this.f11032e = v0Var;
        this.f11028a = new HashMap();
        this.f11029b = 2;
    }

    public final void a(String str) {
        v0 v0Var = this.f11032e;
        y0 y0Var = this.f11034g;
        y0Var.j().removeMessages(1, v0Var);
        y0Var.k().c(y0Var.i(), this);
        this.f11030c = false;
        this.f11029b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f11028a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f11028a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f11030c;
    }

    public final int e() {
        return this.f11029b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f11028a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f11028a.isEmpty();
    }

    public final IBinder h() {
        return this.f11031d;
    }

    public final ComponentName i() {
        return this.f11033f;
    }

    final /* synthetic */ C2010b j(String str, Executor executor) {
        C2010b c2010b;
        try {
            Intent a10 = k0.a(this.f11034g.i(), this.f11032e);
            this.f11029b = 3;
            StrictMode.VmPolicy a11 = com.google.android.gms.common.util.w.a();
            try {
                y0 y0Var = this.f11034g;
                C1653b k10 = y0Var.k();
                Context i10 = y0Var.i();
                v0 v0Var = this.f11032e;
                boolean d10 = k10.d(i10, str, a10, this, 4225, executor);
                this.f11030c = d10;
                if (d10) {
                    y0Var.j().sendMessageDelayed(y0Var.j().obtainMessage(1, v0Var), y0Var.l());
                    c2010b = C2010b.f23474f;
                } else {
                    this.f11029b = 2;
                    try {
                        y0Var.k().c(y0Var.i(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    c2010b = new C2010b(16);
                }
                return c2010b;
            } finally {
                StrictMode.setVmPolicy(a11);
            }
        } catch (i0 e10) {
            return e10.f10977a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y0 y0Var = this.f11034g;
        synchronized (y0Var.h()) {
            try {
                y0Var.j().removeMessages(1, this.f11032e);
                this.f11031d = iBinder;
                this.f11033f = componentName;
                Iterator it = this.f11028a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f11029b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        y0 y0Var = this.f11034g;
        synchronized (y0Var.h()) {
            try {
                y0Var.j().removeMessages(1, this.f11032e);
                this.f11031d = null;
                this.f11033f = componentName;
                Iterator it = this.f11028a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f11029b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
