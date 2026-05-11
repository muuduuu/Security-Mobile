package wb;

import Db.C0792a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class f extends AbstractC5054c {

    /* renamed from: h, reason: collision with root package name */
    private final Function2 f44424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String name, C0792a[] desiredArgsTypes, Function2 body) {
        super(name, desiredArgsTypes);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desiredArgsTypes, "desiredArgsTypes");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f44424h = body;
    }

    @Override // wb.AbstractC5054c
    public void p(Object[] args, pb.m promise, C3862a appContext) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f44424h.invoke(b(args, appContext), promise);
    }
}
