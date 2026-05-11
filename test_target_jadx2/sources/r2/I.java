package r2;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i2.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l2.InterfaceC3602d;

/* loaded from: classes.dex */
public class I implements i2.j {

    /* renamed from: d, reason: collision with root package name */
    public static final i2.g f39134d = i2.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final i2.g f39135e = i2.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final f f39136f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final List f39137g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    private final e f39138a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3602d f39139b;

    /* renamed from: c, reason: collision with root package name */
    private final f f39140c;

    class a implements g.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f39141a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // i2.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f39141a) {
                this.f39141a.position(0);
                messageDigest.update(this.f39141a.putLong(l10.longValue()).array());
            }
        }
    }

    class b implements g.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f39142a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // i2.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f39142a) {
                this.f39142a.position(0);
                messageDigest.update(this.f39142a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements e {
        private c() {
        }

        @Override // r2.I.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // r2.I.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    interface e {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    static final class g implements e {
        g() {
        }

        @Override // r2.I.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // r2.I.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    I(InterfaceC3602d interfaceC3602d, e eVar) {
        this(interfaceC3602d, eVar, f39136f);
    }

    public static i2.j c(InterfaceC3602d interfaceC3602d) {
        return new I(interfaceC3602d, new c(null));
    }

    public static i2.j d(InterfaceC3602d interfaceC3602d) {
        return new I(interfaceC3602d, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        return bitmap;
    }

    private Bitmap f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, n nVar) {
        if (l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap h10 = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || nVar == n.f39168f) ? null : h(mediaMetadataRetriever, j10, i10, i11, i12, nVar);
        if (h10 == null) {
            h10 = g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap e10 = e(mediaMetadataRetriever, h10);
        if (e10 != null) {
            return e10;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, n nVar) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b10 = nVar.b(parseInt, parseInt2, i11, i12);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(parseInt * b10), Math.round(b10 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        Iterator it = f39137g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f39138a.a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th2) {
            th = th2;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public static i2.j m(InterfaceC3602d interfaceC3602d) {
        return new I(interfaceC3602d, new g());
    }

    @Override // i2.j
    public boolean a(Object obj, i2.h hVar) {
        return true;
    }

    @Override // i2.j
    public k2.v b(Object obj, int i10, int i11, i2.h hVar) {
        long longValue = ((Long) hVar.c(f39134d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f39135e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) hVar.c(n.f39170h);
        if (nVar == null) {
            nVar = n.f39169g;
        }
        n nVar2 = nVar;
        MediaMetadataRetriever a10 = this.f39140c.a();
        try {
            this.f39138a.b(a10, obj);
            return C4008g.c(f(obj, a10, longValue, num.intValue(), i10, i11, nVar2), this.f39139b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                a10.release();
            } else {
                a10.release();
            }
        }
    }

    I(InterfaceC3602d interfaceC3602d, e eVar, f fVar) {
        this.f39139b = interfaceC3602d;
        this.f39138a = eVar;
        this.f39140c = fVar;
    }

    static final class d implements e {
        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // r2.I.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // r2.I.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }

        class a extends MediaDataSource {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f39143a;

            a(ByteBuffer byteBuffer) {
                this.f39143a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f39143a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f39143a.limit()) {
                    return -1;
                }
                this.f39143a.position((int) j10);
                int min = Math.min(i11, this.f39143a.remaining());
                this.f39143a.get(bArr, i10, min);
                return min;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
