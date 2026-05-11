package b0;

import A.AbstractC0700h0;
import V.AbstractC1236a;
import Y.AbstractC1305a;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.e1;
import c0.AbstractC1690a;

/* loaded from: classes.dex */
public final class c implements y0.h {

    /* renamed from: a, reason: collision with root package name */
    private final String f18440a;

    /* renamed from: b, reason: collision with root package name */
    private final e1 f18441b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18442c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1236a f18443d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC1305a f18444e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1441i0.a f18445f;

    public c(String str, int i10, e1 e1Var, AbstractC1236a abstractC1236a, AbstractC1305a abstractC1305a, InterfaceC1441i0.a aVar) {
        this.f18440a = str;
        this.f18442c = i10;
        this.f18441b = e1Var;
        this.f18443d = abstractC1236a;
        this.f18444e = abstractC1305a;
        this.f18445f = aVar;
    }

    @Override // y0.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1690a get() {
        AbstractC0700h0.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return AbstractC1690a.d().f(this.f18440a).g(this.f18442c).e(this.f18441b).d(this.f18444e.e()).h(this.f18444e.f()).c(b.h(this.f18445f.b(), this.f18444e.e(), this.f18445f.c(), this.f18444e.f(), this.f18445f.g(), this.f18443d.b())).b();
    }
}
