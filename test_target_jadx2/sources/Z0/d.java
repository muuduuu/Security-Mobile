package Z0;

import a1.C1342g;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final W f12279a;

    /* renamed from: b, reason: collision with root package name */
    private final V.c f12280b;

    /* renamed from: c, reason: collision with root package name */
    private final a f12281c;

    public d(W store, V.c factory, a extras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f12279a = store;
        this.f12280b = factory;
        this.f12281c = extras;
    }

    public static /* synthetic */ S b(d dVar, kotlin.reflect.d dVar2, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = C1342g.f12546a.c(dVar2);
        }
        return dVar.a(dVar2, str);
    }

    public final S a(kotlin.reflect.d modelClass, String key) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        S b10 = this.f12279a.b(key);
        if (!modelClass.y(b10)) {
            b bVar = new b(this.f12281c);
            bVar.c(C1342g.a.f12547a, key);
            S a10 = e.a(this.f12280b, modelClass, bVar);
            this.f12279a.d(key, a10);
            return a10;
        }
        Object obj = this.f12280b;
        if (obj instanceof V.e) {
            Intrinsics.d(b10);
            ((V.e) obj).d(b10);
        }
        Intrinsics.e(b10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return b10;
    }
}
