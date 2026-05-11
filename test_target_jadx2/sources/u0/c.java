package U0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1573o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10280a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static C0196c f10281b = C0196c.f10283d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: U0.c$c, reason: collision with other inner class name */
    public static final class C0196c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f10282c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final C0196c f10283d = new C0196c(O.d(), null, G.h());

        /* renamed from: a, reason: collision with root package name */
        private final Set f10284a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f10285b;

        /* renamed from: U0.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C0196c(Set flags, b bVar, Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f10284a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f10285b = linkedHashMap;
        }

        public final Set a() {
            return this.f10284a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f10285b;
        }
    }

    private c() {
    }

    private final C0196c b(ComponentCallbacksC1573o componentCallbacksC1573o) {
        while (componentCallbacksC1573o != null) {
            if (componentCallbacksC1573o.isAdded()) {
                androidx.fragment.app.G parentFragmentManager = componentCallbacksC1573o.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.C0() != null) {
                    C0196c C02 = parentFragmentManager.C0();
                    Intrinsics.d(C02);
                    return C02;
                }
            }
            componentCallbacksC1573o = componentCallbacksC1573o.getParentFragment();
        }
        return f10281b;
    }

    private final void c(C0196c c0196c, final m mVar) {
        ComponentCallbacksC1573o a10 = mVar.a();
        final String name = a10.getClass().getName();
        if (c0196c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, mVar);
        }
        c0196c.b();
        if (c0196c.a().contains(a.PENALTY_DEATH)) {
            p(a10, new Runnable() { // from class: U0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, mVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, m violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(m mVar) {
        if (androidx.fragment.app.G.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + mVar.a().getClass().getName(), mVar);
        }
    }

    public static final void f(ComponentCallbacksC1573o fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        U0.a aVar = new U0.a(fragment, previousFragmentId);
        c cVar = f10280a;
        cVar.e(aVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.q(b10, fragment.getClass(), aVar.getClass())) {
            cVar.c(b10, aVar);
        }
    }

    public static final void g(ComponentCallbacksC1573o fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f10280a;
        cVar.e(dVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.q(b10, fragment.getClass(), dVar.getClass())) {
            cVar.c(b10, dVar);
        }
    }

    public static final void h(ComponentCallbacksC1573o fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f10280a;
        cVar.e(eVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b10, fragment.getClass(), eVar.getClass())) {
            cVar.c(b10, eVar);
        }
    }

    public static final void i(ComponentCallbacksC1573o fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f10280a;
        cVar.e(fVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, fragment.getClass(), fVar.getClass())) {
            cVar.c(b10, fVar);
        }
    }

    public static final void j(ComponentCallbacksC1573o fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        g gVar = new g(fragment);
        c cVar = f10280a;
        cVar.e(gVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, fragment.getClass(), gVar.getClass())) {
            cVar.c(b10, gVar);
        }
    }

    public static final void k(ComponentCallbacksC1573o fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        i iVar = new i(fragment);
        c cVar = f10280a;
        cVar.e(iVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b10, fragment.getClass(), iVar.getClass())) {
            cVar.c(b10, iVar);
        }
    }

    public static final void l(ComponentCallbacksC1573o violatingFragment, ComponentCallbacksC1573o targetFragment, int i10) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, i10);
        c cVar = f10280a;
        cVar.e(jVar);
        C0196c b10 = cVar.b(violatingFragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, violatingFragment.getClass(), jVar.getClass())) {
            cVar.c(b10, jVar);
        }
    }

    public static final void m(ComponentCallbacksC1573o fragment, boolean z10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        k kVar = new k(fragment, z10);
        c cVar = f10280a;
        cVar.e(kVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.q(b10, fragment.getClass(), kVar.getClass())) {
            cVar.c(b10, kVar);
        }
    }

    public static final void n(ComponentCallbacksC1573o fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        n nVar = new n(fragment, container);
        c cVar = f10280a;
        cVar.e(nVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.q(b10, fragment.getClass(), nVar.getClass())) {
            cVar.c(b10, nVar);
        }
    }

    public static final void o(ComponentCallbacksC1573o fragment, ComponentCallbacksC1573o expectedParentFragment, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        o oVar = new o(fragment, expectedParentFragment, i10);
        c cVar = f10280a;
        cVar.e(oVar);
        C0196c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.q(b10, fragment.getClass(), oVar.getClass())) {
            cVar.c(b10, oVar);
        }
    }

    private final void p(ComponentCallbacksC1573o componentCallbacksC1573o, Runnable runnable) {
        if (!componentCallbacksC1573o.isAdded()) {
            runnable.run();
            return;
        }
        Handler g10 = componentCallbacksC1573o.getParentFragmentManager().w0().g();
        Intrinsics.checkNotNullExpressionValue(g10, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.b(g10.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            g10.post(runnable);
        }
    }

    private final boolean q(C0196c c0196c, Class cls, Class cls2) {
        Set set = (Set) c0196c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.b(cls2.getSuperclass(), m.class) || !CollectionsKt.V(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
