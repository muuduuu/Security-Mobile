package R6;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class i extends m7.f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1145c f8597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C1145c c1145c, Looper looper) {
        super(looper);
        this.f8597b = c1145c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1145c.g(this.f8597b, message);
    }
}
