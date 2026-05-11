package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface e extends CoroutineContext.Element {

    /* renamed from: f0, reason: collision with root package name */
    public static final b f36370f0 = b.f36371a;

    public static final class a {
        public static CoroutineContext.Element a(e eVar, CoroutineContext.b key) {
            CoroutineContext.Element b10;
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (e.f36370f0 != key) {
                    return null;
                }
                Intrinsics.e(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.a(eVar.getKey()) || (b10 = bVar.b(eVar)) == null) {
                return null;
            }
            return b10;
        }

        public static CoroutineContext b(e eVar, CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return e.f36370f0 == key ? g.f36372a : eVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : g.f36372a;
        }
    }

    public static final class b implements CoroutineContext.b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f36371a = new b();

        private b() {
        }
    }

    void f(d dVar);

    d i(d dVar);
}
