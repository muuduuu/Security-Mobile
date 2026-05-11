package xd;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class d implements k {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f45003b;

    public d(Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f45003b = lock;
    }

    protected final Lock a() {
        return this.f45003b;
    }

    @Override // xd.k
    public void lock() {
        this.f45003b.lock();
    }

    @Override // xd.k
    public void unlock() {
        this.f45003b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
