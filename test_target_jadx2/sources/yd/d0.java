package yd;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f45482a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45483b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45484c;

    /* renamed from: d, reason: collision with root package name */
    private final Ad.o f45485d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5205g f45486e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5206h f45487f;

    /* renamed from: g, reason: collision with root package name */
    private int f45488g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45489h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayDeque f45490i;

    /* renamed from: j, reason: collision with root package name */
    private Set f45491j;

    public interface a {

        /* renamed from: yd.d0$a$a, reason: collision with other inner class name */
        public static final class C0666a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f45492a;

            @Override // yd.d0.a
            public void a(Function0 block) {
                Intrinsics.checkNotNullParameter(block, "block");
                if (this.f45492a) {
                    return;
                }
                this.f45492a = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean b() {
                return this.f45492a;
            }
        }

        void a(Function0 function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CHECK_ONLY_LOWER = new b("CHECK_ONLY_LOWER", 0);
        public static final b CHECK_SUBTYPE_AND_LOWER = new b("CHECK_SUBTYPE_AND_LOWER", 1);
        public static final b SKIP_LOWER = new b("SKIP_LOWER", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{CHECK_ONLY_LOWER, CHECK_SUBTYPE_AND_LOWER, SKIP_LOWER};
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

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f45493a = new b();

            private b() {
                super(null);
            }

            @Override // yd.d0.c
            public Ad.j a(d0 state, Ad.i type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.j().V(type);
            }
        }

        /* renamed from: yd.d0$c$c, reason: collision with other inner class name */
        public static final class C0667c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0667c f45494a = new C0667c();

            private C0667c() {
                super(null);
            }

            @Override // yd.d0.c
            public /* bridge */ /* synthetic */ Ad.j a(d0 d0Var, Ad.i iVar) {
                return (Ad.j) b(d0Var, iVar);
            }

            public Void b(d0 state, Ad.i type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f45495a = new d();

            private d() {
                super(null);
            }

            @Override // yd.d0.c
            public Ad.j a(d0 state, Ad.i type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.j().t0(type);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Ad.j a(d0 d0Var, Ad.i iVar);

        private c() {
        }
    }

    public d0(boolean z10, boolean z11, boolean z12, Ad.o typeSystemContext, AbstractC5205g kotlinTypePreparator, AbstractC5206h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f45482a = z10;
        this.f45483b = z11;
        this.f45484c = z12;
        this.f45485d = typeSystemContext;
        this.f45486e = kotlinTypePreparator;
        this.f45487f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(d0 d0Var, Ad.i iVar, Ad.i iVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return d0Var.c(iVar, iVar2, z10);
    }

    public Boolean c(Ad.i subType, Ad.i superType, boolean z10) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f45490i;
        Intrinsics.d(arrayDeque);
        arrayDeque.clear();
        Set set = this.f45491j;
        Intrinsics.d(set);
        set.clear();
        this.f45489h = false;
    }

    public boolean f(Ad.i subType, Ad.i superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return true;
    }

    public b g(Ad.j subType, Ad.d superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque h() {
        return this.f45490i;
    }

    public final Set i() {
        return this.f45491j;
    }

    public final Ad.o j() {
        return this.f45485d;
    }

    public final void k() {
        this.f45489h = true;
        if (this.f45490i == null) {
            this.f45490i = new ArrayDeque(4);
        }
        if (this.f45491j == null) {
            this.f45491j = Gd.g.f3017c.a();
        }
    }

    public final boolean l(Ad.i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f45484c && this.f45485d.x0(type);
    }

    public final boolean m() {
        return this.f45482a;
    }

    public final boolean n() {
        return this.f45483b;
    }

    public final Ad.i o(Ad.i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f45486e.a(type);
    }

    public final Ad.i p(Ad.i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f45487f.a(type);
    }

    public boolean q(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        a.C0666a c0666a = new a.C0666a();
        block.invoke(c0666a);
        return c0666a.b();
    }
}
