package l2;

import java.util.Queue;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3601c {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f37013a = D2.l.g(20);

    AbstractC3601c() {
    }

    abstract m a();

    m b() {
        m mVar = (m) this.f37013a.poll();
        return mVar == null ? a() : mVar;
    }

    public void c(m mVar) {
        if (this.f37013a.size() < 20) {
            this.f37013a.offer(mVar);
        }
    }
}
