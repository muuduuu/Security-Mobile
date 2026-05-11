package b0;

import A.AbstractC0700h0;
import V.AbstractC1236a;
import Y.AbstractC1305a;
import android.util.Range;
import androidx.camera.core.impl.InterfaceC1441i0;

/* loaded from: classes.dex */
public final class f implements y0.h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1236a f18451a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1441i0.a f18452b;

    public f(AbstractC1236a abstractC1236a, InterfaceC1441i0.a aVar) {
        this.f18451a = abstractC1236a;
        this.f18452b = aVar;
    }

    @Override // y0.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1305a get() {
        int f10 = b.f(this.f18451a);
        int g10 = b.g(this.f18451a);
        int c10 = this.f18451a.c();
        Range d10 = this.f18451a.d();
        int c11 = this.f18452b.c();
        if (c10 == -1) {
            AbstractC0700h0.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + c11);
            c10 = c11;
        } else {
            AbstractC0700h0.a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + c11 + ", Resolved Channel Count: " + c10 + "]");
        }
        int g11 = this.f18452b.g();
        int i10 = b.i(d10, c10, g10, g11);
        AbstractC0700h0.a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: " + i10 + "Hz. [AudioProfile sample rate: " + g11 + "Hz]");
        return AbstractC1305a.a().d(f10).c(g10).e(c10).f(i10).b();
    }
}
