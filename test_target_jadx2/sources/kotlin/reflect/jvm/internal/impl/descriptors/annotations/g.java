package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public interface g extends Iterable, InterfaceC5191a {

    /* renamed from: g0, reason: collision with root package name */
    public static final a f36445g0 = a.f36446a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f36446a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final g f36447b = new C0530a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a, reason: collision with other inner class name */
        public static final class C0530a implements g {
            C0530a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean A1(id.c cVar) {
                return b.b(this, cVar);
            }

            public Void c(id.c fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return CollectionsKt.j().iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public /* bridge */ /* synthetic */ c p(id.c cVar) {
                return (c) c(cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final g a(List annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return annotations.isEmpty() ? f36447b : new h(annotations);
        }

        public final g b() {
            return f36447b;
        }
    }

    public static final class b {
        public static c a(g gVar, id.c fqName) {
            Object obj;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.b(((c) obj).e(), fqName)) {
                    break;
                }
            }
            return (c) obj;
        }

        public static boolean b(g gVar, id.c fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return gVar.p(fqName) != null;
        }
    }

    boolean A1(id.c cVar);

    boolean isEmpty();

    c p(id.c cVar);
}
