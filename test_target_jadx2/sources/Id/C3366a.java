package id;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: id.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3366a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0508a f34168e = new C0508a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final f f34169f;

    /* renamed from: g, reason: collision with root package name */
    private static final c f34170g;

    /* renamed from: a, reason: collision with root package name */
    private final c f34171a;

    /* renamed from: b, reason: collision with root package name */
    private final c f34172b;

    /* renamed from: c, reason: collision with root package name */
    private final f f34173c;

    /* renamed from: d, reason: collision with root package name */
    private final c f34174d;

    /* renamed from: id.a$a, reason: collision with other inner class name */
    public static final class C0508a {
        public /* synthetic */ C0508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0508a() {
        }
    }

    static {
        f fVar = h.f34205l;
        f34169f = fVar;
        c k10 = c.k(fVar);
        Intrinsics.checkNotNullExpressionValue(k10, "topLevel(...)");
        f34170g = k10;
    }

    public C3366a(c packageName, c cVar, f callableName, c cVar2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f34171a = packageName;
        this.f34172b = cVar;
        this.f34173c = callableName;
        this.f34174d = cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3366a)) {
            return false;
        }
        C3366a c3366a = (C3366a) obj;
        return Intrinsics.b(this.f34171a, c3366a.f34171a) && Intrinsics.b(this.f34172b, c3366a.f34172b) && Intrinsics.b(this.f34173c, c3366a.f34173c) && Intrinsics.b(this.f34174d, c3366a.f34174d);
    }

    public int hashCode() {
        int hashCode = this.f34171a.hashCode() * 31;
        c cVar = this.f34172b;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f34173c.hashCode()) * 31;
        c cVar2 = this.f34174d;
        return hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String b10 = this.f34171a.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        sb2.append(StringsKt.y(b10, '.', '/', false, 4, null));
        sb2.append("/");
        c cVar = this.f34172b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f34173c);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ C3366a(c cVar, c cVar2, f fVar, c cVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, fVar, (i10 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3366a(c packageName, f callableName) {
        this(packageName, null, callableName, null, 8, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
    }
}
