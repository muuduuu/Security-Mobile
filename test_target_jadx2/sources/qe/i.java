package qe;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import pe.S;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final S f38907a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38908b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38909c;

    /* renamed from: d, reason: collision with root package name */
    private final long f38910d;

    /* renamed from: e, reason: collision with root package name */
    private final long f38911e;

    /* renamed from: f, reason: collision with root package name */
    private final long f38912f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38913g;

    /* renamed from: h, reason: collision with root package name */
    private final long f38914h;

    /* renamed from: i, reason: collision with root package name */
    private final int f38915i;

    /* renamed from: j, reason: collision with root package name */
    private final int f38916j;

    /* renamed from: k, reason: collision with root package name */
    private final Long f38917k;

    /* renamed from: l, reason: collision with root package name */
    private final Long f38918l;

    /* renamed from: m, reason: collision with root package name */
    private final Long f38919m;

    /* renamed from: n, reason: collision with root package name */
    private final Integer f38920n;

    /* renamed from: o, reason: collision with root package name */
    private final Integer f38921o;

    /* renamed from: p, reason: collision with root package name */
    private final Integer f38922p;

    /* renamed from: q, reason: collision with root package name */
    private final List f38923q;

    public i(S canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f38907a = canonicalPath;
        this.f38908b = z10;
        this.f38909c = comment;
        this.f38910d = j10;
        this.f38911e = j11;
        this.f38912f = j12;
        this.f38913g = i10;
        this.f38914h = j13;
        this.f38915i = i11;
        this.f38916j = i12;
        this.f38917k = l10;
        this.f38918l = l11;
        this.f38919m = l12;
        this.f38920n = num;
        this.f38921o = num2;
        this.f38922p = num3;
        this.f38923q = new ArrayList();
    }

    public final i a(Integer num, Integer num2, Integer num3) {
        return new i(this.f38907a, this.f38908b, this.f38909c, this.f38910d, this.f38911e, this.f38912f, this.f38913g, this.f38914h, this.f38915i, this.f38916j, this.f38917k, this.f38918l, this.f38919m, num, num2, num3);
    }

    public final S b() {
        return this.f38907a;
    }

    public final List c() {
        return this.f38923q;
    }

    public final long d() {
        return this.f38911e;
    }

    public final int e() {
        return this.f38913g;
    }

    public final Long f() {
        Long l10 = this.f38919m;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        if (this.f38922p != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f38918l;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        if (this.f38921o != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f38917k;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        if (this.f38920n != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i10 = this.f38916j;
        if (i10 != -1) {
            return j.c(this.f38915i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f38914h;
    }

    public final long j() {
        return this.f38912f;
    }

    public final boolean k() {
        return this.f38908b;
    }

    public /* synthetic */ i(S s10, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? BuildConfig.FLAVOR : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) == 0 ? j13 : -1L, (i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? -1 : i11, (i13 & 512) == 0 ? i12 : -1, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, (i13 & 8192) != 0 ? null : num, (i13 & 16384) != 0 ? null : num2, (i13 & 32768) != 0 ? null : num3);
    }
}
