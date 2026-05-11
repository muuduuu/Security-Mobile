package k4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import b3.l;
import c3.AbstractC1721a;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import e3.C3075b;
import f3.AbstractC3142a;
import f3.h;
import h3.C3228a;
import h3.C3229b;
import j4.i;
import j4.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final Class f36211f = b.class;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f36212g = {-1, -39};

    /* renamed from: a, reason: collision with root package name */
    private final i f36213a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36214b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36215c;

    /* renamed from: d, reason: collision with root package name */
    private final PreverificationHelper f36216d;

    /* renamed from: e, reason: collision with root package name */
    final y0.d f36217e;

    public b(i iVar, y0.d dVar, f fVar) {
        this.f36216d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f36213a = iVar;
        if (iVar instanceof r) {
            this.f36214b = fVar.a();
            this.f36215c = fVar.b();
        }
        this.f36217e = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:25:0x007d, B:28:0x0087, B:36:0x009f, B:38:0x00c7, B:65:0x00c0, B:66:0x00c3, B:60:0x00ba), top: B:24:0x007d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC3142a c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        ByteBuffer byteBuffer;
        Bitmap bitmap2;
        Bitmap.Config config;
        BitmapRegionDecoder bitmapRegionDecoder;
        ColorSpace.Named named;
        PreverificationHelper preverificationHelper;
        l.g(inputStream);
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        ?? r02 = i10;
        if (rect != null) {
            int width = rect.width() / options.inSampleSize;
            i11 = rect.height() / options.inSampleSize;
            r02 = width;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = i12 >= 26 && (preverificationHelper = this.f36216d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder2 = null;
        try {
            try {
                if (rect == null && z10) {
                    options.inMutable = false;
                } else {
                    if (rect != null && z10) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f36214b) {
                        Bitmap bitmap3 = (Bitmap) this.f36213a.get(d(r02, i11, options));
                        bitmap = bitmap3;
                        if (bitmap3 == null) {
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                        options.inBitmap = bitmap;
                        if (i12 >= 26) {
                            if (colorSpace == null) {
                                named = ColorSpace.Named.SRGB;
                                colorSpace = ColorSpace.get(named);
                            }
                            options.inPreferredColorSpace = colorSpace;
                        }
                        byteBuffer = (ByteBuffer) this.f36217e.b();
                        if (byteBuffer == null) {
                            byteBuffer = ByteBuffer.allocate(C3075b.e());
                        }
                        options.inTempStorage = byteBuffer.array();
                        if (rect != null && bitmap != 0) {
                            config = options.inPreferredConfig;
                            try {
                                if (config != null) {
                                    try {
                                        bitmap.reconfigure(r02, i11, config);
                                        bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, true);
                                        if (bitmapRegionDecoder != null) {
                                            try {
                                                bitmap2 = bitmapRegionDecoder.decodeRegion(rect, options);
                                            } catch (IOException unused) {
                                                AbstractC1721a.k(f36211f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                                if (bitmapRegionDecoder != null) {
                                                    bitmapRegionDecoder.recycle();
                                                }
                                                bitmap2 = null;
                                                if (bitmap2 == null) {
                                                }
                                                this.f36217e.a(byteBuffer);
                                                if (bitmap != 0) {
                                                }
                                                if (!this.f36215c) {
                                                }
                                            }
                                        } else {
                                            bitmap2 = null;
                                        }
                                        if (bitmapRegionDecoder != null) {
                                            bitmapRegionDecoder.recycle();
                                        }
                                    } catch (IOException unused2) {
                                        bitmapRegionDecoder = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (bitmapRegionDecoder2 != null) {
                                            bitmapRegionDecoder2.recycle();
                                        }
                                        throw th;
                                    }
                                    if (bitmap2 == null) {
                                        bitmap2 = BitmapFactory.decodeStream(inputStream, null, options);
                                    }
                                    this.f36217e.a(byteBuffer);
                                    if (bitmap != 0 || bitmap == bitmap2) {
                                        return !this.f36215c ? AbstractC3142a.C(bitmap2, a.f36218a) : AbstractC3142a.C(bitmap2, this.f36213a);
                                    }
                                    this.f36213a.a(bitmap);
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    throw new IllegalStateException();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bitmapRegionDecoder2 = r02;
                            }
                        }
                        bitmap2 = null;
                        if (bitmap2 == null) {
                        }
                        this.f36217e.a(byteBuffer);
                        if (bitmap != 0) {
                        }
                        if (!this.f36215c) {
                        }
                    }
                }
                options.inTempStorage = byteBuffer.array();
                if (rect != null) {
                    config = options.inPreferredConfig;
                    if (config != null) {
                    }
                }
                bitmap2 = null;
                if (bitmap2 == null) {
                }
                this.f36217e.a(byteBuffer);
                if (bitmap != 0) {
                }
                if (!this.f36215c) {
                }
            } catch (Throwable th3) {
                this.f36217e.a(byteBuffer);
                throw th3;
            }
        } catch (IllegalArgumentException e10) {
            if (bitmap != 0) {
                this.f36213a.a(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (decodeStream == null) {
                    throw e10;
                }
                AbstractC3142a C10 = AbstractC3142a.C(decodeStream, Y3.f.b());
                this.f36217e.a(byteBuffer);
                return C10;
            } catch (IOException unused3) {
                throw e10;
            }
        } catch (RuntimeException e11) {
            if (bitmap != 0) {
                this.f36213a.a(bitmap);
            }
            throw e11;
        }
        bitmap = 0;
        options.inBitmap = bitmap;
        if (i12 >= 26) {
        }
        byteBuffer = (ByteBuffer) this.f36217e.b();
        if (byteBuffer == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BitmapFactory.Options e(g4.i iVar, Bitmap.Config config, boolean z10) {
        boolean z11;
        Bitmap.Config config2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iVar.o();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                z11 = true;
                if (!z11) {
                    options.inPreferredConfig = config;
                }
                options.inMutable = true;
                if (!z10) {
                    BitmapFactory.decodeStream(iVar.l(), null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        throw new IllegalArgumentException();
                    }
                }
                if (z11) {
                    options.inPreferredConfig = config;
                }
                options.inJustDecodeBounds = false;
                return options;
            }
        }
        z11 = false;
        if (!z11) {
        }
        options.inMutable = true;
        if (!z10) {
        }
        if (z11) {
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // k4.d
    public AbstractC3142a a(g4.i iVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        boolean t10 = iVar.t(i10);
        BitmapFactory.Options e10 = e(iVar, config, this.f36214b);
        InputStream l10 = iVar.l();
        l.g(l10);
        if (iVar.p() > i10) {
            l10 = new C3228a(l10, i10);
        }
        if (!t10) {
            l10 = new C3229b(l10, f36212g);
        }
        boolean z10 = e10.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                return c(l10, e10, rect, colorSpace);
            } catch (RuntimeException e11) {
                if (!z10) {
                    throw e11;
                }
                AbstractC3142a a10 = a(iVar, Bitmap.Config.ARGB_8888, rect, i10, colorSpace);
                try {
                    l10.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                return a10;
            }
        } finally {
            try {
                l10.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        }
    }

    @Override // k4.d
    public AbstractC3142a b(g4.i iVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options e10 = e(iVar, config, this.f36214b);
        boolean z10 = e10.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c((InputStream) l.g(iVar.l()), e10, rect, colorSpace);
        } catch (RuntimeException e11) {
            if (z10) {
                return b(iVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e11;
        }
    }

    public abstract int d(int i10, int i11, BitmapFactory.Options options);

    private static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        private static final a f36218a = new a();

        private a() {
        }

        @Override // f3.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
        }
    }
}
