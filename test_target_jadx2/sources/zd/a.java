package Zd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f12510a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12511b;

    /* renamed from: c, reason: collision with root package name */
    private c f12512c;

    /* renamed from: d, reason: collision with root package name */
    private long f12513d;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f12510a = name;
        this.f12511b = z10;
        this.f12513d = -1L;
    }

    public final boolean a() {
        return this.f12511b;
    }

    public final String b() {
        return this.f12510a;
    }

    public final long c() {
        return this.f12513d;
    }

    public final c d() {
        return this.f12512c;
    }

    public final void e(c queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        c cVar = this.f12512c;
        if (cVar == queue) {
            return;
        }
        if (cVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f12512c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f12513d = j10;
    }

    public String toString() {
        return this.f12510a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
