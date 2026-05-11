package ab;

import J2.g;
import J2.l;
import Ta.C1199d;
import android.content.Context;
import android.graphics.Picture;
import android.graphics.RectF;
import i2.h;
import k2.v;
import kotlin.jvm.internal.Intrinsics;
import q2.C3916m;
import w2.InterfaceC5032e;

/* renamed from: ab.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1371b implements InterfaceC5032e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12648a;

    public C1371b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12648a = context;
    }

    @Override // w2.InterfaceC5032e
    public v a(v toTranscode, h options) {
        Intrinsics.checkNotNullParameter(toTranscode, "toTranscode");
        Intrinsics.checkNotNullParameter(options, "options");
        Object obj = toTranscode.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        g gVar = (g) obj;
        RectF g10 = gVar.g();
        int width = g10 != null ? (int) g10.width() : 512;
        RectF g11 = gVar.g();
        int height = g11 != null ? (int) g11.height() : 512;
        Integer num = (Integer) options.c(C1199d.f9518a.a());
        if (num != null) {
            l.b(gVar, num.intValue());
        }
        Picture o10 = gVar.o();
        Intrinsics.checkNotNullExpressionValue(o10, "renderToPicture(...)");
        return new C3916m(new C1372c(o10, width, height));
    }
}
