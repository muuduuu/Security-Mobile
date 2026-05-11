package o2;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o2.n;

/* loaded from: classes.dex */
public class x implements n {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f37905b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final c f37906a;

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public x(c cVar) {
        this.f37906a = cVar;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(uri), this.f37906a.a(uri));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f37905b.contains(uri.getScheme());
    }

    public static final class a implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f37907a;

        public a(ContentResolver contentResolver) {
            this.f37907a = contentResolver;
        }

        @Override // o2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f37907a, uri);
        }

        @Override // o2.o
        public n e(r rVar) {
            return new x(this);
        }

        @Override // o2.o
        public void d() {
        }
    }

    public static class b implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f37908a;

        public b(ContentResolver contentResolver) {
            this.f37908a = contentResolver;
        }

        @Override // o2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f37908a, uri);
        }

        @Override // o2.o
        public n e(r rVar) {
            return new x(this);
        }

        @Override // o2.o
        public void d() {
        }
    }

    public static class d implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f37909a;

        public d(ContentResolver contentResolver) {
            this.f37909a = contentResolver;
        }

        @Override // o2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f37909a, uri);
        }

        @Override // o2.o
        public n e(r rVar) {
            return new x(this);
        }

        @Override // o2.o
        public void d() {
        }
    }
}
