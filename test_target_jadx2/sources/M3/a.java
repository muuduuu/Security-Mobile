package M3;

import D3.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0119a f6068c = new C0119a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f6069a;

    /* renamed from: b, reason: collision with root package name */
    private long f6070b;

    /* renamed from: M3.a$a, reason: collision with other inner class name */
    public static final class C0119a {
        public /* synthetic */ C0119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0119a() {
        }
    }

    public a(d animationInformation) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f6069a = animationInformation;
        this.f6070b = -1L;
    }

    @Override // M3.b
    public long a(long j10) {
        long d10 = d();
        long j11 = 0;
        if (d10 == 0) {
            return -1L;
        }
        if (!e() && j10 / d10 >= this.f6069a.b()) {
            return -1L;
        }
        long j12 = j10 % d10;
        int a10 = this.f6069a.a();
        for (int i10 = 0; i10 < a10 && j11 <= j12; i10++) {
            j11 += this.f6069a.k(i10);
        }
        return j10 + (j11 - j12);
    }

    @Override // M3.b
    public int b(long j10, long j11) {
        long d10 = d();
        if (d10 == 0) {
            return c(0L);
        }
        if (e() || j10 / d10 < this.f6069a.b()) {
            return c(j10 % d10);
        }
        return -1;
    }

    public final int c(long j10) {
        int i10 = 0;
        long j11 = 0;
        while (true) {
            j11 += this.f6069a.k(i10);
            int i11 = i10 + 1;
            if (j10 < j11) {
                return i10;
            }
            i10 = i11;
        }
    }

    public long d() {
        long j10 = this.f6070b;
        if (j10 != -1) {
            return j10;
        }
        this.f6070b = 0L;
        int a10 = this.f6069a.a();
        for (int i10 = 0; i10 < a10; i10++) {
            this.f6070b += this.f6069a.k(i10);
        }
        return this.f6070b;
    }

    public boolean e() {
        return this.f6069a.b() == 0;
    }
}
