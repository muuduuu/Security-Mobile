package Gc;

import Kc.a0;
import Sc.A;
import Sc.B;
import bd.t;
import id.C3367b;
import id.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import xc.y;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2992a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f2993b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3367b f2994c;

    static {
        List m10 = CollectionsKt.m(B.f8943a, B.f8954l, B.f8955m, B.f8946d, B.f8948f, B.f8951i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C3367b.m((c) it.next()));
        }
        f2993b = linkedHashSet;
        C3367b m11 = C3367b.m(B.f8952j);
        Intrinsics.checkNotNullExpressionValue(m11, "topLevel(...)");
        f2994c = m11;
    }

    private a() {
    }

    public final C3367b a() {
        return f2994c;
    }

    public final Set b() {
        return f2993b;
    }

    public final boolean c(t klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        y yVar = new y();
        klass.c(new C0072a(yVar), null);
        return yVar.f44999a;
    }

    /* renamed from: Gc.a$a, reason: collision with other inner class name */
    public static final class C0072a implements t.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f2995a;

        C0072a(y yVar) {
            this.f2995a = yVar;
        }

        @Override // bd.t.c
        public t.a b(C3367b classId, a0 source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            if (!Intrinsics.b(classId, A.f8938a.a())) {
                return null;
            }
            this.f2995a.f44999a = true;
            return null;
        }

        @Override // bd.t.c
        public void a() {
        }
    }
}
