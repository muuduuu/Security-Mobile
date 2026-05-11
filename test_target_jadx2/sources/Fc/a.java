package Fc;

import Fc.e;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Class f2662a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2663b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC0058a f2664c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2665d;

    /* renamed from: e, reason: collision with root package name */
    private final List f2666e;

    /* renamed from: f, reason: collision with root package name */
    private final List f2667f;

    /* renamed from: g, reason: collision with root package name */
    private final List f2668g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Fc.a$a, reason: collision with other inner class name */
    public static final class EnumC0058a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0058a[] $VALUES;
        public static final EnumC0058a CALL_BY_NAME = new EnumC0058a("CALL_BY_NAME", 0);
        public static final EnumC0058a POSITIONAL_CALL = new EnumC0058a("POSITIONAL_CALL", 1);

        private static final /* synthetic */ EnumC0058a[] $values() {
            return new EnumC0058a[]{CALL_BY_NAME, POSITIONAL_CALL};
        }

        static {
            EnumC0058a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private EnumC0058a(String str, int i10) {
        }

        public static EnumC0058a valueOf(String str) {
            return (EnumC0058a) Enum.valueOf(EnumC0058a.class, str);
        }

        public static EnumC0058a[] values() {
            return (EnumC0058a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b JAVA = new b("JAVA", 0);
        public static final b KOTLIN = new b("KOTLIN", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{JAVA, KOTLIN};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private b(String str, int i10) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public a(Class jClass, List parameterNames, EnumC0058a callMode, b origin, List methods) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        Intrinsics.checkNotNullParameter(callMode, "callMode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f2662a = jClass;
        this.f2663b = parameterNames;
        this.f2664c = callMode;
        this.f2665d = methods;
        List list = methods;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f2666e = arrayList;
        List list2 = this.f2665d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.d(returnType);
            Class<?> g10 = Pc.d.g(returnType);
            if (g10 != null) {
                returnType = g10;
            }
            arrayList2.add(returnType);
        }
        this.f2667f = arrayList2;
        List list3 = this.f2665d;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.u(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f2668g = arrayList3;
        if (this.f2664c == EnumC0058a.POSITIONAL_CALL && origin == b.JAVA && !CollectionsKt.t0(this.f2663b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // Fc.e
    public /* bridge */ /* synthetic */ Member a() {
        return (Member) c();
    }

    public void b(Object[] objArr) {
        e.a.a(this, objArr);
    }

    public Void c() {
        return null;
    }

    @Override // Fc.e
    public Type g() {
        return this.f2662a;
    }

    @Override // Fc.e
    public Object h(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        b(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object k10 = (obj == null && this.f2664c == EnumC0058a.CALL_BY_NAME) ? this.f2668g.get(i11) : c.k(obj, (Class) this.f2667f.get(i11));
            if (k10 == null) {
                c.j(i11, (String) this.f2663b.get(i11), (Class) this.f2667f.get(i11));
                throw null;
            }
            arrayList.add(k10);
            i10++;
            i11 = i12;
        }
        return c.d(this.f2662a, G.r(CollectionsKt.V0(this.f2663b, arrayList)), this.f2665d);
    }

    @Override // Fc.e
    public List i() {
        return this.f2666e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(Class cls, List list, EnumC0058a enumC0058a, b bVar, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, list, enumC0058a, bVar, r5);
        List list3;
        if ((i10 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
    }
}
