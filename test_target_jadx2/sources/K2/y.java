package k2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36191a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f36192b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).recycle();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v vVar, boolean z10) {
        try {
            if (!this.f36191a && !z10) {
                this.f36191a = true;
                vVar.recycle();
                this.f36191a = false;
            }
            this.f36192b.obtainMessage(1, vVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
