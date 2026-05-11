package expo.modules.location.services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0002\u000f\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lexpo/modules/location/services/LocationTaskService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", BuildConfig.FLAVOR, "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", BuildConfig.FLAVOR, C4870a.f43493a, "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", BuildConfig.FLAVOR, "Ljava/lang/String;", "mChannelId", BuildConfig.FLAVOR, "b", "Z", "mKillService", "c", "I", "mServiceId", "d", "Landroid/os/IBinder;", "mBinder", "e", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationTaskService extends Service {

    /* renamed from: f, reason: collision with root package name */
    private static int f32766f = 481756;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String mChannelId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean mKillService;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int mServiceId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final IBinder mBinder;

    public final class b extends Binder {
        public b() {
        }
    }

    public LocationTaskService() {
        int i10 = f32766f;
        f32766f = i10 + 1;
        this.mServiceId = i10;
        this.mBinder = new b();
    }

    public final void a() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.mBinder;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return 3;
        }
        this.mChannelId = extras.getString("appId") + ":" + extras.getString("taskName");
        this.mKillService = extras.getBoolean("killService", false);
        return 3;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        Intrinsics.checkNotNullParameter(rootIntent, "rootIntent");
        if (this.mKillService) {
            super.onTaskRemoved(rootIntent);
            a();
        }
    }
}
