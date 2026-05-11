package bb;

import i2.h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.n;

/* renamed from: bb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1670e implements n {
    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(C1669d model, int i10, int i11, h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        List<String> pathSegments = model.a().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return new n.a(new C2.c(model), new C1668c(StringsKt.z(CollectionsKt.l0(pathSegments, "/", null, null, 0, null, null, 62, null), "\\", "/", false, 4, null)));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(C1669d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }
}
