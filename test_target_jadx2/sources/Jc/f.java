package Jc;

import Kc.G;
import Mc.x;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;
import xc.C5142C;
import xc.u;
import xd.n;

/* loaded from: classes3.dex */
public final class f extends Hc.g {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f4922k = {C5142C.k(new u(C5142C.b(f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h, reason: collision with root package name */
    private final a f4923h;

    /* renamed from: i, reason: collision with root package name */
    private Function0 f4924i;

    /* renamed from: j, reason: collision with root package name */
    private final xd.i f4925j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FROM_DEPENDENCIES = new a("FROM_DEPENDENCIES", 0);
        public static final a FROM_CLASS_LOADER = new a("FROM_CLASS_LOADER", 1);
        public static final a FALLBACK = new a("FALLBACK", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final G f4926a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f4927b;

        public b(G ownerModuleDescriptor, boolean z10) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f4926a = ownerModuleDescriptor;
            this.f4927b = z10;
        }

        public final G a() {
            return this.f4926a;
        }

        public final boolean b() {
            return this.f4927b;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4928a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4928a = iArr;
        }
    }

    static final class d extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f4930b;

        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f4931a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f4931a = fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke() {
                Function0 function0 = this.f4931a.f4924i;
                if (function0 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                b bVar = (b) function0.invoke();
                this.f4931a.f4924i = null;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.f4930b = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            x r10 = f.this.r();
            Intrinsics.checkNotNullExpressionValue(r10, "getBuiltInsModule(...)");
            return new i(r10, this.f4930b, new a(f.this));
        }
    }

    static final class e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f4932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4933b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(G g10, boolean z10) {
            super(0);
            this.f4932a = g10;
            this.f4933b = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(this.f4932a, this.f4933b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n storageManager, a kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f4923h = kind;
        this.f4925j = storageManager.d(new d(storageManager));
        int i10 = c.f4928a[kind.ordinal()];
        if (i10 == 2) {
            f(false);
        } else {
            if (i10 != 3) {
                return;
            }
            f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hc.g
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public List v() {
        Iterable v10 = super.v();
        Intrinsics.checkNotNullExpressionValue(v10, "getClassDescriptorFactories(...)");
        n U10 = U();
        Intrinsics.checkNotNullExpressionValue(U10, "getStorageManager(...)");
        x r10 = r();
        Intrinsics.checkNotNullExpressionValue(r10, "getBuiltInsModule(...)");
        return CollectionsKt.v0(v10, new Jc.e(U10, r10, null, 4, null));
    }

    public final i I0() {
        return (i) xd.m.a(this.f4925j, this, f4922k[0]);
    }

    public final void J0(G moduleDescriptor, boolean z10) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        K0(new e(moduleDescriptor, z10));
    }

    public final void K0(Function0 computation) {
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f4924i = computation;
    }

    @Override // Hc.g
    protected Lc.c M() {
        return I0();
    }

    @Override // Hc.g
    protected Lc.a g() {
        return I0();
    }
}
