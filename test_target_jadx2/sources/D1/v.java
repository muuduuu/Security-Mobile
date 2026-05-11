package D1;

import androidx.work.impl.C1634u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C1634u f1166a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.A f1167b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1168c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1169d;

    public v(C1634u processor, androidx.work.impl.A token, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f1166a = processor;
        this.f1167b = token;
        this.f1168c = z10;
        this.f1169d = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean v10 = this.f1168c ? this.f1166a.v(this.f1167b, this.f1169d) : this.f1166a.w(this.f1167b, this.f1169d);
        x1.n.e().a(x1.n.i("StopWorkRunnable"), "StopWorkRunnable for " + this.f1167b.a().b() + "; Processor.stopWork = " + v10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(C1634u processor, androidx.work.impl.A token, boolean z10) {
        this(processor, token, z10, -512);
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
    }
}
