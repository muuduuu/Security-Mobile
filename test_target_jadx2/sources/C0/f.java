package C0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f738a;

    private interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f738a = new a(uri, clipDescription, uri2);
        } else {
            this.f738a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f738a.a();
    }

    public ClipDescription b() {
        return this.f738a.getDescription();
    }

    public Uri c() {
        return this.f738a.c();
    }

    public void d() {
        this.f738a.b();
    }

    public Object e() {
        return this.f738a.d();
    }

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f739a;

        a(Object obj) {
            this.f739a = (InputContentInfo) obj;
        }

        @Override // C0.f.c
        public Uri a() {
            return this.f739a.getContentUri();
        }

        @Override // C0.f.c
        public void b() {
            this.f739a.requestPermission();
        }

        @Override // C0.f.c
        public Uri c() {
            return this.f739a.getLinkUri();
        }

        @Override // C0.f.c
        public Object d() {
            return this.f739a;
        }

        @Override // C0.f.c
        public ClipDescription getDescription() {
            return this.f739a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f739a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f738a = cVar;
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f740a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f741b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f742c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f740a = uri;
            this.f741b = clipDescription;
            this.f742c = uri2;
        }

        @Override // C0.f.c
        public Uri a() {
            return this.f740a;
        }

        @Override // C0.f.c
        public Uri c() {
            return this.f742c;
        }

        @Override // C0.f.c
        public Object d() {
            return null;
        }

        @Override // C0.f.c
        public ClipDescription getDescription() {
            return this.f741b;
        }

        @Override // C0.f.c
        public void b() {
        }
    }
}
