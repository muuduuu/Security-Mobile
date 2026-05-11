package Ic;

import Ic.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4422c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final g f4423d = new g(CollectionsKt.m(f.a.f4418e, f.d.f4421e, f.b.f4419e, f.c.f4420e));

    /* renamed from: a, reason: collision with root package name */
    private final List f4424a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4425b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f4423d;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f4426a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4427b;

        public b(f kind, int i10) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.f4426a = kind;
            this.f4427b = i10;
        }

        public final f a() {
            return this.f4426a;
        }

        public final int b() {
            return this.f4427b;
        }

        public final f c() {
            return this.f4426a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f4426a, bVar.f4426a) && this.f4427b == bVar.f4427b;
        }

        public int hashCode() {
            return (this.f4426a.hashCode() * 31) + Integer.hashCode(this.f4427b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f4426a + ", arity=" + this.f4427b + ')';
        }
    }

    public g(List kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f4424a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            id.c b10 = ((f) obj).b();
            Object obj2 = linkedHashMap.get(b10);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(b10, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f4425b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int charAt = str.charAt(i11) - '0';
            if (charAt < 0 || charAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + charAt;
        }
        return Integer.valueOf(i10);
    }

    public final f b(id.c packageFqName, String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        b c10 = c(packageFqName, className);
        if (c10 != null) {
            return c10.c();
        }
        return null;
    }

    public final b c(id.c packageFqName, String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        List<f> list = (List) this.f4425b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (StringsKt.F(className, fVar.a(), false, 2, null)) {
                String substring = className.substring(fVar.a().length());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Integer d10 = d(substring);
                if (d10 != null) {
                    return new b(fVar, d10.intValue());
                }
            }
        }
        return null;
    }
}
