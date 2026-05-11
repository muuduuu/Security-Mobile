package d0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import c0.InterfaceC1703n;
import c0.k0;
import java.io.IOException;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2970a {

    /* renamed from: a, reason: collision with root package name */
    private static final LruCache f31189a = new LruCache(10);

    public static MediaCodec a(InterfaceC1703n interfaceC1703n) {
        return b(interfaceC1703n.c());
    }

    private static MediaCodec b(String str) {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e10) {
            throw new k0(e10);
        }
    }

    public static MediaCodecInfo c(InterfaceC1703n interfaceC1703n) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        String c10 = interfaceC1703n.c();
        LruCache lruCache = f31189a;
        synchronized (lruCache) {
            mediaCodecInfo = (MediaCodecInfo) lruCache.get(c10);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodec = b(c10);
            try {
                MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(c10, codecInfo);
                }
                mediaCodec.release();
                return codecInfo;
            } catch (Throwable th) {
                th = th;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodec = null;
        }
    }
}
