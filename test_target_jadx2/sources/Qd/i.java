package Qd;

import Jd.S;

/* loaded from: classes3.dex */
final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f8336c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f8336c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8336c.run();
    }

    public String toString() {
        String c10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Task[");
        sb2.append(S.a(this.f8336c));
        sb2.append('@');
        sb2.append(S.b(this.f8336c));
        sb2.append(", ");
        sb2.append(this.f8334a);
        sb2.append(", ");
        c10 = j.c(this.f8335b);
        sb2.append(c10);
        sb2.append(']');
        return sb2.toString();
    }
}
