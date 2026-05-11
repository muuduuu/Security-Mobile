package Hc;

import Kc.G;
import Kc.L;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0078a f3821a = C0078a.f3822a;

    /* renamed from: Hc.a$a, reason: collision with other inner class name */
    public static final class C0078a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0078a f3822a = new C0078a();

        /* renamed from: b, reason: collision with root package name */
        private static final Lazy f3823b = lc.i.b(lc.l.PUBLICATION, C0079a.f3824a);

        /* renamed from: Hc.a$a$a, reason: collision with other inner class name */
        static final class C0079a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0079a f3824a = new C0079a();

            C0079a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
                Intrinsics.d(load);
                a aVar = (a) CollectionsKt.e0(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        private C0078a() {
        }

        public final a a() {
            return (a) f3823b.getValue();
        }
    }

    L a(xd.n nVar, G g10, Iterable iterable, Lc.c cVar, Lc.a aVar, boolean z10);
}
