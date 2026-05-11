package ud;

import Kc.J;
import dd.C3025b;
import dd.C3027d;
import dd.C3030g;
import dd.C3032i;
import dd.C3037n;
import dd.C3040q;
import dd.C3042s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import md.AbstractC3680g;
import td.AbstractC4829a;
import ud.AbstractC4882A;
import yd.AbstractC5197E;

/* renamed from: ud.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4886d implements InterfaceC4885c {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4829a f43660a;

    /* renamed from: b, reason: collision with root package name */
    private final C4887e f43661b;

    /* renamed from: ud.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43662a;

        static {
            int[] iArr = new int[EnumC4884b.values().length];
            try {
                iArr[EnumC4884b.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4884b.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4884b.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43662a = iArr;
        }
    }

    public C4886d(Kc.G module, J notFoundClasses, AbstractC4829a protocol) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f43660a = protocol;
        this.f43661b = new C4887e(module, notFoundClasses);
    }

    @Override // ud.InterfaceC4888f
    public List b(C3040q proto, fd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List list = (List) proto.r(this.f43660a.o());
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List c(AbstractC4882A container, C3037n proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        i.f k10 = this.f43660a.k();
        List list = k10 != null ? (List) proto.r(k10) : null;
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List e(AbstractC4882A container, kotlin.reflect.jvm.internal.impl.protobuf.p proto, EnumC4884b kind) {
        List list;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof C3027d) {
            list = (List) ((C3027d) proto).r(this.f43660a.c());
        } else if (proto instanceof C3032i) {
            list = (List) ((C3032i) proto).r(this.f43660a.f());
        } else {
            if (!(proto instanceof C3037n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = a.f43662a[kind.ordinal()];
            if (i10 == 1) {
                list = (List) ((C3037n) proto).r(this.f43660a.i());
            } else if (i10 == 2) {
                list = (List) ((C3037n) proto).r(this.f43660a.m());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((C3037n) proto).r(this.f43660a.n());
            }
        }
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List f(AbstractC4882A.a container) {
        Intrinsics.checkNotNullParameter(container, "container");
        List list = (List) container.f().r(this.f43660a.a());
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List g(C3042s proto, fd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List list = (List) proto.r(this.f43660a.p());
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List h(AbstractC4882A container, kotlin.reflect.jvm.internal.impl.protobuf.p callableProto, EnumC4884b kind, int i10, dd.u proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List list = (List) proto.r(this.f43660a.h());
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List i(AbstractC4882A container, kotlin.reflect.jvm.internal.impl.protobuf.p proto, EnumC4884b kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        List list = null;
        if (proto instanceof C3032i) {
            i.f g10 = this.f43660a.g();
            if (g10 != null) {
                list = (List) ((C3032i) proto).r(g10);
            }
        } else {
            if (!(proto instanceof C3037n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = a.f43662a[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            i.f l10 = this.f43660a.l();
            if (l10 != null) {
                list = (List) ((C3037n) proto).r(l10);
            }
        }
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List j(AbstractC4882A container, C3030g proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List list = (List) proto.r(this.f43660a.d());
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4888f
    public List k(AbstractC4882A container, C3037n proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        i.f j10 = this.f43660a.j();
        List list = j10 != null ? (List) proto.r(j10) : null;
        if (list == null) {
            list = CollectionsKt.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f43661b.a((C3025b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // ud.InterfaceC4885c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC3680g a(AbstractC4882A container, C3037n proto, AbstractC5197E expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    @Override // ud.InterfaceC4885c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC3680g d(AbstractC4882A container, C3037n proto, AbstractC5197E expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        C3025b.C0455b.c cVar = (C3025b.C0455b.c) fd.e.a(proto, this.f43660a.b());
        if (cVar == null) {
            return null;
        }
        return this.f43661b.f(expectedType, cVar, container.b());
    }
}
