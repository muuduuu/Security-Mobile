package x1;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: m, reason: collision with root package name */
    public static final a f44716m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f44717a;

    /* renamed from: b, reason: collision with root package name */
    private final c f44718b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f44719c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.b f44720d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.work.b f44721e;

    /* renamed from: f, reason: collision with root package name */
    private final int f44722f;

    /* renamed from: g, reason: collision with root package name */
    private final int f44723g;

    /* renamed from: h, reason: collision with root package name */
    private final C5100d f44724h;

    /* renamed from: i, reason: collision with root package name */
    private final long f44725i;

    /* renamed from: j, reason: collision with root package name */
    private final b f44726j;

    /* renamed from: k, reason: collision with root package name */
    private final long f44727k;

    /* renamed from: l, reason: collision with root package name */
    private final int f44728l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f44729a;

        /* renamed from: b, reason: collision with root package name */
        private final long f44730b;

        public b(long j10, long j11) {
            this.f44729a = j10;
            this.f44730b = j11;
        }

        public final long a() {
            return this.f44729a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.b(b.class, obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f44729a == this.f44729a && bVar.f44730b == this.f44730b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f44729a) * 31) + Long.hashCode(this.f44730b);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f44729a + ", flexIntervalMillis=" + this.f44730b + '}';
        }
    }

    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public z(UUID id2, c state, Set tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, C5100d constraints, long j10, b bVar, long j11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f44717a = id2;
        this.f44718b = state;
        this.f44719c = tags;
        this.f44720d = outputData;
        this.f44721e = progress;
        this.f44722f = i10;
        this.f44723g = i11;
        this.f44724h = constraints;
        this.f44725i = j10;
        this.f44726j = bVar;
        this.f44727k = j11;
        this.f44728l = i12;
    }

    public final b a() {
        return this.f44726j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.b(z.class, obj.getClass())) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f44722f == zVar.f44722f && this.f44723g == zVar.f44723g && Intrinsics.b(this.f44717a, zVar.f44717a) && this.f44718b == zVar.f44718b && Intrinsics.b(this.f44720d, zVar.f44720d) && Intrinsics.b(this.f44724h, zVar.f44724h) && this.f44725i == zVar.f44725i && Intrinsics.b(this.f44726j, zVar.f44726j) && this.f44727k == zVar.f44727k && this.f44728l == zVar.f44728l && Intrinsics.b(this.f44719c, zVar.f44719c)) {
            return Intrinsics.b(this.f44721e, zVar.f44721e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f44717a.hashCode() * 31) + this.f44718b.hashCode()) * 31) + this.f44720d.hashCode()) * 31) + this.f44719c.hashCode()) * 31) + this.f44721e.hashCode()) * 31) + this.f44722f) * 31) + this.f44723g) * 31) + this.f44724h.hashCode()) * 31) + Long.hashCode(this.f44725i)) * 31;
        b bVar = this.f44726j;
        return ((((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.f44727k)) * 31) + Integer.hashCode(this.f44728l);
    }

    public String toString() {
        return "WorkInfo{id='" + this.f44717a + "', state=" + this.f44718b + ", outputData=" + this.f44720d + ", tags=" + this.f44719c + ", progress=" + this.f44721e + ", runAttemptCount=" + this.f44722f + ", generation=" + this.f44723g + ", constraints=" + this.f44724h + ", initialDelayMillis=" + this.f44725i + ", periodicityInfo=" + this.f44726j + ", nextScheduleTimeMillis=" + this.f44727k + "}, stopReason=" + this.f44728l;
    }
}
