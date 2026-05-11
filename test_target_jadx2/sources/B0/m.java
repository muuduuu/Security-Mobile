package b0;

import A.AbstractC0700h0;
import A.B;
import A.I0;
import V.B0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.e1;
import c0.p0;
import java.util.Objects;

/* loaded from: classes.dex */
public class m implements y0.h {

    /* renamed from: a, reason: collision with root package name */
    private final String f18476a;

    /* renamed from: b, reason: collision with root package name */
    private final e1 f18477b;

    /* renamed from: c, reason: collision with root package name */
    private final B0 f18478c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f18479d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1441i0.c f18480e;

    /* renamed from: f, reason: collision with root package name */
    private final B f18481f;

    /* renamed from: g, reason: collision with root package name */
    private final Range f18482g;

    public m(String str, e1 e1Var, B0 b02, Size size, InterfaceC1441i0.c cVar, B b10, Range range) {
        this.f18476a = str;
        this.f18477b = e1Var;
        this.f18478c = b02;
        this.f18479d = size;
        this.f18480e = cVar;
        this.f18481f = b10;
        this.f18482g = range;
    }

    private int b() {
        int f10 = this.f18480e.f();
        Range range = this.f18482g;
        Range range2 = I0.f38p;
        int intValue = !Objects.equals(range, range2) ? ((Integer) this.f18482g.clamp(Integer.valueOf(f10))).intValue() : f10;
        AbstractC0700h0.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", Integer.valueOf(intValue), Integer.valueOf(f10), Objects.equals(this.f18482g, range2) ? this.f18482g : "<UNSPECIFIED>"));
        return intValue;
    }

    @Override // y0.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        int b10 = b();
        AbstractC0700h0.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + b10 + "fps");
        Range c10 = this.f18478c.c();
        AbstractC0700h0.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int e10 = k.e(this.f18480e.c(), this.f18481f.a(), this.f18480e.b(), b10, this.f18480e.f(), this.f18479d.getWidth(), this.f18480e.k(), this.f18479d.getHeight(), this.f18480e.h(), c10);
        int j10 = this.f18480e.j();
        return p0.d().h(this.f18476a).g(this.f18477b).j(this.f18479d).b(e10).e(b10).i(j10).d(k.b(this.f18476a, j10)).a();
    }
}
