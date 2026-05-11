package ud;

import id.C3367b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class y {
    public static final C3367b a(fd.c cVar, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        C3367b f10 = C3367b.f(cVar.a(i10), cVar.b(i10));
        Intrinsics.checkNotNullExpressionValue(f10, "fromString(...)");
        return f10;
    }

    public static final id.f b(fd.c cVar, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        id.f n10 = id.f.n(cVar.getString(i10));
        Intrinsics.checkNotNullExpressionValue(n10, "guessByFirstCharacter(...)");
        return n10;
    }
}
