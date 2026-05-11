package L2;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.N;
import Jd.O;
import Q2.s;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    private static final a f5672d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static long f5673e;

    /* renamed from: a, reason: collision with root package name */
    private final long f5674a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5675b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f5676c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        ONE_HOUR,
        ONE_DAY,
        ONE_WEEK,
        FOREVER
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5677a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.ONE_HOUR.ordinal()] = 1;
            iArr[b.ONE_DAY.ordinal()] = 2;
            iArr[b.ONE_WEEK.ordinal()] = 3;
            iArr[b.FOREVER.ordinal()] = 4;
            f5677a = iArr;
        }
    }

    static final class d extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f5678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f5679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f5679b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new d(this.f5679b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f5678a;
            if (i10 == 0) {
                p.b(obj);
                O2.b c10 = O2.e.f7006a.c();
                long j10 = this.f5679b;
                this.f5678a = 1;
                if (c10.c(j10, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.f36324a;
                }
                p.b(obj);
            }
            O2.d b10 = O2.e.f7006a.b();
            long j11 = this.f5679b;
            this.f5678a = 2;
            if (b10.c(j11, this) == e10) {
                return e10;
            }
            return Unit.f36324a;
        }
    }

    public e(Context context, b retentionPeriod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(retentionPeriod, "retentionPeriod");
        this.f5674a = f(retentionPeriod);
        SharedPreferences sharedPreferences = context.getSharedPreferences("chucker_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(PREFS_NAME, 0)");
        this.f5676c = sharedPreferences;
        this.f5675b = retentionPeriod == b.ONE_HOUR ? TimeUnit.MINUTES.toMillis(30L) : TimeUnit.HOURS.toMillis(2L);
    }

    private final void a(long j10) {
        AbstractC0891k.d(O.a(C0874b0.b()), null, null, new d(j10, null), 3, null);
    }

    private final long c(long j10) {
        if (f5673e == 0) {
            f5673e = this.f5676c.getLong("last_cleanup", j10);
        }
        return f5673e;
    }

    private final long d(long j10) {
        long j11 = this.f5674a;
        return j11 == 0 ? j10 : j10 - j11;
    }

    private final boolean e(long j10) {
        return j10 - c(j10) > this.f5675b;
    }

    private final long f(b bVar) {
        int i10 = c.f5677a[bVar.ordinal()];
        if (i10 == 1) {
            return TimeUnit.HOURS.toMillis(1L);
        }
        if (i10 == 2) {
            return TimeUnit.DAYS.toMillis(1L);
        }
        if (i10 == 3) {
            return TimeUnit.DAYS.toMillis(7L);
        }
        if (i10 == 4) {
            return 0L;
        }
        throw new m();
    }

    private final void g(long j10) {
        f5673e = j10;
        this.f5676c.edit().putLong("last_cleanup", j10).apply();
    }

    public final synchronized void b() {
        if (this.f5674a > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (e(currentTimeMillis)) {
                s.f8124a.a("Performing data retention maintenance...");
                a(d(currentTimeMillis));
                g(currentTimeMillis);
            }
        }
    }
}
