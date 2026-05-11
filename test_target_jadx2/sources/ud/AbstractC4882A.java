package ud;

import Kc.a0;
import dd.C3026c;
import id.C3367b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4882A {

    /* renamed from: a, reason: collision with root package name */
    private final fd.c f43616a;

    /* renamed from: b, reason: collision with root package name */
    private final fd.g f43617b;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f43618c;

    /* renamed from: ud.A$a */
    public static final class a extends AbstractC4882A {

        /* renamed from: d, reason: collision with root package name */
        private final C3026c f43619d;

        /* renamed from: e, reason: collision with root package name */
        private final a f43620e;

        /* renamed from: f, reason: collision with root package name */
        private final C3367b f43621f;

        /* renamed from: g, reason: collision with root package name */
        private final C3026c.EnumC0459c f43622g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f43623h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3026c classProto, fd.c nameResolver, fd.g typeTable, a0 a0Var, a aVar) {
            super(nameResolver, typeTable, a0Var, null);
            Intrinsics.checkNotNullParameter(classProto, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f43619d = classProto;
            this.f43620e = aVar;
            this.f43621f = y.a(nameResolver, classProto.C0());
            C3026c.EnumC0459c enumC0459c = (C3026c.EnumC0459c) fd.b.f33015f.d(classProto.B0());
            this.f43622g = enumC0459c == null ? C3026c.EnumC0459c.CLASS : enumC0459c;
            Boolean d10 = fd.b.f33016g.d(classProto.B0());
            Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
            this.f43623h = d10.booleanValue();
        }

        @Override // ud.AbstractC4882A
        public id.c a() {
            id.c b10 = this.f43621f.b();
            Intrinsics.checkNotNullExpressionValue(b10, "asSingleFqName(...)");
            return b10;
        }

        public final C3367b e() {
            return this.f43621f;
        }

        public final C3026c f() {
            return this.f43619d;
        }

        public final C3026c.EnumC0459c g() {
            return this.f43622g;
        }

        public final a h() {
            return this.f43620e;
        }

        public final boolean i() {
            return this.f43623h;
        }
    }

    /* renamed from: ud.A$b */
    public static final class b extends AbstractC4882A {

        /* renamed from: d, reason: collision with root package name */
        private final id.c f43624d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(id.c fqName, fd.c nameResolver, fd.g typeTable, a0 a0Var) {
            super(nameResolver, typeTable, a0Var, null);
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f43624d = fqName;
        }

        @Override // ud.AbstractC4882A
        public id.c a() {
            return this.f43624d;
        }
    }

    public /* synthetic */ AbstractC4882A(fd.c cVar, fd.g gVar, a0 a0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, gVar, a0Var);
    }

    public abstract id.c a();

    public final fd.c b() {
        return this.f43616a;
    }

    public final a0 c() {
        return this.f43618c;
    }

    public final fd.g d() {
        return this.f43617b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private AbstractC4882A(fd.c cVar, fd.g gVar, a0 a0Var) {
        this.f43616a = cVar;
        this.f43617b = gVar;
        this.f43618c = a0Var;
    }
}
