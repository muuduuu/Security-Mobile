package r2;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class z implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final C4007f f39206a = new C4007f();

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(D2.a.b(inputStream));
        return this.f39206a.c(createSource, i10, i11, hVar);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, i2.h hVar) {
        return true;
    }
}
