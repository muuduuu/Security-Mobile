package g2;

import D2.k;
import com.bumptech.glide.load.ImageHeaderParser;
import i2.h;
import i2.j;
import java.io.InputStream;
import java.util.List;
import k2.v;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    private final List f33510a;

    /* renamed from: b, reason: collision with root package name */
    private final b f33511b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3600b f33512c;

    public c(List list, b bVar, InterfaceC3600b interfaceC3600b) {
        this.f33510a = list;
        this.f33511b = (b) k.d(bVar);
        this.f33512c = (InterfaceC3600b) k.d(interfaceC3600b);
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream inputStream, int i10, int i11, h hVar) {
        return this.f33511b.b(D2.a.b(inputStream), i10, i11, hVar);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, h hVar) {
        ImageHeaderParser.ImageType f10 = com.bumptech.glide.load.a.f(this.f33510a, inputStream, this.f33512c);
        return f10.equals(ImageHeaderParser.ImageType.AVIF) || f10.equals(ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }
}
