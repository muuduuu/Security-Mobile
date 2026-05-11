package h6;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;
import java.nio.ByteBuffer;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3283a extends c {

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f33968a;

    public C3283a(Reader reader) {
        super(reader);
        this.f33968a = null;
    }

    public ByteBuffer a() {
        if (this.f33968a == null) {
            int available = available();
            byte[] bArr = new byte[available];
            read(bArr, 0, available);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(available);
            this.f33968a = allocateDirect;
            allocateDirect.put(bArr);
        }
        this.f33968a.flip();
        return this.f33968a;
    }
}
