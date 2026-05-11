package h1;

import Jd.AbstractC0900o0;
import Jd.J;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {
    public static final J a(s sVar) {
        Map k10 = sVar.k();
        Object obj = k10.get("QueryDispatcher");
        if (obj == null) {
            obj = AbstractC0900o0.a(sVar.o());
            k10.put("QueryDispatcher", obj);
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (J) obj;
    }

    public static final J b(s sVar) {
        Map k10 = sVar.k();
        Object obj = k10.get("TransactionDispatcher");
        if (obj == null) {
            obj = AbstractC0900o0.a(sVar.r());
            k10.put("TransactionDispatcher", obj);
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (J) obj;
    }
}
