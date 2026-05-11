package k1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k1.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3530b implements InterfaceC1596m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f35965b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f35966a;

    /* renamed from: k1.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: k1.b$b, reason: collision with other inner class name */
    public static final class C0518b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f35967a;

        public C0518b(d registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f35967a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // k1.d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f35967a));
            return bundle;
        }

        public final void b(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f35967a.add(className);
        }
    }

    public C3530b(f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f35966a = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, C3530b.class.getClassLoader()).asSubclass(d.a.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) newInstance).a(this.f35966a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1596m
    public void d(InterfaceC1599p source, AbstractC1592i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1592i.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle b10 = this.f35966a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b10 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
