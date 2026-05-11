package com.bumptech.glide.integration.avif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.i;
import g2.b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y2.AbstractC5165b;

/* loaded from: classes.dex */
public final class AvifGlideModule extends AbstractC5165b {
    @Override // y2.AbstractC5165b
    public void a(Context context, c cVar, i iVar) {
        b bVar = new b(cVar.g());
        iVar.o(ByteBuffer.class, Bitmap.class, bVar);
        iVar.o(InputStream.class, Bitmap.class, new g2.c(iVar.g(), bVar, cVar.f()));
    }
}
