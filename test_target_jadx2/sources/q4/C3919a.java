package q4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Pair;
import e3.C3075b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import xc.m;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3919a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3919a f38749a = new C3919a();

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f38750b = i.a(C0598a.f38752a);

    /* renamed from: c, reason: collision with root package name */
    private static boolean f38751c;

    /* renamed from: q4.a$a, reason: collision with other inner class name */
    static final class C0598a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0598a f38752a = new C0598a();

        C0598a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y0.e invoke() {
            return new y0.e(12);
        }
    }

    /* renamed from: q4.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38753a;

        static {
            Bitmap.Config config;
            Bitmap.Config config2;
            Bitmap.Config config3;
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                config3 = Bitmap.Config.RGBA_F16;
                iArr[config3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                config2 = Bitmap.Config.RGBA_1010102;
                iArr[config2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                config = Bitmap.Config.HARDWARE;
                iArr[config.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f38753a = iArr;
        }
    }

    private C3919a() {
    }

    private final ByteBuffer a() {
        return f38751c ? C3075b.f32181a.b() : (ByteBuffer) d().b();
    }

    public static final Pair b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C3919a c3919a = f38749a;
        ByteBuffer h10 = c3919a.h();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = h10.array();
            Pair pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            c3919a.i(h10);
            return pair;
        } catch (Throwable th) {
            f38749a.i(h10);
            throw th;
        }
    }

    public static final d c(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C3919a c3919a = f38749a;
        ByteBuffer h10 = c3919a.h();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = h10.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            d dVar = new d(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            c3919a.i(h10);
            return dVar;
        } catch (Throwable th) {
            f38749a.i(h10);
            throw th;
        }
    }

    private final y0.e d() {
        return (y0.e) f38750b.getValue();
    }

    public static final int e(Bitmap.Config config) {
        switch (config == null ? -1 : b.f38753a[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int f(int i10, int i11, Bitmap.Config config) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + i10).toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + i11).toString());
        }
        int e10 = e(config);
        int i12 = i10 * i11 * e10;
        if (i12 > 0) {
            return i12;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i12 + ", width: " + i10 + ", height: " + i11 + ", pixelSize: " + e10).toString());
    }

    public static final int g(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    private final ByteBuffer h() {
        ByteBuffer a10 = a();
        if (a10 != null) {
            return a10;
        }
        ByteBuffer allocate = ByteBuffer.allocate(C3075b.e());
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(DecodeBufferHel…mendedDecodeBufferSize())");
        return allocate;
    }

    private final void i(ByteBuffer byteBuffer) {
        if (f38751c) {
            return;
        }
        d().a(byteBuffer);
    }
}
