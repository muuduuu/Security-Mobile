package xa;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.N;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import expo.modules.camera.PictureOptions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pb.m;
import pc.AbstractC3868b;
import xc.C5141B;
import ya.C5181a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f44931a;

    /* renamed from: b, reason: collision with root package name */
    private m f44932b;

    /* renamed from: c, reason: collision with root package name */
    private PictureOptions f44933c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44934d;

    /* renamed from: e, reason: collision with root package name */
    private final File f44935e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC5138a f44936f;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f44937a;

        a(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f44937a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            b.this.g(b.this.h());
            return Unit.f36324a;
        }
    }

    public b(byte[] imageData, m promise, PictureOptions options, boolean z10, File directory, InterfaceC5138a pictureSavedDelegate) {
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(pictureSavedDelegate, "pictureSavedDelegate");
        this.f44931a = imageData;
        this.f44932b = promise;
        this.f44933c = options;
        this.f44934d = z10;
        this.f44935e = directory;
        this.f44936f = pictureSavedDelegate;
    }

    private final Bitmap c(byte[] bArr, int i10, BitmapFactory.Options options) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        if (this.f44934d) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final Bitmap d(byte[] bArr, int i10, PictureOptions pictureOptions, BitmapFactory.Options options) {
        if (!pictureOptions.getExif()) {
            return c(bArr, e(i10), options);
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        Intrinsics.d(decodeByteArray);
        return decodeByteArray;
    }

    private final int e(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private final int f() {
        return (int) (this.f44933c.getQuality() * 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!this.f44933c.getFastMode()) {
            this.f44932b.resolve(bundle);
            return;
        }
        Bundle bundle2 = new Bundle();
        Integer id2 = this.f44933c.getId();
        if (id2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        bundle2.putInt("id", id2.intValue());
        bundle2.putBundle("data", bundle);
        this.f44936f.a(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public final Bundle h() {
        if (this.f44933c.getSkipProcessing()) {
            return j();
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f44931a);
            try {
                Bundle bundle = new Bundle();
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(byteArrayInputStream);
                Map<String, Object> additionalExif = this.f44933c.getAdditionalExif();
                if (additionalExif != null) {
                    C5181a.c(aVar, additionalExif);
                }
                int i10 = aVar.i("Orientation", 1);
                if (this.f44934d) {
                    aVar.b0("Orientation", String.valueOf(c.a(i10)));
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                C5141B c5141b = new C5141B();
                OutOfMemoryError e10 = null;
                while (options.inSampleSize <= this.f44933c.getMaxDownsampling()) {
                    try {
                        c5141b.f44962a = d(this.f44931a, i10, this.f44933c, options);
                        break;
                    } catch (OutOfMemoryError e11) {
                        e10 = e11;
                        options.inSampleSize *= 2;
                    }
                }
                if (c5141b.f44962a == null) {
                    this.f44932b.reject("ERR_CAMERA_OUT_OF_MEMORY", "Cannot allocate enough space to process the taken picture.", e10);
                    kotlin.io.c.a(byteArrayInputStream, null);
                    return null;
                }
                if (this.f44933c.getExif()) {
                    bundle.putBundle("exif", C5181a.b(aVar));
                }
                bundle.putInt("width", ((Bitmap) c5141b.f44962a).getWidth());
                bundle.putInt("height", ((Bitmap) c5141b.f44962a).getHeight());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ((Bitmap) c5141b.f44962a).compress(Bitmap.CompressFormat.JPEG, f(), byteArrayOutputStream);
                    String k10 = k(byteArrayOutputStream);
                    ((Bitmap) c5141b.f44962a).recycle();
                    if (this.f44933c.getExif()) {
                        Intrinsics.d(k10);
                        C5181a.a(new androidx.exifinterface.media.a(k10), aVar);
                    }
                    String uri = Uri.fromFile(new File(k10)).toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                    bundle.putString("uri", uri);
                    if (this.f44933c.getBase64()) {
                        bundle.putString("base64", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                    }
                    Unit unit = Unit.f36324a;
                    kotlin.io.c.a(byteArrayOutputStream, null);
                    kotlin.io.c.a(byteArrayInputStream, null);
                    return bundle;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    kotlin.io.c.a(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e12) {
            if (e12 instanceof Resources.NotFoundException) {
                this.f44932b.reject("E_TAKING_PICTURE_FAILED", "Documents directory of the app could not be found.", e12);
            } else if (e12 instanceof IOException) {
                this.f44932b.reject("E_TAKING_PICTURE_FAILED", "An unknown I/O exception has occurred.", e12);
            } else if (e12 instanceof IllegalArgumentException) {
                this.f44932b.reject("E_TAKING_PICTURE_FAILED", "An incompatible parameter has been passed in. ", e12);
            } else {
                this.f44932b.reject("E_TAKING_PICTURE_FAILED", "An unknown exception has occurred.", e12);
            }
            e12.printStackTrace();
            return null;
        }
    }

    private final Bundle j() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.f44931a);
                String k10 = k(byteArrayOutputStream);
                String uri = Uri.fromFile(k10 != null ? new File(k10) : null).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                Intrinsics.d(k10);
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(k10);
                Bundle bundle = new Bundle();
                bundle.putString("uri", uri);
                bundle.putInt("width", aVar.i("ImageWidth", -1));
                bundle.putInt("height", aVar.i("ImageLength", -1));
                if (this.f44933c.getExif()) {
                    bundle.putBundle("exif", C5181a.b(aVar));
                }
                if (this.f44933c.getBase64()) {
                    bundle.putString("base64", Base64.encodeToString(this.f44931a, 2));
                }
                kotlin.io.c.a(byteArrayOutputStream, null);
                return bundle;
            } finally {
            }
        } catch (IOException e10) {
            this.f44932b.reject("E_TAKING_PICTURE_FAILED", "An unknown I/O exception has occurred.", e10);
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            this.f44932b.reject("E_TAKING_PICTURE_FAILED", "An unknown exception has occurred.", e11);
            e11.printStackTrace();
            return null;
        }
    }

    private final String k(ByteArrayOutputStream byteArrayOutputStream) {
        try {
            String c10 = ya.c.f45384a.c(this.f44935e, "Camera", ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(c10);
            try {
                byteArrayOutputStream.writeTo(fileOutputStream);
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(fileOutputStream, null);
                return c10;
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final Object i(d dVar) {
        Object g10 = AbstractC0887i.g(C0874b0.b(), new a(null), dVar);
        return g10 == AbstractC3868b.e() ? g10 : Unit.f36324a;
    }
}
