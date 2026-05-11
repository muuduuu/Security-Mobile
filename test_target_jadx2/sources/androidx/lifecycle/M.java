package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.V;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M extends V.e implements V.c {

    /* renamed from: b, reason: collision with root package name */
    private Application f17059b;

    /* renamed from: c, reason: collision with root package name */
    private final V.c f17060c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f17061d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1592i f17062e;

    /* renamed from: f, reason: collision with root package name */
    private k1.d f17063f;

    public M(Application application, k1.f owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f17063f = owner.getSavedStateRegistry();
        this.f17062e = owner.getLifecycle();
        this.f17061d = bundle;
        this.f17059b = application;
        this.f17060c = application != null ? V.a.f17102f.a(application) : new V.a();
    }

    @Override // androidx.lifecycle.V.c
    public S a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.V.c
    public S c(Class modelClass, Z0.a extras) {
        List list;
        Constructor c10;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(V.d.f17110d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(J.f17050a) == null || extras.a(J.f17051b) == null) {
            if (this.f17062e != null) {
                return e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(V.a.f17104h);
        boolean isAssignableFrom = AbstractC1584a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = N.f17065b;
            c10 = N.c(modelClass, list);
        } else {
            list2 = N.f17064a;
            c10 = N.c(modelClass, list2);
        }
        return c10 == null ? this.f17060c.c(modelClass, extras) : (!isAssignableFrom || application == null) ? N.d(modelClass, c10, J.a(extras)) : N.d(modelClass, c10, application, J.a(extras));
    }

    @Override // androidx.lifecycle.V.e
    public void d(S viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f17062e != null) {
            k1.d dVar = this.f17063f;
            Intrinsics.d(dVar);
            AbstractC1592i abstractC1592i = this.f17062e;
            Intrinsics.d(abstractC1592i);
            C1591h.a(viewModel, dVar, abstractC1592i);
        }
    }

    public final S e(String key, Class modelClass) {
        List list;
        Constructor c10;
        S d10;
        Application application;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC1592i abstractC1592i = this.f17062e;
        if (abstractC1592i == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC1584a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.f17059b == null) {
            list = N.f17065b;
            c10 = N.c(modelClass, list);
        } else {
            list2 = N.f17064a;
            c10 = N.c(modelClass, list2);
        }
        if (c10 == null) {
            return this.f17059b != null ? this.f17060c.a(modelClass) : V.d.f17108b.a().a(modelClass);
        }
        k1.d dVar = this.f17063f;
        Intrinsics.d(dVar);
        I b10 = C1591h.b(dVar, abstractC1592i, key, this.f17061d);
        if (!isAssignableFrom || (application = this.f17059b) == null) {
            d10 = N.d(modelClass, c10, b10.b());
        } else {
            Intrinsics.d(application);
            d10 = N.d(modelClass, c10, application, b10.b());
        }
        d10.a("androidx.lifecycle.savedstate.vm.tag", b10);
        return d10;
    }
}
