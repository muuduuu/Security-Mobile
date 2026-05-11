package a6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class j extends AbstractC1356e {
    public j(C1360i c1360i, AbstractC1355d abstractC1355d, long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC1355d.f12612a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = abstractC1355d.f12614c + (j10 * abstractC1355d.f12616e);
        this.f12621a = c1360i.j(allocate, j11);
        this.f12622b = c1360i.j(allocate, 4 + j11);
        this.f12623c = c1360i.j(allocate, 8 + j11);
        this.f12624d = c1360i.j(allocate, j11 + 20);
    }
}
