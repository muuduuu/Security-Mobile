package yd;

import Kc.InterfaceC0936h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class W {

    /* renamed from: e, reason: collision with root package name */
    public static final a f45470e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final W f45471a;

    /* renamed from: b, reason: collision with root package name */
    private final Kc.e0 f45472b;

    /* renamed from: c, reason: collision with root package name */
    private final List f45473c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f45474d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final W a(W w10, Kc.e0 typeAliasDescriptor, List arguments) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List c10 = typeAliasDescriptor.r().c();
            Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            List list = c10;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Kc.f0) it.next()).a());
            }
            return new W(w10, typeAliasDescriptor, arguments, kotlin.collections.G.r(CollectionsKt.V0(arrayList, arguments)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ W(W w10, Kc.e0 e0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(w10, e0Var, list, map);
    }

    public final List a() {
        return this.f45473c;
    }

    public final Kc.e0 b() {
        return this.f45472b;
    }

    public final i0 c(e0 constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        InterfaceC0936h d10 = constructor.d();
        if (d10 instanceof Kc.f0) {
            return (i0) this.f45474d.get(d10);
        }
        return null;
    }

    public final boolean d(Kc.e0 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!Intrinsics.b(this.f45472b, descriptor)) {
            W w10 = this.f45471a;
            if (!(w10 != null ? w10.d(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }

    private W(W w10, Kc.e0 e0Var, List list, Map map) {
        this.f45471a = w10;
        this.f45472b = e0Var;
        this.f45473c = list;
        this.f45474d = map;
    }
}
