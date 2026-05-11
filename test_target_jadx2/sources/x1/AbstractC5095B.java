package x1;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5095B {

    /* renamed from: d, reason: collision with root package name */
    public static final b f44664d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f44665a;

    /* renamed from: b, reason: collision with root package name */
    private final C1.u f44666b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f44667c;

    /* renamed from: x1.B$a */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f44668a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f44669b;

        /* renamed from: c, reason: collision with root package name */
        private UUID f44670c;

        /* renamed from: d, reason: collision with root package name */
        private C1.u f44671d;

        /* renamed from: e, reason: collision with root package name */
        private final Set f44672e;

        public a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.f44668a = workerClass;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.f44670c = randomUUID;
            String uuid = this.f44670c.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f44671d = new C1.u(uuid, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.f44672e = O.f(name2);
        }

        public final a a(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f44672e.add(tag);
            return g();
        }

        public final AbstractC5095B b() {
            AbstractC5095B c10 = c();
            C5100d c5100d = this.f44671d.f799j;
            boolean z10 = c5100d.e() || c5100d.f() || c5100d.g() || c5100d.h();
            C1.u uVar = this.f44671d;
            if (uVar.f806q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (uVar.f796g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            j(randomUUID);
            return c10;
        }

        public abstract AbstractC5095B c();

        public final boolean d() {
            return this.f44669b;
        }

        public final UUID e() {
            return this.f44670c;
        }

        public final Set f() {
            return this.f44672e;
        }

        public abstract a g();

        public final C1.u h() {
            return this.f44671d;
        }

        public final a i(C5100d constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f44671d.f799j = constraints;
            return g();
        }

        public final a j(UUID id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f44670c = id2;
            String uuid = id2.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.f44671d = new C1.u(uuid, this.f44671d);
            return g();
        }

        public a k(long j10, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f44671d.f796g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f44671d.f796g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a l(androidx.work.b inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f44671d.f794e = inputData;
            return g();
        }
    }

    /* renamed from: x1.B$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public AbstractC5095B(UUID id2, C1.u workSpec, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f44665a = id2;
        this.f44666b = workSpec;
        this.f44667c = tags;
    }

    public UUID a() {
        return this.f44665a;
    }

    public final String b() {
        String uuid = a().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.f44667c;
    }

    public final C1.u d() {
        return this.f44666b;
    }
}
