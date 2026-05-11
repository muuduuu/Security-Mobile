package m7;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f37401a;

    public f(Looper looper) {
        super(looper);
        this.f37401a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f37401a = Looper.getMainLooper();
    }
}
