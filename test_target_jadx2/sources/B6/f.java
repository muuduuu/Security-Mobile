package B6;

import B6.c;
import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import s6.EnumC4319e;

/* loaded from: classes2.dex */
public abstract class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private E6.a f461a;

        /* renamed from: b, reason: collision with root package name */
        private Map f462b = new HashMap();

        public a a(EnumC4319e enumC4319e, b bVar) {
            this.f462b.put(enumC4319e, bVar);
            return this;
        }

        public f b() {
            if (this.f461a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f462b.keySet().size() < EnumC4319e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f462b;
            this.f462b = new HashMap();
            return f.d(this.f461a, map);
        }

        public a c(E6.a aVar) {
            this.f461a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(E6.a aVar, Map map) {
        return new B6.b(aVar, map);
    }

    public static f f(E6.a aVar) {
        return b().a(EnumC4319e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(EnumC4319e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC4319e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC4319e enumC4319e, long j10, int i10) {
        builder.setMinimumLatency(g(enumC4319e, j10, i10));
        j(builder, ((b) h().get(enumC4319e)).c());
        return builder;
    }

    abstract E6.a e();

    public long g(EnumC4319e enumC4319e, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = (b) h().get(enumC4319e);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    abstract Map h();
}
