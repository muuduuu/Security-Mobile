package n6;

import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3709a implements InterfaceC3710b {
    @Override // n6.InterfaceC3710b
    public Reader a() {
        return new com.github.penfeizhou.animation.io.a(b());
    }

    public abstract ByteBuffer b();
}
