package l6;

import com.github.penfeizhou.animation.io.e;
import java.nio.IntBuffer;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3610a implements e {

    /* renamed from: a, reason: collision with root package name */
    protected IntBuffer f37097a;

    public C3610a() {
        c(10240);
    }

    public IntBuffer a() {
        return this.f37097a;
    }

    public int[] b() {
        return this.f37097a.array();
    }

    public void c(int i10) {
        IntBuffer intBuffer = this.f37097a;
        if (intBuffer == null || i10 > intBuffer.capacity()) {
            this.f37097a = IntBuffer.allocate(i10);
        }
        this.f37097a.clear();
        this.f37097a.limit(i10);
        this.f37097a.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }
}
