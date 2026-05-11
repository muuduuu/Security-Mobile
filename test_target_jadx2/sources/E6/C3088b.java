package e6;

import java.nio.ByteOrder;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3088b extends com.github.penfeizhou.animation.io.b {
    @Override // com.github.penfeizhou.animation.io.b
    public void d(int i10) {
        super.d(i10);
        this.f23195a.order(ByteOrder.BIG_ENDIAN);
    }

    public void g(int i10) {
        b((byte) (i10 & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 24) & 255));
    }

    public void h(int i10) {
        b((byte) ((i10 >> 24) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) (i10 & 255));
    }
}
