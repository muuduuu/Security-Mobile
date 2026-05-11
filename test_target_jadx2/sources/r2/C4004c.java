package r2;

import android.graphics.Bitmap;
import android.util.Log;
import i2.EnumC3315c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import l2.InterfaceC3600b;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4004c implements i2.k {

    /* renamed from: b, reason: collision with root package name */
    public static final i2.g f39149b = i2.g.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c, reason: collision with root package name */
    public static final i2.g f39150c = i2.g.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3600b f39151a;

    public C4004c(InterfaceC3600b interfaceC3600b) {
        this.f39151a = interfaceC3600b;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, i2.h hVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(f39150c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // i2.k
    public EnumC3315c a(i2.h hVar) {
        return EnumC3315c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #4 {all -> 0x0056, blocks: (B:3:0x0021, B:14:0x0052, B:17:0x0070, B:19:0x0076, B:45:0x00c2, B:43:0x00c5, B:37:0x006b), top: B:2:0x0021 }] */
    @Override // i2.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(k2.v vVar, File file, i2.h hVar) {
        boolean z10;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) vVar.get();
        Bitmap.CompressFormat d10 = d(bitmap, hVar);
        E2.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), d10);
        try {
            long b10 = D2.g.b();
            int intValue = ((Integer) hVar.c(f39149b)).intValue();
            OutputStream outputStream = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e10) {
                e = e10;
            }
            try {
                outputStream = this.f39151a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f39151a) : fileOutputStream;
                bitmap.compress(d10, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
                z10 = true;
            } catch (IOException e11) {
                e = e11;
                outputStream = fileOutputStream;
                if (Log.isLoggable("BitmapEncoder", 3)) {
                    Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                z10 = false;
                if (Log.isLoggable("BitmapEncoder", 2)) {
                }
                return z10;
            } catch (Throwable th2) {
                th = th2;
                outputStream = fileOutputStream;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + d10 + " of size " + D2.l.i(bitmap) + " in " + D2.g.a(b10) + ", options format: " + hVar.c(f39150c) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z10;
        } finally {
            E2.b.e();
        }
    }
}
