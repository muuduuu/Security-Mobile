package G3;

import G3.a;
import c3.AbstractC1721a;
import f3.AbstractC3142a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int f2853a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f2854b = d.class;

    public d(int i10) {
        this.f2853a = i10;
    }

    @Override // G3.a
    public void a() {
        a.C0066a.c(this);
    }

    @Override // G3.a
    public void b(int i10, int i11, Function0 function0) {
        a.C0066a.d(this, i10, i11, function0);
    }

    @Override // G3.a
    public AbstractC3142a c(int i10, int i11, int i12) {
        return a.C0066a.b(this, i10, i11, i12);
    }

    @Override // G3.a
    public void d(b bitmapFramePreparer, E3.b bitmapFrameCache, D3.a animationBackend, int i10, Function0 function0) {
        Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int i11 = this.f2853a;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int a10 = (i10 + i12) % animationBackend.a();
                if (AbstractC1721a.x(2)) {
                    AbstractC1721a.A(this.f2854b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a10), Integer.valueOf(i10));
                }
                if (!bitmapFramePreparer.a(bitmapFrameCache, animationBackend, a10)) {
                    return;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // G3.a
    public void e() {
        a.C0066a.a(this);
    }
}
