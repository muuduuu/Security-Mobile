package kotlin.reflect.jvm.internal.impl.types.error;

import Kc.InterfaceC0936h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, rd.h
    public Set b() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, rd.h
    public Set d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, rd.h
    public Set e() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, rd.k
    public Collection g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, rd.h
    /* renamed from: h */
    public Set a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, rd.h
    /* renamed from: i */
    public Set c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
