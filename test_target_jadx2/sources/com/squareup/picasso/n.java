package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes2.dex */
public final class n implements InterfaceC2927d {

    /* renamed from: a, reason: collision with root package name */
    final LruCache f29604a;

    class a extends LruCache {
        a(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f29607b;
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f29606a;

        /* renamed from: b, reason: collision with root package name */
        final int f29607b;

        b(Bitmap bitmap, int i10) {
            this.f29606a = bitmap;
            this.f29607b = i10;
        }
    }

    public n(Context context) {
        this(G.b(context));
    }

    @Override // com.squareup.picasso.InterfaceC2927d
    public Bitmap a(String str) {
        b bVar = (b) this.f29604a.get(str);
        if (bVar != null) {
            return bVar.f29606a;
        }
        return null;
    }

    @Override // com.squareup.picasso.InterfaceC2927d
    public int b() {
        return this.f29604a.maxSize();
    }

    @Override // com.squareup.picasso.InterfaceC2927d
    public void c(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int i10 = G.i(bitmap);
        if (i10 > b()) {
            this.f29604a.remove(str);
        } else {
            this.f29604a.put(str, new b(bitmap, i10));
        }
    }

    @Override // com.squareup.picasso.InterfaceC2927d
    public int size() {
        return this.f29604a.size();
    }

    public n(int i10) {
        this.f29604a = new a(i10);
    }
}
