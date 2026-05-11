package V6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.C2010b;
import java.util.concurrent.Executor;

/* renamed from: V6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1278i {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f10971a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int f10972b = 9;

    /* renamed from: c, reason: collision with root package name */
    private static y0 f10973c = null;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f10974d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Executor f10975e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f10976f = false;

    public static AbstractC1278i b(Context context) {
        synchronized (f10971a) {
            try {
                if (f10973c == null) {
                    f10973c = new y0(context.getApplicationContext(), f10976f ? c().getLooper() : context.getMainLooper(), f10975e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10973c;
    }

    public static HandlerThread c() {
        synchronized (f10971a) {
            try {
                HandlerThread handlerThread = f10974d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f10972b);
                f10974d = handlerThread2;
                handlerThread2.start();
                return f10974d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return e(new v0(componentName, 4225), serviceConnection, str, executor).Z0();
    }

    public void d(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        g(new v0(componentName, 4225), serviceConnection, str);
    }

    protected abstract C2010b e(v0 v0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        g(new v0(str, str2, 4225, z10), serviceConnection, str3);
    }

    protected abstract void g(v0 v0Var, ServiceConnection serviceConnection, String str);
}
