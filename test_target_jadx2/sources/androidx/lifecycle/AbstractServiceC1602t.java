package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1602t extends Service implements InterfaceC1599p {

    /* renamed from: a, reason: collision with root package name */
    private final O f17150a = new O(this);

    @Override // androidx.lifecycle.InterfaceC1599p
    public AbstractC1592i getLifecycle() {
        return this.f17150a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f17150a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f17150a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f17150a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f17150a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
