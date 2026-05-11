package l7;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class l extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f37106a;

    public l(Looper looper) {
        super(looper);
        this.f37106a = Looper.getMainLooper();
    }

    public l(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f37106a = Looper.getMainLooper();
    }
}
