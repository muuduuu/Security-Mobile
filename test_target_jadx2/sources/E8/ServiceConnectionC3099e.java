package e8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: e8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ServiceConnectionC3099e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3100f f32267a;

    /* synthetic */ ServiceConnectionC3099e(C3100f c3100f, AbstractC3098d abstractC3098d) {
        this.f32267a = c3100f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z zVar;
        zVar = this.f32267a.f32270b;
        zVar.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f32267a.c().post(new C3096b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        z zVar;
        zVar = this.f32267a.f32270b;
        zVar.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f32267a.c().post(new C3097c(this));
    }
}
