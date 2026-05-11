package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.i;
import com.bumptech.glide.integration.okhttp3.a;
import java.io.InputStream;
import o2.h;
import y2.InterfaceC5164a;

@Deprecated
/* loaded from: classes.dex */
public class OkHttpGlideModule implements InterfaceC5164a {
    @Override // y2.InterfaceC5164a
    public void a(Context context, d dVar) {
    }

    @Override // y2.InterfaceC5164a
    public void b(Context context, c cVar, i iVar) {
        iVar.u(h.class, InputStream.class, new a.C0360a());
    }
}
