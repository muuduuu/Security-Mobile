package g2;

import D2.k;
import android.graphics.Bitmap;
import android.util.Log;
import i2.EnumC3314b;
import i2.h;
import i2.j;
import java.nio.ByteBuffer;
import k2.v;
import l2.InterfaceC3602d;
import org.aomedia.avif.android.AvifDecoder;
import r2.C4008g;
import r2.t;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3602d f33509a;

    public b(InterfaceC3602d interfaceC3602d) {
        this.f33509a = (InterfaceC3602d) k.d(interfaceC3602d);
    }

    private ByteBuffer e(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.put(byteBuffer);
        allocateDirect.flip();
        return allocateDirect;
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        ByteBuffer e10 = e(byteBuffer);
        AvifDecoder.Info info = new AvifDecoder.Info();
        if (!AvifDecoder.getInfo(e10, e10.remaining(), info)) {
            if (Log.isLoggable("AvifBitmapDecoder", 6)) {
                Log.e("AvifBitmapDecoder", "Requested to decode byte buffer which cannot be handled by AvifDecoder");
            }
            return null;
        }
        Bitmap d10 = this.f33509a.d(info.width, info.height, hVar.c(t.f39172f) == EnumC3314b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : info.depth == 8 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16);
        if (AvifDecoder.decode(e10, e10.remaining(), d10)) {
            return C4008g.c(d10, this.f33509a);
        }
        if (Log.isLoggable("AvifBitmapDecoder", 6)) {
            Log.e("AvifBitmapDecoder", "Failed to decode ByteBuffer as Avif.");
        }
        this.f33509a.c(d10);
        return null;
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, h hVar) {
        return AvifDecoder.isAvifImage(e(byteBuffer));
    }
}
