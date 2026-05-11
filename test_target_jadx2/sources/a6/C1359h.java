package a6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1359h extends AbstractC1355d {

    /* renamed from: j, reason: collision with root package name */
    private final C1360i f12627j;

    public C1359h(boolean z10, C1360i c1360i) {
        this.f12612a = z10;
        this.f12627j = c1360i;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f12613b = c1360i.f(allocate, 16L);
        this.f12614c = c1360i.g(allocate, 32L);
        this.f12615d = c1360i.g(allocate, 40L);
        this.f12616e = c1360i.f(allocate, 54L);
        this.f12617f = c1360i.f(allocate, 56L);
        this.f12618g = c1360i.f(allocate, 58L);
        this.f12619h = c1360i.f(allocate, 60L);
        this.f12620i = c1360i.f(allocate, 62L);
    }

    @Override // a6.AbstractC1355d
    public AbstractC1354c a(long j10, int i10) {
        return new C1353b(this.f12627j, this, j10, i10);
    }

    @Override // a6.AbstractC1355d
    public AbstractC1356e b(long j10) {
        return new k(this.f12627j, this, j10);
    }

    @Override // a6.AbstractC1355d
    public AbstractC1357f c(int i10) {
        return new m(this.f12627j, this, i10);
    }
}
