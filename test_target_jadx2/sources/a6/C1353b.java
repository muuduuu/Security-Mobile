package a6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1353b extends AbstractC1354c {
    public C1353b(C1360i c1360i, AbstractC1355d abstractC1355d, long j10, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC1355d.f12612a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + (i10 * 16);
        this.f12610a = c1360i.g(allocate, j11);
        this.f12611b = c1360i.g(allocate, j11 + 8);
    }
}
