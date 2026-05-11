package expo.modules.clipboard;

import Jd.AbstractC0909t0;
import Jd.C0874b0;
import Jd.J;
import Jd.X0;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.p;
import pc.AbstractC3868b;
import xc.m;
import za.i;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: expo.modules.clipboard.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0471a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32597a;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            try {
                iArr[ImageFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageFormat.JPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32597a = iArr;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32598a;

        /* renamed from: b, reason: collision with root package name */
        int f32599b;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32598a = obj;
            this.f32599b |= Integer.MIN_VALUE;
            return a.b(null, null, this);
        }
    }

    static final class c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f32600a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f32601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, Uri uri) {
            super(0);
            this.f32600a = context;
            this.f32601b = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            ImageDecoder.Source createSource;
            Bitmap decodeBitmap;
            ContentResolver contentResolver = this.f32600a.getContentResolver();
            if (Build.VERSION.SDK_INT < 28) {
                return MediaStore.Images.Media.getBitmap(contentResolver, this.f32601b);
            }
            createSource = ImageDecoder.createSource(contentResolver, this.f32601b);
            Intrinsics.checkNotNullExpressionValue(createSource, "createSource(...)");
            decodeBitmap = ImageDecoder.decodeBitmap(createSource);
            return decodeBitmap;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f32602a;

        /* renamed from: b, reason: collision with root package name */
        Object f32603b;

        /* renamed from: c, reason: collision with root package name */
        Object f32604c;

        /* renamed from: d, reason: collision with root package name */
        Object f32605d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f32606e;

        /* renamed from: f, reason: collision with root package name */
        int f32607f;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32606e = obj;
            this.f32607f |= Integer.MIN_VALUE;
            return a.c(null, null, null, this);
        }
    }

    static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BufferedOutputStream f32608a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(BufferedOutputStream bufferedOutputStream) {
            super(0);
            this.f32608a = bufferedOutputStream;
        }

        public final void a() {
            this.f32608a.flush();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class f extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f32609a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file) {
            super(0);
            this.f32609a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FileOutputStream invoke() {
            return new FileOutputStream(this.f32609a, false);
        }
    }

    static final class g extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f32610a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file) {
            super(0);
            this.f32610a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            File parentFile = this.f32610a.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            return Boolean.valueOf(this.f32610a.createNewFile());
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f32611a;

        /* renamed from: b, reason: collision with root package name */
        Object f32612b;

        /* renamed from: c, reason: collision with root package name */
        Object f32613c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f32614d;

        /* renamed from: e, reason: collision with root package name */
        int f32615e;

        h(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32614d = obj;
            this.f32615e |= Integer.MIN_VALUE;
            return a.f(null, null, null, this);
        }
    }

    public static final Bitmap a(String base64Image) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        try {
            byte[] decode = Base64.decode(base64Image, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                return decodeByteArray;
            }
            throw new RuntimeException("Failed to convert base64 into Bitmap");
        } catch (RuntimeException e10) {
            throw new i(base64Image, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Context context, Uri uri, kotlin.coroutines.d dVar) {
        b bVar;
        int i10;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f32599b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f32599b = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f32598a;
                Object e10 = AbstractC3868b.e();
                i10 = bVar.f32599b;
                if (i10 != 0) {
                    p.b(obj);
                    J b10 = C0874b0.b();
                    c cVar = new c(context, uri);
                    bVar.f32599b = 1;
                    obj = AbstractC0909t0.b(b10, cVar, bVar);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "runInterruptible(...)");
                return obj;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f32598a;
        Object e102 = AbstractC3868b.e();
        i10 = bVar.f32599b;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "runInterruptible(...)");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Context context, String str, File file, kotlin.coroutines.d dVar) {
        d dVar2;
        Object obj;
        Object e10;
        int i10;
        ImageFormat e11;
        String str2;
        Context context2;
        Bitmap bitmap;
        File file2;
        BufferedOutputStream bufferedOutputStream;
        Closeable closeable;
        e eVar;
        File file3;
        Context context3;
        try {
            if (dVar instanceof d) {
                dVar2 = (d) dVar;
                int i11 = dVar2.f32607f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar2.f32607f = i11 - Integer.MIN_VALUE;
                    obj = dVar2.f32606e;
                    e10 = AbstractC3868b.e();
                    i10 = dVar2.f32607f;
                    if (i10 != 0) {
                        p.b(obj);
                        Bitmap a10 = a(str);
                        e11 = e(str);
                        int i12 = C0471a.f32597a[e11.ordinal()];
                        if (i12 == 1) {
                            str2 = "copied_image.png";
                        } else {
                            if (i12 != 2) {
                                throw new lc.m();
                            }
                            str2 = "copied_image.jpeg";
                        }
                        File file4 = new File(file, str2);
                        dVar2.f32602a = context;
                        dVar2.f32603b = a10;
                        dVar2.f32604c = e11;
                        dVar2.f32605d = file4;
                        dVar2.f32607f = 1;
                        if (d(file4, dVar2) == e10) {
                            return e10;
                        }
                        context2 = context;
                        bitmap = a10;
                        file2 = file4;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                closeable = (Closeable) dVar2.f32604c;
                                file3 = (File) dVar2.f32603b;
                                context3 = (Context) dVar2.f32602a;
                                try {
                                    p.b(obj);
                                    Unit unit = Unit.f36324a;
                                    kotlin.io.c.a(closeable, null);
                                    ClipData newUri = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.c(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                                    Intrinsics.checkNotNullExpressionValue(newUri, "newUri(...)");
                                    return newUri;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        kotlin.io.c.a(closeable, th);
                                        throw th2;
                                    }
                                }
                            }
                            file2 = (File) dVar2.f32605d;
                            e11 = (ImageFormat) dVar2.f32604c;
                            bitmap = (Bitmap) dVar2.f32603b;
                            context2 = (Context) dVar2.f32602a;
                            p.b(obj);
                            bufferedOutputStream = new BufferedOutputStream((FileOutputStream) obj);
                            bitmap.compress(e11.getCompressFormat(), 100, bufferedOutputStream);
                            eVar = new e(bufferedOutputStream);
                            dVar2.f32602a = context2;
                            dVar2.f32603b = file2;
                            dVar2.f32604c = bufferedOutputStream;
                            dVar2.f32605d = null;
                            dVar2.f32607f = 3;
                            if (AbstractC0909t0.c(null, eVar, dVar2, 1, null) == e10) {
                                return e10;
                            }
                            file3 = file2;
                            context3 = context2;
                            closeable = bufferedOutputStream;
                            Unit unit2 = Unit.f36324a;
                            kotlin.io.c.a(closeable, null);
                            ClipData newUri2 = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.c(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                            Intrinsics.checkNotNullExpressionValue(newUri2, "newUri(...)");
                            return newUri2;
                        }
                        file2 = (File) dVar2.f32605d;
                        e11 = (ImageFormat) dVar2.f32604c;
                        bitmap = (Bitmap) dVar2.f32603b;
                        context2 = (Context) dVar2.f32602a;
                        p.b(obj);
                    }
                    f fVar = new f(file2);
                    dVar2.f32602a = context2;
                    dVar2.f32603b = bitmap;
                    dVar2.f32604c = e11;
                    dVar2.f32605d = file2;
                    dVar2.f32607f = 2;
                    obj = AbstractC0909t0.c(null, fVar, dVar2, 1, null);
                    if (obj == e10) {
                        return e10;
                    }
                    bufferedOutputStream = new BufferedOutputStream((FileOutputStream) obj);
                    bitmap.compress(e11.getCompressFormat(), 100, bufferedOutputStream);
                    eVar = new e(bufferedOutputStream);
                    dVar2.f32602a = context2;
                    dVar2.f32603b = file2;
                    dVar2.f32604c = bufferedOutputStream;
                    dVar2.f32605d = null;
                    dVar2.f32607f = 3;
                    if (AbstractC0909t0.c(null, eVar, dVar2, 1, null) == e10) {
                    }
                }
            }
            bitmap.compress(e11.getCompressFormat(), 100, bufferedOutputStream);
            eVar = new e(bufferedOutputStream);
            dVar2.f32602a = context2;
            dVar2.f32603b = file2;
            dVar2.f32604c = bufferedOutputStream;
            dVar2.f32605d = null;
            dVar2.f32607f = 3;
            if (AbstractC0909t0.c(null, eVar, dVar2, 1, null) == e10) {
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = bufferedOutputStream;
            throw th;
        }
        dVar2 = new d(dVar);
        obj = dVar2.f32606e;
        e10 = AbstractC3868b.e();
        i10 = dVar2.f32607f;
        if (i10 != 0) {
        }
        f fVar2 = new f(file2);
        dVar2.f32602a = context2;
        dVar2.f32603b = bitmap;
        dVar2.f32604c = e11;
        dVar2.f32605d = file2;
        dVar2.f32607f = 2;
        obj = AbstractC0909t0.c(null, fVar2, dVar2, 1, null);
        if (obj == e10) {
        }
        bufferedOutputStream = new BufferedOutputStream((FileOutputStream) obj);
    }

    private static final Object d(File file, kotlin.coroutines.d dVar) {
        return AbstractC0909t0.b(C0874b0.b(), new g(file), dVar);
    }

    public static final ImageFormat e(String base64Image) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        String substring = base64Image.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return StringsKt.F(substring, "iVBORw0K", false, 2, null) ? ImageFormat.PNG : StringsKt.F(substring, "/9j/", false, 2, null) ? ImageFormat.JPG : ImageFormat.JPG;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Context context, Uri uri, GetImageOptions getImageOptions, kotlin.coroutines.d dVar) {
        h hVar;
        Object e10;
        int i10;
        ImageFormat imageFormat;
        Bitmap bitmap;
        ByteArrayOutputStream byteArrayOutputStream;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.f32615e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f32615e = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f32614d;
                e10 = AbstractC3868b.e();
                i10 = hVar.f32615e;
                if (i10 != 0) {
                    p.b(obj);
                    hVar.f32611a = getImageOptions;
                    hVar.f32615e = 1;
                    obj = b(context, uri, hVar);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        byteArrayOutputStream = (ByteArrayOutputStream) hVar.f32613c;
                        imageFormat = (ImageFormat) hVar.f32612b;
                        bitmap = (Bitmap) hVar.f32611a;
                        p.b(obj);
                        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        StringBuilder sb2 = new StringBuilder("data:" + imageFormat.getMimeType() + ";base64,");
                        sb2.append(encodeToString);
                        String sb3 = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                        return new za.h(sb3, bitmap.getWidth(), bitmap.getHeight());
                    }
                    getImageOptions = (GetImageOptions) hVar.f32611a;
                    p.b(obj);
                }
                Bitmap bitmap2 = (Bitmap) obj;
                imageFormat = getImageOptions.getImageFormat();
                int jpegQuality = (int) (getImageOptions.getJpegQuality() * 100);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmap2.compress(imageFormat.getCompressFormat(), jpegQuality, byteArrayOutputStream2);
                hVar.f32611a = bitmap2;
                hVar.f32612b = imageFormat;
                hVar.f32613c = byteArrayOutputStream2;
                hVar.f32615e = 2;
                if (X0.a(hVar) != e10) {
                    return e10;
                }
                bitmap = bitmap2;
                byteArrayOutputStream = byteArrayOutputStream2;
                String encodeToString2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                StringBuilder sb22 = new StringBuilder("data:" + imageFormat.getMimeType() + ";base64,");
                sb22.append(encodeToString2);
                String sb32 = sb22.toString();
                Intrinsics.checkNotNullExpressionValue(sb32, "toString(...)");
                return new za.h(sb32, bitmap.getWidth(), bitmap.getHeight());
            }
        }
        hVar = new h(dVar);
        Object obj2 = hVar.f32614d;
        e10 = AbstractC3868b.e();
        i10 = hVar.f32615e;
        if (i10 != 0) {
        }
        Bitmap bitmap22 = (Bitmap) obj2;
        imageFormat = getImageOptions.getImageFormat();
        int jpegQuality2 = (int) (getImageOptions.getJpegQuality() * 100);
        ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
        bitmap22.compress(imageFormat.getCompressFormat(), jpegQuality2, byteArrayOutputStream22);
        hVar.f32611a = bitmap22;
        hVar.f32612b = imageFormat;
        hVar.f32613c = byteArrayOutputStream22;
        hVar.f32615e = 2;
        if (X0.a(hVar) != e10) {
        }
    }
}
