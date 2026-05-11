package yd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5217t extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f45565e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final l0 f45566c;

    /* renamed from: d, reason: collision with root package name */
    private final l0 f45567d;

    /* renamed from: yd.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 a(l0 first, l0 second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            return first.f() ? second : second.f() ? first : new C5217t(first, second, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C5217t(l0 l0Var, l0 l0Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l0Var, l0Var2);
    }

    public static final l0 i(l0 l0Var, l0 l0Var2) {
        return f45565e.a(l0Var, l0Var2);
    }

    @Override // yd.l0
    public boolean a() {
        return this.f45566c.a() || this.f45567d.a();
    }

    @Override // yd.l0
    public boolean b() {
        return this.f45566c.b() || this.f45567d.b();
    }

    @Override // yd.l0
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f45567d.d(this.f45566c.d(annotations));
    }

    @Override // yd.l0
    public i0 e(AbstractC5197E key) {
        Intrinsics.checkNotNullParameter(key, "key");
        i0 e10 = this.f45566c.e(key);
        return e10 == null ? this.f45567d.e(key) : e10;
    }

    @Override // yd.l0
    public boolean f() {
        return false;
    }

    @Override // yd.l0
    public AbstractC5197E g(AbstractC5197E topLevelType, u0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f45567d.g(this.f45566c.g(topLevelType, position), position);
    }

    private C5217t(l0 l0Var, l0 l0Var2) {
        this.f45566c = l0Var;
        this.f45567d = l0Var2;
    }
}
