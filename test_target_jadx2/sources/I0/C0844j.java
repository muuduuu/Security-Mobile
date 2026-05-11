package I0;

import Jd.N;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: I0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0844j f4049a = new C0844j();

    private C0844j() {
    }

    public final InterfaceC0843i a(E storage, J0.b bVar, List migrations, N scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        InterfaceC0839e interfaceC0839e = bVar;
        if (bVar == null) {
            interfaceC0839e = new J0.a();
        }
        return new C0845k(storage, CollectionsKt.e(AbstractC0842h.f4031a.b(migrations)), interfaceC0839e, scope);
    }
}
