package xc;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.conscrypt.BuildConfig;
import vc.AbstractC5011a;

/* loaded from: classes3.dex */
public final class I implements kotlin.reflect.o {

    /* renamed from: e, reason: collision with root package name */
    public static final a f44969e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.e f44970a;

    /* renamed from: b, reason: collision with root package name */
    private final List f44971b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.o f44972c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44973d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44974a;

        static {
            int[] iArr = new int[kotlin.reflect.q.values().length];
            try {
                iArr[kotlin.reflect.q.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.q.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.q.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44974a = iArr;
        }
    }

    static final class c extends m implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(KTypeProjection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return I.this.n(it);
        }
    }

    public I(kotlin.reflect.e classifier, List arguments, kotlin.reflect.o oVar, int i10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f44970a = classifier;
        this.f44971b = arguments;
        this.f44972c = oVar;
        this.f44973d = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(KTypeProjection kTypeProjection) {
        String valueOf;
        if (kTypeProjection.d() == null) {
            return "*";
        }
        kotlin.reflect.o c10 = kTypeProjection.c();
        I i10 = c10 instanceof I ? (I) c10 : null;
        if (i10 == null || (valueOf = i10.r(true)) == null) {
            valueOf = String.valueOf(kTypeProjection.c());
        }
        int i11 = b.f44974a[kTypeProjection.d().ordinal()];
        if (i11 == 1) {
            return valueOf;
        }
        if (i11 == 2) {
            return "in " + valueOf;
        }
        if (i11 != 3) {
            throw new lc.m();
        }
        return "out " + valueOf;
    }

    private final String r(boolean z10) {
        String name;
        kotlin.reflect.e j10 = j();
        kotlin.reflect.d dVar = j10 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j10 : null;
        Class b10 = dVar != null ? AbstractC5011a.b(dVar) : null;
        if (b10 == null) {
            name = j().toString();
        } else if ((this.f44973d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (b10.isArray()) {
            name = t(b10);
        } else if (z10 && b10.isPrimitive()) {
            kotlin.reflect.e j11 = j();
            Intrinsics.e(j11, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC5011a.c((kotlin.reflect.d) j11).getName();
        } else {
            name = b10.getName();
        }
        boolean isEmpty = f().isEmpty();
        String str = BuildConfig.FLAVOR;
        String l02 = isEmpty ? BuildConfig.FLAVOR : CollectionsKt.l0(f(), ", ", "<", ">", 0, null, new c(), 24, null);
        if (p()) {
            str = "?";
        }
        String str2 = name + l02 + str;
        kotlin.reflect.o oVar = this.f44972c;
        if (!(oVar instanceof I)) {
            return str2;
        }
        String r10 = ((I) oVar).r(true);
        if (Intrinsics.b(r10, str2)) {
            return str2;
        }
        if (Intrinsics.b(r10, str2 + '?')) {
            return str2 + '!';
        }
        return '(' + str2 + ".." + r10 + ')';
    }

    private final String t(Class cls) {
        return Intrinsics.b(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.b(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.b(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.b(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.b(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.b(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.b(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.b(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean equals(Object obj) {
        if (obj instanceof I) {
            I i10 = (I) obj;
            if (Intrinsics.b(j(), i10.j()) && Intrinsics.b(f(), i10.f()) && Intrinsics.b(this.f44972c, i10.f44972c) && this.f44973d == i10.f44973d) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.o
    public List f() {
        return this.f44971b;
    }

    public int hashCode() {
        return (((j().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(this.f44973d);
    }

    @Override // kotlin.reflect.b
    public List i() {
        return CollectionsKt.j();
    }

    @Override // kotlin.reflect.o
    public kotlin.reflect.e j() {
        return this.f44970a;
    }

    @Override // kotlin.reflect.o
    public boolean p() {
        return (this.f44973d & 1) != 0;
    }

    public String toString() {
        return r(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(kotlin.reflect.e classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}
