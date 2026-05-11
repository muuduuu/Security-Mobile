package r2;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class k implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final C4007f f39156a = new C4007f();

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f39156a.c(createSource, i10, i11, hVar);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
        return true;
    }
}
