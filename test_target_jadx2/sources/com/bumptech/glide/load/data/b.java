package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final String f20311a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f20312b;

    /* renamed from: c, reason: collision with root package name */
    private Object f20313c;

    public b(AssetManager assetManager, String str) {
        this.f20312b = assetManager;
        this.f20311a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f20313c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract Object d(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object d10 = d(this.f20312b, this.f20311a);
            this.f20313c = d10;
            aVar.d(d10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }
}
