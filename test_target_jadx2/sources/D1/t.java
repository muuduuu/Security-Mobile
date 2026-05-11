package D1;

import androidx.work.WorkerParameters;
import androidx.work.impl.C1634u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C1634u f1160a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.A f1161b;

    /* renamed from: c, reason: collision with root package name */
    private final WorkerParameters.a f1162c;

    public t(C1634u processor, androidx.work.impl.A startStopToken, WorkerParameters.a aVar) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(startStopToken, "startStopToken");
        this.f1160a = processor;
        this.f1161b = startStopToken;
        this.f1162c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1160a.s(this.f1161b, this.f1162c);
    }
}
