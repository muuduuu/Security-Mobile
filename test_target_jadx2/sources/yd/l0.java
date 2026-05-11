package yd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f45548a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f45549b = new a();

    public static final class a extends l0 {
        a() {
        }

        @Override // yd.l0
        public /* bridge */ /* synthetic */ i0 e(AbstractC5197E abstractC5197E) {
            return (i0) i(abstractC5197E);
        }

        @Override // yd.l0
        public boolean f() {
            return true;
        }

        public Void i(AbstractC5197E key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends l0 {
        c() {
        }

        @Override // yd.l0
        public boolean a() {
            return false;
        }

        @Override // yd.l0
        public boolean b() {
            return false;
        }

        @Override // yd.l0
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return l0.this.d(annotations);
        }

        @Override // yd.l0
        public i0 e(AbstractC5197E key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return l0.this.e(key);
        }

        @Override // yd.l0
        public boolean f() {
            return l0.this.f();
        }

        @Override // yd.l0
        public AbstractC5197E g(AbstractC5197E topLevelType, u0 position) {
            Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
            Intrinsics.checkNotNullParameter(position, "position");
            return l0.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final n0 c() {
        n0 g10 = n0.g(this);
        Intrinsics.checkNotNullExpressionValue(g10, "create(...)");
        return g10;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    public abstract i0 e(AbstractC5197E abstractC5197E);

    public boolean f() {
        return false;
    }

    public AbstractC5197E g(AbstractC5197E topLevelType, u0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }

    public final l0 h() {
        return new c();
    }
}
