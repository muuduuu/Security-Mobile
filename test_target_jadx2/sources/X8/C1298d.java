package X8;

import java.util.concurrent.Executor;

/* renamed from: X8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1298d {

    /* renamed from: a, reason: collision with root package name */
    private final A8.b f11785a;

    public C1298d(A8.b bVar) {
        this.f11785a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f11785a.get();
    }
}
