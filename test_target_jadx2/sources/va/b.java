package Va;

import i2.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.n;

/* loaded from: classes2.dex */
public final class b implements n {
    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(String model, int i10, int i11, h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new n.a(new C2.c(model), new a(model));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return StringsKt.F(model, "data:", false, 2, null);
    }
}
