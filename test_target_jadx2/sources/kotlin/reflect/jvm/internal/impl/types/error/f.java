package kotlin.reflect.jvm.internal.impl.types.error;

import Kc.InterfaceC0936h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class f implements rd.h {

    /* renamed from: b, reason: collision with root package name */
    private final g f36714b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36715c;

    public f(g kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f36714b = kind;
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.f36715c = format;
    }

    @Override // rd.h
    public Set b() {
        return O.d();
    }

    @Override // rd.h
    public Set d() {
        return O.d();
    }

    @Override // rd.h
    public Set e() {
        return O.d();
    }

    @Override // rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        id.f r10 = id.f.r(format);
        Intrinsics.checkNotNullExpressionValue(r10, "special(...)");
        return new a(r10);
    }

    @Override // rd.k
    public Collection g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.j();
    }

    @Override // rd.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return O.c(new c(k.f36726a.h()));
    }

    @Override // rd.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return k.f36726a.j();
    }

    protected final String j() {
        return this.f36715c;
    }

    public String toString() {
        return "ErrorScope{" + this.f36715c + '}';
    }
}
