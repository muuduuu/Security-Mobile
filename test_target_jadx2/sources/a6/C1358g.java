package a6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1358g extends AbstractC1355d {

    /* renamed from: j, reason: collision with root package name */
    private final C1360i f12626j;

    public C1358g(boolean z10, C1360i c1360i) {
        this.f12612a = z10;
        this.f12626j = c1360i;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f12613b = c1360i.f(allocate, 16L);
        this.f12614c = c1360i.j(allocate, 28L);
        this.f12615d = c1360i.j(allocate, 32L);
        this.f12616e = c1360i.f(allocate, 42L);
        this.f12617f = c1360i.f(allocate, 44L);
        this.f12618g = c1360i.f(allocate, 46L);
        this.f12619h = c1360i.f(allocate, 48L);
        this.f12620i = c1360i.f(allocate, 50L);
    }

    @Override // a6.AbstractC1355d
    public AbstractC1354c a(long j10, int i10) {
        return new C1352a(this.f12626j, this, j10, i10);
    }

    @Override // a6.AbstractC1355d
    public AbstractC1356e b(long j10) {
        return new j(this.f12626j, this, j10);
    }

    @Override // a6.AbstractC1355d
    public AbstractC1357f c(int i10) {
        return new l(this.f12626j, this, i10);
    }
}
