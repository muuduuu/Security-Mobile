package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f20335a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f20336b;

    /* renamed from: c, reason: collision with root package name */
    private Object f20337c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f20336b = contentResolver;
        this.f20335a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f20337c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract Object d(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object d10 = d(this.f20335a, this.f20336b);
            this.f20337c = d10;
            aVar.d(d10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }
}
