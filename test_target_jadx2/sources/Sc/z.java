package Sc;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final G f9077a;

    /* renamed from: b, reason: collision with root package name */
    private final G f9078b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f9079c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f9080d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9081e;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String[] invoke() {
            z zVar = z.this;
            List c10 = CollectionsKt.c();
            c10.add(zVar.a().getDescription());
            G b10 = zVar.b();
            if (b10 != null) {
                c10.add("under-migration:" + b10.getDescription());
            }
            for (Map.Entry entry : zVar.c().entrySet()) {
                c10.add('@' + entry.getKey() + ':' + ((G) entry.getValue()).getDescription());
            }
            return (String[]) CollectionsKt.a(c10).toArray(new String[0]);
        }
    }

    public z(G globalLevel, G g10, Map userDefinedLevelForSpecificAnnotation) {
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f9077a = globalLevel;
        this.f9078b = g10;
        this.f9079c = userDefinedLevelForSpecificAnnotation;
        this.f9080d = lc.i.a(new a());
        G g11 = G.IGNORE;
        this.f9081e = globalLevel == g11 && g10 == g11 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public final G a() {
        return this.f9077a;
    }

    public final G b() {
        return this.f9078b;
    }

    public final Map c() {
        return this.f9079c;
    }

    public final boolean d() {
        return this.f9081e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f9077a == zVar.f9077a && this.f9078b == zVar.f9078b && Intrinsics.b(this.f9079c, zVar.f9079c);
    }

    public int hashCode() {
        int hashCode = this.f9077a.hashCode() * 31;
        G g10 = this.f9078b;
        return ((hashCode + (g10 == null ? 0 : g10.hashCode())) * 31) + this.f9079c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f9077a + ", migrationLevel=" + this.f9078b + ", userDefinedLevelForSpecificAnnotation=" + this.f9079c + ')';
    }

    public /* synthetic */ z(G g10, G g11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g10, (i10 & 2) != 0 ? null : g11, (i10 & 4) != 0 ? kotlin.collections.G.h() : map);
    }
}
