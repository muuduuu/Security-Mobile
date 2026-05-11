package L0;

import Jd.C0874b0;
import Jd.N;
import Jd.O;
import Jd.O0;
import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0.a$a, reason: collision with other inner class name */
    public static final class C0109a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0109a f5624a = new C0109a();

        C0109a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.j();
        }
    }

    public static final Ac.c a(String name, J0.b bVar, Function1 produceMigrations, N scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ Ac.c b(String str, J0.b bVar, Function1 function1, N n10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0109a.f5624a;
        }
        if ((i10 & 8) != 0) {
            n10 = O.a(C0874b0.b().l(O0.b(null, 1, null)));
        }
        return a(str, bVar, function1, n10);
    }
}
