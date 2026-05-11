package r2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import i2.EnumC3314b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import l2.InterfaceC3600b;
import l2.InterfaceC3602d;
import r2.n;
import r2.y;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static final i2.g f39172f = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC3314b.DEFAULT);

    /* renamed from: g, reason: collision with root package name */
    public static final i2.g f39173g = i2.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final i2.g f39174h = n.f39170h;

    /* renamed from: i, reason: collision with root package name */
    public static final i2.g f39175i;

    /* renamed from: j, reason: collision with root package name */
    public static final i2.g f39176j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set f39177k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f39178l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set f39179m;

    /* renamed from: n, reason: collision with root package name */
    private static final Queue f39180n;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3602d f39181a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f39182b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3600b f39183c;

    /* renamed from: d, reason: collision with root package name */
    private final List f39184d;

    /* renamed from: e, reason: collision with root package name */
    private final x f39185e = x.b();

    public interface b {
        void a();

        void b(InterfaceC3602d interfaceC3602d, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f39175i = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f39176j = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f39177k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f39178l = new a();
        f39179m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f39180n = D2.l.g(0);
    }

    public t(List list, DisplayMetrics displayMetrics, InterfaceC3602d interfaceC3602d, InterfaceC3600b interfaceC3600b) {
        this.f39184d = list;
        this.f39182b = (DisplayMetrics) D2.k.d(displayMetrics);
        this.f39181a = (InterfaceC3602d) D2.k.d(interfaceC3602d);
        this.f39183c = (InterfaceC3600b) D2.k.d(interfaceC3600b);
    }

    private static int a(double d10) {
        return x((d10 / (r1 / r0)) * x(l(d10) * d10));
    }

    private void b(y yVar, EnumC3314b enumC3314b, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12;
        if (this.f39185e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (enumC3314b == EnumC3314b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z12 = yVar.d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC3314b, e10);
            }
            z12 = false;
        }
        Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, y yVar, b bVar, InterfaceC3602d interfaceC3602d, n nVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int floor;
        int floor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float b10 = nVar.b(i15, i16, i13, i14);
        if (b10 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + nVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        n.g a10 = nVar.a(i15, i16, i13, i14);
        if (a10 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int x10 = i15 / x(b10 * f10);
        int x11 = i16 / x(b10 * f11);
        n.g gVar = n.g.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a10 == gVar ? Math.max(x10, x11) : Math.min(x10, x11)));
        if (a10 == gVar && max < 1.0f / b10) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f10 / min);
            floor2 = (int) Math.ceil(f11 / min);
            int i17 = max / 8;
            if (i17 > 0) {
                floor /= i17;
                floor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = max;
            floor = (int) Math.floor(f10 / f12);
            floor2 = (int) Math.floor(f11 / f12);
        } else if (imageType.isWebp()) {
            float f13 = max;
            floor = Math.round(f10 / f13);
            floor2 = Math.round(f11 / f13);
        } else if (i15 % max == 0 && i16 % max == 0) {
            floor = i15 / max;
            floor2 = i16 / max;
        } else {
            int[] m10 = m(yVar, options, bVar, interfaceC3602d);
            floor = m10[0];
            floor2 = m10[1];
        }
        double b11 = nVar.b(floor, floor2, i13, i14);
        options.inTargetDensity = a(b11);
        options.inDensity = l(b11);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + b10 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b11 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private k2.v g(y yVar, int i10, int i11, i2.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f39183c.d(65536, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        EnumC3314b enumC3314b = (EnumC3314b) hVar.c(f39172f);
        i2.i iVar = (i2.i) hVar.c(f39173g);
        n nVar = (n) hVar.c(n.f39170h);
        boolean booleanValue = ((Boolean) hVar.c(f39175i)).booleanValue();
        i2.g gVar = f39176j;
        try {
            return C4008g.c(h(yVar, k10, nVar, enumC3314b, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f39181a);
        } finally {
            v(k10);
            this.f39183c.put(bArr);
        }
    }

    private Bitmap h(y yVar, BitmapFactory.Options options, n nVar, EnumC3314b enumC3314b, i2.i iVar, boolean z10, int i10, int i11, boolean z11, b bVar) {
        int i12;
        int i13;
        String str;
        int i14;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        int round;
        int i15;
        int i16;
        long b10 = D2.g.b();
        int[] m10 = m(yVar, options, bVar, this.f39181a);
        int i17 = m10[0];
        int i18 = m10[1];
        String str2 = options.outMimeType;
        boolean z12 = (i17 == -1 || i18 == -1) ? false : z10;
        int a10 = yVar.a();
        int f10 = F.f(a10);
        boolean i19 = F.i(a10);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = r(f10) ? i18 : i17;
        } else {
            i12 = i11;
            i13 = i10;
        }
        int i20 = i12 == Integer.MIN_VALUE ? r(f10) ? i17 : i18 : i12;
        ImageHeaderParser.ImageType d10 = yVar.d();
        c(d10, yVar, bVar, this.f39181a, nVar, f10, i17, i18, i13, i20, options);
        b(yVar, enumC3314b, z12, i19, options, i13, i20);
        int i21 = Build.VERSION.SDK_INT;
        if (z(d10)) {
            if (i17 < 0 || i18 < 0 || !z11) {
                float f11 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i22 = options.inSampleSize;
                float f12 = i22;
                int ceil = (int) Math.ceil(i17 / f12);
                int ceil2 = (int) Math.ceil(i18 / f12);
                int round2 = Math.round(ceil * f11);
                round = Math.round(ceil2 * f11);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(round2);
                    sb2.append("x");
                    sb2.append(round);
                    i15 = round2;
                    sb2.append("] for source [");
                    sb2.append(i17);
                    sb2.append("x");
                    sb2.append(i18);
                    sb2.append("], sampleSize: ");
                    sb2.append(i22);
                    sb2.append(", targetDensity: ");
                    sb2.append(options.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f11);
                    Log.v(str, sb2.toString());
                } else {
                    i15 = round2;
                }
                i16 = i15;
            } else {
                str = "Downsampler";
                i16 = i13;
                round = i20;
            }
            if (i16 > 0 && round > 0) {
                y(options, this.f39181a, i16, round);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i21 >= 28) {
                if (iVar == i2.i.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            options.inPreferredColorSpace = colorSpace2;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i21 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap i23 = i(yVar, options, bVar, this.f39181a);
        bVar.b(this.f39181a, i23);
        if (Log.isLoggable(str, 2)) {
            i14 = a10;
            t(i17, i18, str2, options, i23, i10, i11, b10);
        } else {
            i14 = a10;
        }
        if (i23 == null) {
            return null;
        }
        i23.setDensity(this.f39182b.densityDpi);
        Bitmap j10 = F.j(this.f39181a, i23, i14);
        if (i23.equals(j10)) {
            return j10;
        }
        this.f39181a.c(i23);
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap i(y yVar, BitmapFactory.Options options, b bVar, InterfaceC3602d interfaceC3602d) {
        if (!options.inJustDecodeBounds) {
            bVar.a();
            yVar.c();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        F.e().lock();
        try {
            try {
                Bitmap b10 = yVar.b(options);
                F.e().unlock();
                return b10;
            } catch (IllegalArgumentException e10) {
                IOException u10 = u(e10, i10, i11, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", u10);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw u10;
                }
                try {
                    interfaceC3602d.c(bitmap);
                    options.inBitmap = null;
                    Bitmap i12 = i(yVar, options, bVar, interfaceC3602d);
                    F.e().unlock();
                    return i12;
                } catch (IOException unused) {
                    throw u10;
                }
            }
        } catch (Throwable th) {
            F.e().unlock();
            throw th;
        }
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        synchronized (t.class) {
            Queue queue = f39180n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                w(options);
            }
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(y yVar, BitmapFactory.Options options, b bVar, InterfaceC3602d interfaceC3602d) {
        options.inJustDecodeBounds = true;
        i(yVar, options, bVar, interfaceC3602d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + D2.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f39180n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, InterfaceC3602d interfaceC3602d, int i10, int i11) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                return;
            } else {
                config = options.outConfig;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC3602d.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public k2.v d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i2.h hVar) {
        return g(new y.c(parcelFileDescriptor, this.f39184d, this.f39183c), i10, i11, hVar, f39178l);
    }

    public k2.v e(InputStream inputStream, int i10, int i11, i2.h hVar, b bVar) {
        return g(new y.b(inputStream, this.f39184d, this.f39183c), i10, i11, hVar, bVar);
    }

    public k2.v f(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        return g(new y.a(byteBuffer, this.f39184d, this.f39183c), i10, i11, hVar, f39178l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    class a implements b {
        a() {
        }

        @Override // r2.t.b
        public void a() {
        }

        @Override // r2.t.b
        public void b(InterfaceC3602d interfaceC3602d, Bitmap bitmap) {
        }
    }
}
