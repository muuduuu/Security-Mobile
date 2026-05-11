package com.google.android.gms.common;

import V6.AbstractC1287s;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ServiceConnectionC2005a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f23333a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f23334b = new LinkedBlockingQueue();

    public IBinder a() {
        AbstractC1287s.l("BlockingServiceConnection.getService() called on main thread");
        if (this.f23333a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f23333a = true;
        return (IBinder) this.f23334b.take();
    }

    public IBinder b(long j10, TimeUnit timeUnit) {
        AbstractC1287s.l("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f23333a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f23333a = true;
        IBinder iBinder = (IBinder) this.f23334b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f23334b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
