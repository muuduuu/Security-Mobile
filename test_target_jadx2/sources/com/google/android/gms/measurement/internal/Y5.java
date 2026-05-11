package com.google.android.gms.measurement.internal;

import V6.AbstractC1267c;
import V6.AbstractC1287s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import b7.C1653b;
import com.google.android.gms.common.C2010b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Y5 implements ServiceConnection, AbstractC1267c.a, AbstractC1267c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f25745a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C2806w2 f25746b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2667e6 f25747c;

    protected Y5(C2667e6 c2667e6) {
        Objects.requireNonNull(c2667e6);
        this.f25747c = c2667e6;
    }

    public final void a(Intent intent) {
        C2667e6 c2667e6 = this.f25747c;
        c2667e6.h();
        Context e10 = c2667e6.f25694a.e();
        C1653b b10 = C1653b.b();
        synchronized (this) {
            try {
                if (this.f25745a) {
                    this.f25747c.f25694a.a().w().a("Connection attempt already in progress");
                    return;
                }
                C2667e6 c2667e62 = this.f25747c;
                c2667e62.f25694a.a().w().a("Using local app measurement service");
                this.f25745a = true;
                b10.a(e10, intent, c2667e62.M(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.f25746b != null && (this.f25746b.a() || this.f25746b.e())) {
            this.f25746b.h();
        }
        this.f25746b = null;
    }

    public final void c() {
        C2667e6 c2667e6 = this.f25747c;
        c2667e6.h();
        Context e10 = c2667e6.f25694a.e();
        synchronized (this) {
            try {
                if (this.f25745a) {
                    this.f25747c.f25694a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.f25746b != null && (this.f25746b.e() || this.f25746b.a())) {
                    this.f25747c.f25694a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.f25746b = new C2806w2(e10, Looper.getMainLooper(), this, this);
                this.f25747c.f25694a.a().w().a("Connecting to remote service");
                this.f25745a = true;
                AbstractC1287s.m(this.f25746b);
                this.f25746b.v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void d(boolean z10) {
        this.f25745a = false;
    }

    @Override // V6.AbstractC1267c.a
    public final void onConnected(Bundle bundle) {
        this.f25747c.f25694a.b().o();
        synchronized (this) {
            try {
                AbstractC1287s.m(this.f25746b);
                this.f25747c.f25694a.b().t(new T5(this, (InterfaceC2703j2) this.f25746b.I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f25746b = null;
                this.f25745a = false;
            }
        }
    }

    @Override // V6.AbstractC1267c.b
    public final void onConnectionFailed(C2010b c2010b) {
        C2667e6 c2667e6 = this.f25747c;
        c2667e6.f25694a.b().o();
        C2 y10 = c2667e6.f25694a.y();
        if (y10 != null) {
            y10.w().b("Service connection failed", c2010b);
        }
        synchronized (this) {
            this.f25745a = false;
            this.f25746b = null;
        }
        this.f25747c.f25694a.b().t(new X5(this, c2010b));
    }

    @Override // V6.AbstractC1267c.a
    public final void onConnectionSuspended(int i10) {
        C2760q3 c2760q3 = this.f25747c.f25694a;
        c2760q3.b().o();
        c2760q3.a().v().a("Service connection suspended");
        c2760q3.b().t(new U5(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25747c.f25694a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f25745a = false;
                this.f25747c.f25694a.a().o().a("Service connected with null binder");
                return;
            }
            InterfaceC2703j2 interfaceC2703j2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC2703j2 = queryLocalInterface instanceof InterfaceC2703j2 ? (InterfaceC2703j2) queryLocalInterface : new C2679g2(iBinder);
                    this.f25747c.f25694a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f25747c.f25694a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f25747c.f25694a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC2703j2 == null) {
                this.f25745a = false;
                try {
                    C1653b b10 = C1653b.b();
                    C2667e6 c2667e6 = this.f25747c;
                    b10.c(c2667e6.f25694a.e(), c2667e6.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f25747c.f25694a.b().t(new Q5(this, interfaceC2703j2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2760q3 c2760q3 = this.f25747c.f25694a;
        c2760q3.b().o();
        c2760q3.a().v().a("Service disconnected");
        c2760q3.b().t(new R5(this, componentName));
    }
}
