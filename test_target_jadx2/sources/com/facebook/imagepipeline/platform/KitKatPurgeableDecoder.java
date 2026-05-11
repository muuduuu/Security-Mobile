package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import b3.l;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import e3.h;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c, reason: collision with root package name */
    private final d f20734c;

    public KitKatPurgeableDecoder(d dVar) {
        this.f20734c = dVar;
    }

    private static void h(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(AbstractC3142a abstractC3142a, BitmapFactory.Options options) {
        h hVar = (h) abstractC3142a.p();
        int size = hVar.size();
        AbstractC3142a a10 = this.f20734c.a(size);
        try {
            byte[] bArr = (byte[]) a10.p();
            hVar.E(0, bArr, 0, size);
            return (Bitmap) l.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            AbstractC3142a.n(a10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(AbstractC3142a abstractC3142a, int i10, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(abstractC3142a, i10) ? null : DalvikPurgeableDecoder.f20720b;
        h hVar = (h) abstractC3142a.p();
        l.b(Boolean.valueOf(i10 <= hVar.size()));
        int i11 = i10 + 2;
        AbstractC3142a a10 = this.f20734c.a(i11);
        try {
            byte[] bArr2 = (byte[]) a10.p();
            hVar.E(0, bArr2, 0, i10);
            if (bArr != null) {
                h(bArr2, i10);
                i10 = i11;
            }
            Bitmap bitmap = (Bitmap) l.h(BitmapFactory.decodeByteArray(bArr2, 0, i10, options), "BitmapFactory returned null");
            AbstractC3142a.n(a10);
            return bitmap;
        } catch (Throwable th) {
            AbstractC3142a.n(a10);
            throw th;
        }
    }
}
