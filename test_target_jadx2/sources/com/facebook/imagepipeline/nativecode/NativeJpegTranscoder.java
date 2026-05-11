package com.facebook.imagepipeline.nativecode;

import a4.f;
import a4.g;
import android.graphics.ColorSpace;
import b3.AbstractC1647b;
import b3.l;
import g4.i;
import java.io.InputStream;
import java.io.OutputStream;
import o4.C3748a;
import o4.C3749b;
import o4.C3752e;
import o4.InterfaceC3750c;

/* loaded from: classes.dex */
public class NativeJpegTranscoder implements InterfaceC3750c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f20722a;

    /* renamed from: b, reason: collision with root package name */
    private int f20723b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20724c;

    public NativeJpegTranscoder(boolean z10, int i10, boolean z11, boolean z12) {
        this.f20722a = z10;
        this.f20723b = i10;
        this.f20724c = z11;
        if (z12) {
            d.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        d.a();
        l.b(Boolean.valueOf(i11 >= 1));
        l.b(Boolean.valueOf(i11 <= 16));
        l.b(Boolean.valueOf(i12 >= 0));
        l.b(Boolean.valueOf(i12 <= 100));
        l.b(Boolean.valueOf(C3752e.j(i10)));
        l.c((i11 == 8 && i10 == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) l.g(inputStream), (OutputStream) l.g(outputStream), i10, i11, i12);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        d.a();
        l.b(Boolean.valueOf(i11 >= 1));
        l.b(Boolean.valueOf(i11 <= 16));
        l.b(Boolean.valueOf(i12 >= 0));
        l.b(Boolean.valueOf(i12 <= 100));
        l.b(Boolean.valueOf(C3752e.i(i10)));
        l.c((i11 == 8 && i10 == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) l.g(inputStream), (OutputStream) l.g(outputStream), i10, i11, i12);
    }

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    @Override // o4.InterfaceC3750c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // o4.InterfaceC3750c
    public C3749b b(i iVar, OutputStream outputStream, g gVar, f fVar, S3.c cVar, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (gVar == null) {
            gVar = g.c();
        }
        int b10 = C3748a.b(gVar, fVar, iVar, this.f20723b);
        try {
            int f10 = C3752e.f(gVar, fVar, iVar, this.f20722a);
            int a10 = C3752e.a(b10);
            if (this.f20724c) {
                f10 = a10;
            }
            InputStream l10 = iVar.l();
            if (C3752e.f37924b.contains(Integer.valueOf(iVar.c2()))) {
                f((InputStream) l.h(l10, "Cannot transcode from null input stream!"), outputStream, C3752e.d(gVar, iVar), f10, num.intValue());
            } else {
                e((InputStream) l.h(l10, "Cannot transcode from null input stream!"), outputStream, C3752e.e(gVar, iVar), f10, num.intValue());
            }
            AbstractC1647b.b(l10);
            return new C3749b(b10 != 1 ? 0 : 1);
        } catch (Throwable th) {
            AbstractC1647b.b(null);
            throw th;
        }
    }

    @Override // o4.InterfaceC3750c
    public boolean c(i iVar, g gVar, f fVar) {
        if (gVar == null) {
            gVar = g.c();
        }
        return C3752e.f(gVar, fVar, iVar, this.f20722a) < 8;
    }

    @Override // o4.InterfaceC3750c
    public boolean d(S3.c cVar) {
        return cVar == S3.b.f8722b;
    }
}
