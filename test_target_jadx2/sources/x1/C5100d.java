package x1;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5100d {

    /* renamed from: i, reason: collision with root package name */
    public static final b f44677i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final C5100d f44678j = new C5100d(null, false, false, false, 15, null);

    /* renamed from: a, reason: collision with root package name */
    private final o f44679a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44680b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44681c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44682d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f44683e;

    /* renamed from: f, reason: collision with root package name */
    private final long f44684f;

    /* renamed from: g, reason: collision with root package name */
    private final long f44685g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f44686h;

    /* renamed from: x1.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f44687a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f44688b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f44690d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f44691e;

        /* renamed from: c, reason: collision with root package name */
        private o f44689c = o.NOT_REQUIRED;

        /* renamed from: f, reason: collision with root package name */
        private long f44692f = -1;

        /* renamed from: g, reason: collision with root package name */
        private long f44693g = -1;

        /* renamed from: h, reason: collision with root package name */
        private Set f44694h = new LinkedHashSet();

        public final C5100d a() {
            Set S02 = CollectionsKt.S0(this.f44694h);
            long j10 = this.f44692f;
            long j11 = this.f44693g;
            return new C5100d(this.f44689c, this.f44687a, this.f44688b, this.f44690d, this.f44691e, j10, j11, S02);
        }

        public final a b(o networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.f44689c = networkType;
            return this;
        }
    }

    /* renamed from: x1.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: x1.d$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f44695a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f44696b;

        public c(Uri uri, boolean z10) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f44695a = uri;
            this.f44696b = z10;
        }

        public final Uri a() {
            return this.f44695a;
        }

        public final boolean b() {
            return this.f44696b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.b(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.e(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return Intrinsics.b(this.f44695a, cVar.f44695a) && this.f44696b == cVar.f44696b;
        }

        public int hashCode() {
            return (this.f44695a.hashCode() * 31) + Boolean.hashCode(this.f44696b);
        }
    }

    public /* synthetic */ C5100d(o oVar, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? o.NOT_REQUIRED : oVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    public final long a() {
        return this.f44685g;
    }

    public final long b() {
        return this.f44684f;
    }

    public final Set c() {
        return this.f44686h;
    }

    public final o d() {
        return this.f44679a;
    }

    public final boolean e() {
        return !this.f44686h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.b(C5100d.class, obj.getClass())) {
            return false;
        }
        C5100d c5100d = (C5100d) obj;
        if (this.f44680b == c5100d.f44680b && this.f44681c == c5100d.f44681c && this.f44682d == c5100d.f44682d && this.f44683e == c5100d.f44683e && this.f44684f == c5100d.f44684f && this.f44685g == c5100d.f44685g && this.f44679a == c5100d.f44679a) {
            return Intrinsics.b(this.f44686h, c5100d.f44686h);
        }
        return false;
    }

    public final boolean f() {
        return this.f44682d;
    }

    public final boolean g() {
        return this.f44680b;
    }

    public final boolean h() {
        return this.f44681c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f44679a.hashCode() * 31) + (this.f44680b ? 1 : 0)) * 31) + (this.f44681c ? 1 : 0)) * 31) + (this.f44682d ? 1 : 0)) * 31) + (this.f44683e ? 1 : 0)) * 31;
        long j10 = this.f44684f;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f44685g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f44686h.hashCode();
    }

    public final boolean i() {
        return this.f44683e;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f44679a + ", requiresCharging=" + this.f44680b + ", requiresDeviceIdle=" + this.f44681c + ", requiresBatteryNotLow=" + this.f44682d + ", requiresStorageNotLow=" + this.f44683e + ", contentTriggerUpdateDelayMillis=" + this.f44684f + ", contentTriggerMaxDelayMillis=" + this.f44685g + ", contentUriTriggers=" + this.f44686h + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5100d(o requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5100d(o requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, 192, null);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ C5100d(o oVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? o.NOT_REQUIRED : oVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) == 0 ? z13 : false, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) == 0 ? j11 : -1L, (i10 & 128) != 0 ? O.d() : set);
    }

    public C5100d(o requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f44679a = requiredNetworkType;
        this.f44680b = z10;
        this.f44681c = z11;
        this.f44682d = z12;
        this.f44683e = z13;
        this.f44684f = j10;
        this.f44685g = j11;
        this.f44686h = contentUriTriggers;
    }

    public C5100d(C5100d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f44680b = other.f44680b;
        this.f44681c = other.f44681c;
        this.f44679a = other.f44679a;
        this.f44682d = other.f44682d;
        this.f44683e = other.f44683e;
        this.f44686h = other.f44686h;
        this.f44684f = other.f44684f;
        this.f44685g = other.f44685g;
    }
}
