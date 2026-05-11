package androidx.lifecycle;

import Z0.a;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.V;
import k1.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f17050a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f17051b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f17052c = new a();

    public static final class a implements a.b {
        a() {
        }
    }

    public static final class b implements a.b {
        b() {
        }
    }

    public static final class c implements a.b {
        c() {
        }
    }

    public static final class d implements V.c {
        d() {
        }

        @Override // androidx.lifecycle.V.c
        public S c(Class modelClass, Z0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new L();
        }
    }

    public static final G a(Z0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        k1.f fVar = (k1.f) aVar.a(f17050a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        X x10 = (X) aVar.a(f17051b);
        if (x10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f17052c);
        String str = (String) aVar.a(V.d.f17110d);
        if (str != null) {
            return b(fVar, x10, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final G b(k1.f fVar, X x10, String str, Bundle bundle) {
        K d10 = d(fVar);
        L e10 = e(x10);
        G g10 = (G) e10.e().get(str);
        if (g10 != null) {
            return g10;
        }
        G a10 = G.f17039f.a(d10.b(str), bundle);
        e10.e().put(str, a10);
        return a10;
    }

    public static final void c(k1.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        AbstractC1592i.b b10 = fVar.getLifecycle().b();
        if (b10 != AbstractC1592i.b.INITIALIZED && b10 != AbstractC1592i.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            K k10 = new K(fVar.getSavedStateRegistry(), (X) fVar);
            fVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", k10);
            fVar.getLifecycle().a(new H(k10));
        }
    }

    public static final K d(k1.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        d.c c10 = fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        K k10 = c10 instanceof K ? (K) c10 : null;
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final L e(X x10) {
        Intrinsics.checkNotNullParameter(x10, "<this>");
        return (L) new V(x10, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", L.class);
    }
}
