package R5;

import java.nio.ByteBuffer;

/* renamed from: R5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1134g extends G {
    public C1134g() {
        super(ByteBuffer.class);
    }

    @Override // R5.H, D5.o
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void f(ByteBuffer byteBuffer, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (byteBuffer.hasArray()) {
            int position = byteBuffer.position();
            fVar.H(byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        T5.e eVar = new T5.e(asReadOnlyBuffer);
        fVar.z(eVar, asReadOnlyBuffer.remaining());
        eVar.close();
    }
}
