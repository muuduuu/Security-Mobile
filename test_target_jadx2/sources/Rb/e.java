package rb;

import e.InterfaceC3060b;
import java.io.Serializable;
import lc.o;
import pc.AbstractC3868b;

/* loaded from: classes2.dex */
public abstract class e {

    static final class a implements InterfaceC3060b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f40565a;

        a(kotlin.coroutines.d dVar) {
            this.f40565a = dVar;
        }

        @Override // e.InterfaceC3060b
        public final void a(Object obj) {
            this.f40565a.resumeWith(o.b(obj));
        }
    }

    public final Object a(Serializable serializable, kotlin.coroutines.d dVar) {
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(dVar));
        b(serializable, new a(hVar));
        Object a10 = hVar.a();
        if (a10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a10;
    }

    public abstract void b(Serializable serializable, InterfaceC3060b interfaceC3060b);
}
