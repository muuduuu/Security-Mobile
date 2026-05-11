package k1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import java.util.Iterator;
import java.util.Map;
import k1.C3530b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.C3701b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    private static final b f35969g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f35971b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f35972c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35973d;

    /* renamed from: e, reason: collision with root package name */
    private C3530b.C0518b f35974e;

    /* renamed from: a, reason: collision with root package name */
    private final C3701b f35970a = new C3701b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f35975f = true;

    public interface a {
        void a(f fVar);
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d this$0, InterfaceC1599p interfaceC1599p, AbstractC1592i.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1599p, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1592i.a.ON_START) {
            this$0.f35975f = true;
        } else if (event == AbstractC1592i.a.ON_STOP) {
            this$0.f35975f = false;
        }
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f35973d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f35972c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f35972c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f35972c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f35972c = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator it = this.f35970a.iterator();
        while (it.hasNext()) {
            Map.Entry components = (Map.Entry) it.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (Intrinsics.b(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC1592i lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f35971b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC1596m() { // from class: k1.c
            @Override // androidx.lifecycle.InterfaceC1596m
            public final void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
                d.d(d.this, interfaceC1599p, aVar);
            }
        });
        this.f35971b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f35971b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f35973d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f35972c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f35973d = true;
    }

    public final void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f35972c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C3701b.d j10 = this.f35970a.j();
        Intrinsics.checkNotNullExpressionValue(j10, "this.components.iteratorWithAdditions()");
        while (j10.hasNext()) {
            Map.Entry entry = (Map.Entry) j10.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.f35970a.r(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f35975f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C3530b.C0518b c0518b = this.f35974e;
        if (c0518b == null) {
            c0518b = new C3530b.C0518b(this);
        }
        this.f35974e = c0518b;
        try {
            clazz.getDeclaredConstructor(null);
            C3530b.C0518b c0518b2 = this.f35974e;
            if (c0518b2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                c0518b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
