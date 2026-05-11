package Bc;

import java.util.NoSuchElementException;
import kotlin.collections.E;

/* loaded from: classes3.dex */
public final class b extends E {

    /* renamed from: a, reason: collision with root package name */
    private final long f572a;

    /* renamed from: b, reason: collision with root package name */
    private final long f573b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f574c;

    /* renamed from: d, reason: collision with root package name */
    private long f575d;

    public b(long j10, long j11, long j12) {
        this.f572a = j12;
        this.f573b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f574c = z10;
        this.f575d = z10 ? j10 : j11;
    }

    @Override // kotlin.collections.E
    public long a() {
        long j10 = this.f575d;
        if (j10 != this.f573b) {
            this.f575d = this.f572a + j10;
        } else {
            if (!this.f574c) {
                throw new NoSuchElementException();
            }
            this.f574c = false;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f574c;
    }
}
