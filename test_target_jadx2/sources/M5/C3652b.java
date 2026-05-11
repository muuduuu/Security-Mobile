package m5;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3652b {

    /* renamed from: f, reason: collision with root package name */
    private static final a f37378f = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private float f37381c;

    /* renamed from: d, reason: collision with root package name */
    private float f37382d;

    /* renamed from: a, reason: collision with root package name */
    private int f37379a = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private int f37380b = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private long f37383e = -11;

    /* renamed from: m5.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final float a() {
        return this.f37381c;
    }

    public final float b() {
        return this.f37382d;
    }

    public final boolean c(int i10, int i11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f37383e;
        boolean z10 = (uptimeMillis - j10 <= 10 && this.f37379a == i10 && this.f37380b == i11) ? false : true;
        if (uptimeMillis - j10 != 0) {
            this.f37381c = (i10 - this.f37379a) / (uptimeMillis - j10);
            this.f37382d = (i11 - this.f37380b) / (uptimeMillis - j10);
        }
        this.f37383e = uptimeMillis;
        this.f37379a = i10;
        this.f37380b = i11;
        return z10;
    }
}
