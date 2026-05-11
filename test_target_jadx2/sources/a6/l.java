package a6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class l extends AbstractC1357f {
    public l(C1360i c1360i, AbstractC1355d abstractC1355d, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC1355d.f12612a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f12625a = c1360i.j(allocate, abstractC1355d.f12615d + (i10 * abstractC1355d.f12618g) + 28);
    }
}
