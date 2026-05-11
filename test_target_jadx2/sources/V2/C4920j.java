package v2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k2.v;
import l2.InterfaceC3600b;

/* renamed from: v2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4920j implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final List f43860a;

    /* renamed from: b, reason: collision with root package name */
    private final i2.j f43861b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3600b f43862c;

    public C4920j(List list, i2.j jVar, InterfaceC3600b interfaceC3600b) {
        this.f43860a = list;
        this.f43861b = jVar;
        this.f43862c = interfaceC3600b;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f43861b.b(ByteBuffer.wrap(e10), i10, i11, hVar);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, i2.h hVar) {
        return !((Boolean) hVar.c(AbstractC4919i.f43859b)).booleanValue() && com.bumptech.glide.load.a.f(this.f43860a, inputStream, this.f43862c) == ImageHeaderParser.ImageType.GIF;
    }
}
