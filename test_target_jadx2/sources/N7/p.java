package n7;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class p extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f37586a;

    public p(Looper looper) {
        super(looper);
        this.f37586a = Looper.getMainLooper();
    }

    public p(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f37586a = Looper.getMainLooper();
    }
}
