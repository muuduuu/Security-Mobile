package a6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1352a extends AbstractC1354c {
    public C1352a(C1360i c1360i, AbstractC1355d abstractC1355d, long j10, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC1355d.f12612a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + (i10 * 8);
        this.f12610a = c1360i.j(allocate, j11);
        this.f12611b = c1360i.j(allocate, j11 + 4);
    }
}
