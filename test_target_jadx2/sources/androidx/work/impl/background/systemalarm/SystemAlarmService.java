package androidx.work.impl.background.systemalarm;

import D1.x;
import android.content.Intent;
import androidx.lifecycle.AbstractServiceC1602t;
import androidx.work.impl.background.systemalarm.g;
import x1.n;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC1602t implements g.c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f18258d = n.i("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    private g f18259b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18260c;

    private void e() {
        g gVar = new g(this);
        this.f18259b = gVar;
        gVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void a() {
        this.f18260c = true;
        n.e().a(f18258d, "All commands completed in dispatcher");
        x.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC1602t, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f18260c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC1602t, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f18260c = true;
        this.f18259b.k();
    }

    @Override // androidx.lifecycle.AbstractServiceC1602t, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f18260c) {
            n.e().f(f18258d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f18259b.k();
            e();
            this.f18260c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f18259b.a(intent, i11);
        return 3;
    }
}
