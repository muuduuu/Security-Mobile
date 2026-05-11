package v9;

import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0002\u001d\"Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b)\u0010\u0018R\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b&\u0010\u0018¨\u0006."}, d2 = {"Lv9/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "flushInterval", "Ljava/util/HashMap;", "Lv9/g;", "Lv9/e$b;", "Lkotlin/collections/HashMap;", "syncConfig", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "blacklist", "connectionTimeout", "readTimeout", "base", "capInMinutes", "<init>", "(ILjava/util/HashMap;Ljava/util/List;IIII)V", "serviceName", "e", "(Lv9/g;)Lv9/e$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", C4870a.f43493a, "I", "d", "setFlushInterval$gobbler_release", "(I)V", "b", "Ljava/util/HashMap;", "getSyncConfig$gobbler_release", "()Ljava/util/HashMap;", "c", "Ljava/util/List;", "()Ljava/util/List;", "getConnectionTimeout$gobbler_release", "getReadTimeout$gobbler_release", "f", "g", "h", "gobbler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v9.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class GobblerConfig {

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap f44038i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("flushInterval")
    private int flushInterval;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("syncConfig")
    private final HashMap<g, Sync> syncConfig;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("blacklist")
    private final List<String> blacklist;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("connectionTimeout")
    private final int connectionTimeout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("readTimeout")
    private final int readTimeout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("base")
    private final int base;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @O8.c("cap")
    private final int capInMinutes;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lv9/e$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "triggerLimit", "flushBatchSize", "<init>", "(II)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", C4870a.f43493a, "I", "b", "gobbler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v9.e$b, reason: from toString */
    public static final /* data */ class Sync {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @O8.c("triggerLimit")
        private final int triggerLimit;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @O8.c("flushBatchSize")
        private final int flushBatchSize;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Sync() {
            this(r2, r2, 3, null);
            int i10 = 0;
        }

        /* renamed from: a, reason: from getter */
        public final int getFlushBatchSize() {
            return this.flushBatchSize;
        }

        /* renamed from: b, reason: from getter */
        public final int getTriggerLimit() {
            return this.triggerLimit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sync)) {
                return false;
            }
            Sync sync = (Sync) other;
            return this.triggerLimit == sync.triggerLimit && this.flushBatchSize == sync.flushBatchSize;
        }

        public int hashCode() {
            return (Integer.hashCode(this.triggerLimit) * 31) + Integer.hashCode(this.flushBatchSize);
        }

        public String toString() {
            return "Sync(triggerLimit=" + this.triggerLimit + ", flushBatchSize=" + this.flushBatchSize + ")";
        }

        public Sync(int i10, int i11) {
            this.triggerLimit = i10;
            this.flushBatchSize = i11;
        }

        public /* synthetic */ Sync(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 10 : i10, (i12 & 2) != 0 ? 25 : i11);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i10 = 0;
        f44038i = G.j(t.a(g.EVENTS, new Sync(i10, i10, 3, defaultConstructorMarker)), t.a(g.LOGS, new Sync(20, i10, 2, defaultConstructorMarker)));
    }

    public GobblerConfig() {
        this(0, null, null, 0, 0, 0, 0, 127, null);
    }

    /* renamed from: a, reason: from getter */
    public final int getBase() {
        return this.base;
    }

    /* renamed from: b, reason: from getter */
    public final List getBlacklist() {
        return this.blacklist;
    }

    /* renamed from: c, reason: from getter */
    public final int getCapInMinutes() {
        return this.capInMinutes;
    }

    /* renamed from: d, reason: from getter */
    public final int getFlushInterval() {
        return this.flushInterval;
    }

    public final Sync e(g serviceName) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Sync sync = this.syncConfig.get(serviceName);
        if (sync != null) {
            return sync;
        }
        Object obj = f44038i.get(serviceName);
        Intrinsics.d(obj);
        return (Sync) obj;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GobblerConfig)) {
            return false;
        }
        GobblerConfig gobblerConfig = (GobblerConfig) other;
        return this.flushInterval == gobblerConfig.flushInterval && Intrinsics.b(this.syncConfig, gobblerConfig.syncConfig) && Intrinsics.b(this.blacklist, gobblerConfig.blacklist) && this.connectionTimeout == gobblerConfig.connectionTimeout && this.readTimeout == gobblerConfig.readTimeout && this.base == gobblerConfig.base && this.capInMinutes == gobblerConfig.capInMinutes;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.flushInterval) * 31) + this.syncConfig.hashCode()) * 31) + this.blacklist.hashCode()) * 31) + Integer.hashCode(this.connectionTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.base)) * 31) + Integer.hashCode(this.capInMinutes);
    }

    public String toString() {
        return "GobblerConfig(flushInterval=" + this.flushInterval + ", syncConfig=" + this.syncConfig + ", blacklist=" + this.blacklist + ", connectionTimeout=" + this.connectionTimeout + ", readTimeout=" + this.readTimeout + ", base=" + this.base + ", capInMinutes=" + this.capInMinutes + ")";
    }

    public GobblerConfig(int i10, HashMap syncConfig, List blacklist, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(syncConfig, "syncConfig");
        Intrinsics.checkNotNullParameter(blacklist, "blacklist");
        this.flushInterval = i10;
        this.syncConfig = syncConfig;
        this.blacklist = blacklist;
        this.connectionTimeout = i11;
        this.readTimeout = i12;
        this.base = i13;
        this.capInMinutes = i14;
        this.flushInterval = i10 < 60 ? 60 : i10;
        g gVar = g.EVENTS;
        if (!syncConfig.containsKey(gVar)) {
            Object obj = f44038i.get(gVar);
            Intrinsics.d(obj);
            syncConfig.put(gVar, obj);
        }
        g gVar2 = g.LOGS;
        if (syncConfig.containsKey(gVar2)) {
            return;
        }
        Object obj2 = f44038i.get(gVar2);
        Intrinsics.d(obj2);
        syncConfig.put(gVar2, obj2);
    }

    public /* synthetic */ GobblerConfig(int i10, HashMap hashMap, List list, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 720 : i10, (i15 & 2) != 0 ? f44038i : hashMap, (i15 & 4) != 0 ? CollectionsKt.j() : list, (i15 & 8) != 0 ? 4500 : i11, (i15 & 16) != 0 ? 6000 : i12, (i15 & 32) != 0 ? 300 : i13, (i15 & 64) != 0 ? 30 : i14);
    }
}
