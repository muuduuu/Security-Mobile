package h1;

import kotlin.jvm.internal.Intrinsics;
import l1.h;

/* loaded from: classes.dex */
public final class e implements h.c {

    /* renamed from: a, reason: collision with root package name */
    private final h.c f33846a;

    /* renamed from: b, reason: collision with root package name */
    private final C3225c f33847b;

    public e(h.c delegate, C3225c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f33846a = delegate;
        this.f33847b = autoCloser;
    }

    @Override // l1.h.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3226d a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C3226d(this.f33846a.a(configuration), this.f33847b);
    }
}
