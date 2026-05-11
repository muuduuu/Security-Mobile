package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import vc.AbstractC5011a;

/* loaded from: classes3.dex */
public abstract class t {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36738a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36738a = iArr;
        }
    }

    /* synthetic */ class b extends xc.j implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final b f36739j = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(o oVar, boolean z10) {
        e j10 = oVar.j();
        if (j10 instanceof p) {
            return new s((p) j10);
        }
        if (!(j10 instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + oVar);
        }
        d dVar = (d) j10;
        Class c10 = z10 ? AbstractC5011a.c(dVar) : AbstractC5011a.b(dVar);
        List f10 = oVar.f();
        if (f10.isEmpty()) {
            return c10;
        }
        if (!c10.isArray()) {
            return e(c10, f10);
        }
        if (c10.getComponentType().isPrimitive()) {
            return c10;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.C0(f10);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + oVar);
        }
        q variance = kTypeProjection.getVariance();
        o type = kTypeProjection.getType();
        int i10 = variance == null ? -1 : a.f36738a[variance.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return c10;
        }
        if (i10 != 2 && i10 != 3) {
            throw new lc.m();
        }
        Intrinsics.d(type);
        Type d10 = d(type, false, 1, null);
        return d10 instanceof Class ? c10 : new kotlin.reflect.a(d10);
    }

    static /* synthetic */ Type d(o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(oVar, z10);
    }

    private static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((KTypeProjection) it.next()));
            }
            return new r(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((KTypeProjection) it2.next()));
            }
            return new r(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type e10 = e(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.u(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((KTypeProjection) it3.next()));
        }
        return new r(cls, e10, arrayList3);
    }

    public static final Type f(o oVar) {
        Type s10;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return (!(oVar instanceof xc.l) || (s10 = ((xc.l) oVar).s()) == null) ? d(oVar, false, 1, null) : s10;
    }

    private static final Type g(KTypeProjection kTypeProjection) {
        q d10 = kTypeProjection.d();
        if (d10 == null) {
            return u.f36740c.a();
        }
        o c10 = kTypeProjection.c();
        Intrinsics.d(c10);
        int i10 = a.f36738a[d10.ordinal()];
        if (i10 == 1) {
            return new u(null, c(c10, true));
        }
        if (i10 == 2) {
            return c(c10, true);
        }
        if (i10 == 3) {
            return new u(c(c10, true), null);
        }
        throw new lc.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Sequence h10 = kotlin.sequences.j.h(type, b.f36739j);
            name = ((Class) kotlin.sequences.j.v(h10)).getName() + StringsKt.v("[]", kotlin.sequences.j.l(h10));
        } else {
            name = cls.getName();
        }
        Intrinsics.d(name);
        return name;
    }
}
