package x1;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC5095B;

/* loaded from: classes.dex */
public final class t extends AbstractC5095B {

    /* renamed from: e, reason: collision with root package name */
    public static final b f44714e = new b(null);

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public static final class a extends AbstractC5095B.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass, long j10, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            h().p(repeatIntervalTimeUnit.toMillis(j10));
        }

        @Override // x1.AbstractC5095B.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public t c() {
            if (d() && h().f799j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (h().f806q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new t(this);
        }

        @Override // x1.AbstractC5095B.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }
}
