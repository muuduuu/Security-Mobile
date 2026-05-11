package com.github.penfeizhou.animation.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.i;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y2.AbstractC5165b;

/* loaded from: classes2.dex */
public class GlideAnimationModule extends AbstractC5165b {
    @Override // y2.AbstractC5165b
    public void a(Context context, c cVar, i iVar) {
        super.a(context, cVar, iVar);
        m6.b bVar = new m6.b();
        iVar.o(InputStream.class, com.github.penfeizhou.animation.decode.b.class, new m6.c(bVar));
        iVar.o(ByteBuffer.class, com.github.penfeizhou.animation.decode.b.class, bVar);
        iVar.t(com.github.penfeizhou.animation.decode.b.class, Drawable.class, new b());
        iVar.t(com.github.penfeizhou.animation.decode.b.class, Bitmap.class, new a(cVar.g()));
    }
}
