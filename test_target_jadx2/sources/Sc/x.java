package Sc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.AbstractC5156i;
import xc.C5142C;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final b f9070d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final x f9071e = new x(v.b(null, 1, null), a.f9075j);

    /* renamed from: a, reason: collision with root package name */
    private final z f9072a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f9073b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9074c;

    /* synthetic */ class a extends AbstractC5156i implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f9075j = new a();

        a() {
            super(1);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.d(v.class, "compiler.common.jvm");
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final G invoke(id.c p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return v.d(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            return x.f9071e;
        }

        private b() {
        }
    }

    public x(z jsr305, Function1 getReportLevelForAnnotation) {
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f9072a = jsr305;
        this.f9073b = getReportLevelForAnnotation;
        this.f9074c = jsr305.d() || getReportLevelForAnnotation.invoke(v.e()) == G.IGNORE;
    }

    public final boolean b() {
        return this.f9074c;
    }

    public final Function1 c() {
        return this.f9073b;
    }

    public final z d() {
        return this.f9072a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f9072a + ", getReportLevelForAnnotation=" + this.f9073b + ')';
    }
}
