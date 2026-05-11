package o2;

import android.content.res.AssetManager;
import android.net.Uri;
import o2.n;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3742a implements n {

    /* renamed from: c, reason: collision with root package name */
    private static final int f37806c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f37807a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0577a f37808b;

    /* renamed from: o2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0577a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public C3742a(AssetManager assetManager, InterfaceC0577a interfaceC0577a) {
        this.f37807a = assetManager;
        this.f37808b = interfaceC0577a;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(uri), this.f37808b.a(this.f37807a, uri.toString().substring(f37806c)));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* renamed from: o2.a$b */
    public static class b implements o, InterfaceC0577a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f37809a;

        public b(AssetManager assetManager) {
            this.f37809a = assetManager;
        }

        @Override // o2.C3742a.InterfaceC0577a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // o2.o
        public n e(r rVar) {
            return new C3742a(this.f37809a, this);
        }

        @Override // o2.o
        public void d() {
        }
    }

    /* renamed from: o2.a$c */
    public static class c implements o, InterfaceC0577a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f37810a;

        public c(AssetManager assetManager) {
            this.f37810a = assetManager;
        }

        @Override // o2.C3742a.InterfaceC0577a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // o2.o
        public n e(r rVar) {
            return new C3742a(this.f37810a, this);
        }

        @Override // o2.o
        public void d() {
        }
    }
}
