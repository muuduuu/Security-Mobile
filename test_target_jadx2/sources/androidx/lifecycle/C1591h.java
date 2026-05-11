package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1592i;
import java.util.Iterator;
import k1.d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1591h f17125a = new C1591h();

    /* renamed from: androidx.lifecycle.h$a */
    public static final class a implements d.a {
        @Override // k1.d.a
        public void a(k1.f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof X)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            W viewModelStore = ((X) owner).getViewModelStore();
            k1.d savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                S b10 = viewModelStore.b((String) it.next());
                Intrinsics.d(b10);
                C1591h.a(b10, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    public static final class b implements InterfaceC1596m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1592i f17126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.d f17127b;

        b(AbstractC1592i abstractC1592i, k1.d dVar) {
            this.f17126a = abstractC1592i;
            this.f17127b = dVar;
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p source, AbstractC1592i.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1592i.a.ON_START) {
                this.f17126a.d(this);
                this.f17127b.i(a.class);
            }
        }
    }

    private C1591h() {
    }

    public static final void a(S viewModel, k1.d registry, AbstractC1592i lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        I i10 = (I) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (i10 == null || i10.c()) {
            return;
        }
        i10.a(registry, lifecycle);
        f17125a.c(registry, lifecycle);
    }

    public static final I b(k1.d registry, AbstractC1592i lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.d(str);
        I i10 = new I(str, G.f17039f.a(registry.b(str), bundle));
        i10.a(registry, lifecycle);
        f17125a.c(registry, lifecycle);
        return i10;
    }

    private final void c(k1.d dVar, AbstractC1592i abstractC1592i) {
        AbstractC1592i.b b10 = abstractC1592i.b();
        if (b10 == AbstractC1592i.b.INITIALIZED || b10.isAtLeast(AbstractC1592i.b.STARTED)) {
            dVar.i(a.class);
        } else {
            abstractC1592i.a(new b(abstractC1592i, dVar));
        }
    }
}
