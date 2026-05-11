package b0;

import A.AbstractC0700h0;
import A.B;
import A.I0;
import V.B0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.e1;
import c0.p0;
import d0.AbstractC2971b;
import java.util.Objects;

/* loaded from: classes.dex */
public class l implements y0.h {

    /* renamed from: g, reason: collision with root package name */
    private static final Size f18468g = new Size(1280, 720);

    /* renamed from: h, reason: collision with root package name */
    private static final Range f18469h = new Range(1, 60);

    /* renamed from: a, reason: collision with root package name */
    private final String f18470a;

    /* renamed from: b, reason: collision with root package name */
    private final e1 f18471b;

    /* renamed from: c, reason: collision with root package name */
    private final B0 f18472c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f18473d;

    /* renamed from: e, reason: collision with root package name */
    private final B f18474e;

    /* renamed from: f, reason: collision with root package name */
    private final Range f18475f;

    public l(String str, e1 e1Var, B0 b02, Size size, B b10, Range range) {
        this.f18470a = str;
        this.f18471b = e1Var;
        this.f18472c = b02;
        this.f18473d = size;
        this.f18474e = b10;
        this.f18475f = range;
    }

    private int b() {
        Range range = this.f18475f;
        Range range2 = I0.f38p;
        int intValue = !Objects.equals(range, range2) ? ((Integer) f18469h.clamp((Integer) this.f18475f.getUpper())).intValue() : 30;
        AbstractC0700h0.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", Integer.valueOf(intValue), Objects.equals(this.f18475f, range2) ? this.f18475f : "<UNSPECIFIED>"));
        return intValue;
    }

    @Override // y0.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        int b10 = b();
        AbstractC0700h0.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + b10 + "fps");
        Range c10 = this.f18472c.c();
        AbstractC0700h0.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int a10 = this.f18474e.a();
        int width = this.f18473d.getWidth();
        Size size = f18468g;
        int e10 = k.e(14000000, a10, 8, b10, 30, width, size.getWidth(), this.f18473d.getHeight(), size.getHeight(), c10);
        int a11 = AbstractC2971b.a(this.f18470a, this.f18474e);
        return p0.d().h(this.f18470a).g(this.f18471b).j(this.f18473d).b(e10).e(b10).i(a11).d(k.b(this.f18470a, a11)).a();
    }
}
