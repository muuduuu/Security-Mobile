package Td;

import kotlin.jvm.internal.Intrinsics;
import pe.C3880h;

/* loaded from: classes3.dex */
public abstract class K {
    public abstract void a(J j10, int i10, String str);

    public void b(J webSocket, int i10, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public abstract void c(J j10, Throwable th, F f10);

    public abstract void d(J j10, String str);

    public void e(J webSocket, C3880h bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public void f(J webSocket, F response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
    }
}
