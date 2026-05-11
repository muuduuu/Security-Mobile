package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import b3.AbstractC1646a;
import b3.AbstractC1647b;
import b3.l;
import b3.q;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import e3.h;
import e3.j;
import f3.AbstractC3142a;
import h3.C3228a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import k3.AbstractC3540c;
import k3.InterfaceC3539b;

/* loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d, reason: collision with root package name */
    private static Method f20732d;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3539b f20733c = AbstractC3540c.i();

    private static MemoryFile h(AbstractC3142a abstractC3142a, int i10, byte[] bArr) {
        OutputStream outputStream;
        C3228a c3228a;
        j jVar;
        j jVar2 = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i10);
        memoryFile.allowPurging(false);
        try {
            jVar = new j((h) abstractC3142a.p());
            try {
                c3228a = new C3228a(jVar, i10);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                c3228a = null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
            c3228a = null;
        }
        try {
            outputStream2 = memoryFile.getOutputStream();
            AbstractC1646a.a(c3228a, outputStream2);
            if (bArr != null) {
                memoryFile.writeBytes(bArr, 0, i10, bArr.length);
            }
            AbstractC3142a.n(abstractC3142a);
            AbstractC1647b.b(jVar);
            AbstractC1647b.b(c3228a);
            AbstractC1647b.a(outputStream2, true);
            return memoryFile;
        } catch (Throwable th3) {
            th = th3;
            outputStream = outputStream2;
            jVar2 = jVar;
            AbstractC3142a.n(abstractC3142a);
            AbstractC1647b.b(jVar2);
            AbstractC1647b.b(c3228a);
            AbstractC1647b.a(outputStream, true);
            throw th;
        }
    }

    private Bitmap i(AbstractC3142a abstractC3142a, int i10, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile h10;
        MemoryFile memoryFile = null;
        try {
            try {
                h10 = h(abstractC3142a, i10, bArr);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            FileDescriptor k10 = k(h10);
            InterfaceC3539b interfaceC3539b = this.f20733c;
            if (interfaceC3539b == null) {
                throw new IllegalStateException("WebpBitmapFactory is null");
            }
            Bitmap bitmap = (Bitmap) l.h(interfaceC3539b.a(k10, null, options), "BitmapFactory returned null");
            if (h10 != null) {
                h10.close();
            }
            return bitmap;
        } catch (IOException e11) {
            e = e11;
            memoryFile = h10;
            throw q.a(e);
        } catch (Throwable th2) {
            th = th2;
            memoryFile = h10;
            if (memoryFile != null) {
                memoryFile.close();
            }
            throw th;
        }
    }

    private synchronized Method j() {
        if (f20732d == null) {
            try {
                f20732d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e10) {
                throw q.a(e10);
            }
        }
        return f20732d;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) l.g(j().invoke(memoryFile, null));
        } catch (Exception e10) {
            throw q.a(e10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(AbstractC3142a abstractC3142a, BitmapFactory.Options options) {
        return i(abstractC3142a, ((h) abstractC3142a.p()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(AbstractC3142a abstractC3142a, int i10, BitmapFactory.Options options) {
        return i(abstractC3142a, i10, DalvikPurgeableDecoder.e(abstractC3142a, i10) ? null : DalvikPurgeableDecoder.f20720b, options);
    }
}
