package z4;

import Td.B;
import Td.InterfaceC1229e;
import Td.q;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5254a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5254a f45735a = new C5254a();

    private C5254a() {
    }

    public static final void a(B client, Object tag) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Method method = B.class.getMethod("o", null);
        method.setAccessible(true);
        Object invoke = method.invoke(client, null);
        Intrinsics.e(invoke, "null cannot be cast to non-null type okhttp3.Dispatcher");
        q qVar = (q) invoke;
        for (InterfaceC1229e interfaceC1229e : qVar.i()) {
            if (Intrinsics.b(tag, interfaceC1229e.t().k())) {
                interfaceC1229e.cancel();
                return;
            }
        }
        for (InterfaceC1229e interfaceC1229e2 : qVar.j()) {
            if (Intrinsics.b(tag, interfaceC1229e2.t().k())) {
                interfaceC1229e2.cancel();
                return;
            }
        }
    }
}
