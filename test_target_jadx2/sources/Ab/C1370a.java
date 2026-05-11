package ab;

import J2.g;
import i2.h;
import i2.j;
import java.io.IOException;
import java.io.InputStream;
import k2.v;
import kotlin.jvm.internal.Intrinsics;
import q2.C3916m;

/* renamed from: ab.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1370a implements j {
    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream source, int i10, int i11, h options) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            g l10 = g.l(source);
            Intrinsics.checkNotNullExpressionValue(l10, "getFromInputStream(...)");
            if (l10.g() == null) {
                float h10 = l10.h();
                float f10 = l10.f();
                if (h10 != -1.0f && f10 != -1.0f) {
                    l10.u(0.0f, 0.0f, h10, f10);
                }
            }
            l10.v(i10);
            l10.t(i11);
            return new C3916m(l10);
        } catch (J2.j e10) {
            throw new IOException("Cannot load SVG from stream", e10);
        }
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream source, h options) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        return true;
    }
}
