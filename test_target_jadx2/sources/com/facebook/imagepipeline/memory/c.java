package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import b3.l;
import j4.C3492F;
import j4.G;
import j4.i;

/* loaded from: classes.dex */
public class c extends a implements i {
    public c(e3.d dVar, C3492F c3492f, G g10, boolean z10) {
        super(dVar, c3492f, g10, z10);
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Bitmap h(int i10) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void l(Bitmap bitmap) {
        l.g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int p(Bitmap bitmap) {
        l.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Bitmap r(b bVar) {
        Bitmap bitmap = (Bitmap) super.r(bVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean v(Bitmap bitmap) {
        l.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int q(int i10) {
        return i10;
    }
}
