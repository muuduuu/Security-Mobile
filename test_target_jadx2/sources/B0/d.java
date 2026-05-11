package b0;

import A.AbstractC0700h0;
import V.AbstractC1236a;
import Y.AbstractC1305a;
import android.util.Range;
import androidx.camera.core.impl.e1;
import c0.AbstractC1690a;

/* loaded from: classes.dex */
public final class d implements y0.h {

    /* renamed from: a, reason: collision with root package name */
    private final String f18446a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18447b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1236a f18448c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1305a f18449d;

    /* renamed from: e, reason: collision with root package name */
    private final e1 f18450e;

    public d(String str, int i10, e1 e1Var, AbstractC1236a abstractC1236a, AbstractC1305a abstractC1305a) {
        this.f18446a = str;
        this.f18447b = i10;
        this.f18450e = e1Var;
        this.f18448c = abstractC1236a;
        this.f18449d = abstractC1305a;
    }

    @Override // y0.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1690a get() {
        Range b10 = this.f18448c.b();
        AbstractC0700h0.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return AbstractC1690a.d().f(this.f18446a).g(this.f18447b).e(this.f18450e).d(this.f18449d.e()).h(this.f18449d.f()).c(b.h(156000, this.f18449d.e(), 2, this.f18449d.f(), 48000, b10)).b();
    }
}
