package b0;

import A.AbstractC0700h0;
import V.AbstractC1236a;
import Y.AbstractC1305a;
import android.util.Range;

/* loaded from: classes.dex */
public final class g implements y0.h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1236a f18453a;

    public g(AbstractC1236a abstractC1236a) {
        this.f18453a = abstractC1236a;
    }

    @Override // y0.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1305a get() {
        int i10;
        int f10 = b.f(this.f18453a);
        int g10 = b.g(this.f18453a);
        int c10 = this.f18453a.c();
        if (c10 == -1) {
            AbstractC0700h0.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            c10 = 1;
        } else {
            AbstractC0700h0.a("DefAudioResolver", "Using supplied AUDIO channel count: " + c10);
        }
        Range d10 = this.f18453a.d();
        if (AbstractC1236a.f10591b.equals(d10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Using fallback AUDIO sample rate: ");
            i10 = 44100;
            sb2.append(44100);
            sb2.append("Hz");
            AbstractC0700h0.a("DefAudioResolver", sb2.toString());
        } else {
            i10 = b.i(d10, c10, g10, ((Integer) d10.getUpper()).intValue());
            AbstractC0700h0.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + i10 + "Hz");
        }
        return AbstractC1305a.a().d(f10).c(g10).e(c10).f(i10).b();
    }
}
