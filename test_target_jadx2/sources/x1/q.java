package x1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC5095B;

/* loaded from: classes.dex */
public final class q extends AbstractC5095B {

    /* renamed from: e, reason: collision with root package name */
    public static final b f44710e = new b(null);

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return (q) new a(workerClass).b();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public static final q e(Class cls) {
        return f44710e.a(cls);
    }

    public static final class a extends AbstractC5095B.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // x1.AbstractC5095B.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public q c() {
            if (d() && h().f799j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new q(this);
        }

        @Override // x1.AbstractC5095B.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }
}
