package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.i;
import com.bumptech.glide.integration.okhttp3.a;
import java.io.InputStream;
import o2.h;
import y2.AbstractC5165b;

/* loaded from: classes.dex */
public final class OkHttpLibraryGlideModule extends AbstractC5165b {
    @Override // y2.AbstractC5165b
    public void a(Context context, c cVar, i iVar) {
        iVar.u(h.class, InputStream.class, new a.C0360a());
    }
}
