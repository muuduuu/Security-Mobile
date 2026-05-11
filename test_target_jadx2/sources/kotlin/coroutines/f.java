package kotlin.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public abstract class f {
    public static final void a(Function2 function2, Object obj, d completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        d c10 = AbstractC3868b.c(AbstractC3868b.a(function2, obj, completion));
        o.a aVar = o.f37128b;
        c10.resumeWith(o.b(Unit.f36324a));
    }
}
