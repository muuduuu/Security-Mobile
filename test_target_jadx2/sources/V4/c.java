package V4;

import c3.AbstractC1721a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c implements f {
    @Override // V4.f
    public final void a(Object obj, h responder) {
        Intrinsics.checkNotNullParameter(responder, "responder");
        responder.b("Request is not supported");
        AbstractC1721a.m(b.class.getSimpleName(), "Request is not supported");
    }
}
