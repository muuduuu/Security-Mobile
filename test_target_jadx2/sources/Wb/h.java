package wb;

import Db.C0792a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class h extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String name, C0792a[] desiredArgsTypes, Function1 body) {
        super(name, desiredArgsTypes, body);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desiredArgsTypes, "desiredArgsTypes");
        Intrinsics.checkNotNullParameter(body, "body");
    }

    @Override // wb.e, wb.AbstractC5054c
    public void p(Object[] args, pb.m promise, C3862a appContext) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        promise.b(((Boolean) r().invoke(b(args, appContext))).booleanValue());
    }
}
