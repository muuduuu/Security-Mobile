package Sd;

import Od.A;
import Od.D;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class k extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f9113e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        int i11;
        i11 = j.f9112f;
        this.f9113e = new AtomicReferenceArray(i11);
    }

    @Override // Od.A
    public int r() {
        int i10;
        i10 = j.f9112f;
        return i10;
    }

    @Override // Od.A
    public void s(int i10, Throwable th, CoroutineContext coroutineContext) {
        D d10;
        d10 = j.f9111e;
        v().set(i10, d10);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f7300c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f9113e;
    }
}
