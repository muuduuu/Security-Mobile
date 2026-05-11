package rd;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f40606c;

    /* renamed from: d, reason: collision with root package name */
    private static int f40607d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f40608e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f40609f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f40610g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f40611h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f40612i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f40613j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f40614k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f40615l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f40616m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f40617n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f40618o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f40619p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f40620q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f40621r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f40622s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f40623t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f40624u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f40625v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f40626w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f40627x;

    /* renamed from: y, reason: collision with root package name */
    private static final List f40628y;

    /* renamed from: z, reason: collision with root package name */
    private static final List f40629z;

    /* renamed from: a, reason: collision with root package name */
    private final List f40630a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40631b;

    public static final class a {

        /* renamed from: rd.d$a$a, reason: collision with other inner class name */
        private static final class C0607a {

            /* renamed from: a, reason: collision with root package name */
            private final int f40632a;

            /* renamed from: b, reason: collision with root package name */
            private final String f40633b;

            public C0607a(int i10, String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f40632a = i10;
                this.f40633b = name;
            }

            public final int a() {
                return this.f40632a;
            }

            public final String b() {
                return this.f40633b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = d.f40607d;
            d.f40607d <<= 1;
            return i10;
        }

        public final int b() {
            return d.f40614k;
        }

        public final int c() {
            return d.f40615l;
        }

        public final int d() {
            return d.f40612i;
        }

        public final int e() {
            return d.f40608e;
        }

        public final int f() {
            return d.f40611h;
        }

        public final int g() {
            return d.f40609f;
        }

        public final int h() {
            return d.f40610g;
        }

        public final int i() {
            return d.f40613j;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a.C0607a c0607a;
        a.C0607a c0607a2;
        a aVar = new a(null);
        f40606c = aVar;
        f40607d = 1;
        int j10 = aVar.j();
        f40608e = j10;
        int j11 = aVar.j();
        f40609f = j11;
        int j12 = aVar.j();
        f40610g = j12;
        int j13 = aVar.j();
        f40611h = j13;
        int j14 = aVar.j();
        f40612i = j14;
        int j15 = aVar.j();
        f40613j = j15;
        int j16 = aVar.j() - 1;
        f40614k = j16;
        int i10 = j10 | j11 | j12;
        f40615l = i10;
        int i11 = j11 | j14 | j15;
        f40616m = i11;
        int i12 = j14 | j15;
        f40617n = i12;
        int i13 = 2;
        f40618o = new d(j16, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40619p = new d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40620q = new d(j10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40621r = new d(j11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40622s = new d(j12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40623t = new d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40624u = new d(j13, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40625v = new d(j14, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40626w = new d(j15, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f40627x = new d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = d.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i14 = dVar.f40631b;
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c0607a2 = new a.C0607a(i14, name);
            } else {
                c0607a2 = null;
            }
            if (c0607a2 != null) {
                arrayList2.add(c0607a2);
            }
        }
        f40628y = arrayList2;
        Field[] fields2 = d.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                c0607a = new a.C0607a(intValue, name2);
            } else {
                c0607a = null;
            }
            if (c0607a != null) {
                arrayList5.add(c0607a);
            }
        }
        f40629z = arrayList5;
    }

    public d(int i10, List excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f40630a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((c) it.next()).a();
        }
        this.f40631b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f40631b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return Intrinsics.b(this.f40630a, dVar.f40630a) && this.f40631b == dVar.f40631b;
    }

    public int hashCode() {
        return (this.f40630a.hashCode() * 31) + this.f40631b;
    }

    public final List l() {
        return this.f40630a;
    }

    public final int m() {
        return this.f40631b;
    }

    public final d n(int i10) {
        int i11 = i10 & this.f40631b;
        if (i11 == 0) {
            return null;
        }
        return new d(i11, this.f40630a);
    }

    public String toString() {
        Object obj;
        Iterator it = f40628y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C0607a) obj).a() == this.f40631b) {
                break;
            }
        }
        a.C0607a c0607a = (a.C0607a) obj;
        String b10 = c0607a != null ? c0607a.b() : null;
        if (b10 == null) {
            List<a.C0607a> list = f40629z;
            ArrayList arrayList = new ArrayList();
            for (a.C0607a c0607a2 : list) {
                String b11 = a(c0607a2.a()) ? c0607a2.b() : null;
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            b10 = CollectionsKt.l0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + b10 + ", " + this.f40630a + ')';
    }

    public /* synthetic */ d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? CollectionsKt.j() : list);
    }
}
