package Cc;

import Ec.AbstractC0831j;
import Ec.C0832k;
import Ec.o;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0952y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.f;
import kotlin.reflect.g;
import kotlin.reflect.j;
import xc.C5142C;
import xc.m;
import xc.t;

/* loaded from: classes3.dex */
public abstract class d {

    static final class b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f1085a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.d dVar) {
            super(1);
            this.f1085a = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.d dVar) {
            return Boolean.valueOf(Intrinsics.b(dVar, this.f1085a));
        }
    }

    public static final Object b(kotlin.reflect.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Iterator it = dVar.k().iterator();
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                List c10 = ((g) next).c();
                if (!(c10 instanceof Collection) || !c10.isEmpty()) {
                    Iterator it2 = c10.iterator();
                    while (it2.hasNext()) {
                        if (!((j) it2.next()).A()) {
                            break;
                        }
                    }
                }
                if (z10) {
                    break;
                }
                z10 = true;
                obj2 = next;
            } else if (z10) {
                obj = obj2;
            }
        }
        g gVar = (g) obj;
        if (gVar != null) {
            return gVar.v(G.h());
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + dVar);
    }

    public static final Collection c(kotlin.reflect.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Collection k10 = ((C0832k.a) ((C0832k) dVar).Z().getValue()).k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : k10) {
            AbstractC0831j abstractC0831j = (AbstractC0831j) obj;
            if (h(abstractC0831j) && (abstractC0831j instanceof kotlin.reflect.m)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Collection d(kotlin.reflect.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Collection g10 = ((C0832k.a) ((C0832k) dVar).Z().getValue()).g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : g10) {
            AbstractC0831j abstractC0831j = (AbstractC0831j) obj;
            if (h(abstractC0831j) && (abstractC0831j instanceof kotlin.reflect.m)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final g e(kotlin.reflect.d dVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Iterator it = ((C0832k) dVar).k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            g gVar = (g) obj;
            Intrinsics.e(gVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            InterfaceC0952y S10 = ((o) gVar).S();
            Intrinsics.e(S10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((InterfaceC0940l) S10).H()) {
                break;
            }
        }
        return (g) obj;
    }

    public static final List f(kotlin.reflect.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List a10 = dVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            kotlin.reflect.e j10 = ((kotlin.reflect.o) it.next()).j();
            kotlin.reflect.d dVar2 = j10 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j10 : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    private static final boolean g(AbstractC0831j abstractC0831j) {
        return abstractC0831j.S().s0() != null;
    }

    private static final boolean h(AbstractC0831j abstractC0831j) {
        return !g(abstractC0831j);
    }

    public static final boolean i(kotlin.reflect.d dVar, kotlin.reflect.d base) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        if (!Intrinsics.b(dVar, base)) {
            Boolean e10 = Gd.b.e(CollectionsKt.e(dVar), new c(new t() { // from class: Cc.d.a
                @Override // xc.AbstractC5150c
                public f E() {
                    return C5142C.d(d.class, "kotlin-reflection");
                }

                @Override // xc.AbstractC5150c
                public String G() {
                    return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
                }

                @Override // kotlin.reflect.m
                public Object get(Object obj) {
                    return d.f((kotlin.reflect.d) obj);
                }

                @Override // xc.AbstractC5150c, kotlin.reflect.c
                public String getName() {
                    return "superclasses";
                }
            }), new b(base));
            Intrinsics.checkNotNullExpressionValue(e10, "ifAny(...)");
            if (!e10.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable j(kotlin.reflect.m tmp0, kotlin.reflect.d dVar) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke(dVar);
    }

    public static final boolean k(kotlin.reflect.d dVar, kotlin.reflect.d derived) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(derived, "derived");
        return i(derived, dVar);
    }
}
