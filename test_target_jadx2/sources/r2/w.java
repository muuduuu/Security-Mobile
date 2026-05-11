package r2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
public final class w implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, InterfaceC3600b interfaceC3600b) {
        return d(D2.a.g(byteBuffer), interfaceC3600b);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, InterfaceC3600b interfaceC3600b) {
        int i10 = new androidx.exifinterface.media.a(inputStream).i("Orientation", 1);
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }
}
