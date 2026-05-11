package o2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import o2.n;

/* loaded from: classes.dex */
public final class t implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37896a;

    /* renamed from: b, reason: collision with root package name */
    private final n f37897b;

    t(Context context, n nVar) {
        this.f37896a = context.getApplicationContext();
        this.f37897b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i10, int i11, i2.h hVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f37897b.b(Integer.valueOf(parseInt), i10, i11, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i10, int i11, i2.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f37896a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f37896a.getPackageName());
        if (identifier != 0) {
            return this.f37897b.b(Integer.valueOf(identifier), i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f37896a.getPackageName().equals(uri.getAuthority());
    }

    private static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f37898a;

        a(Context context) {
            this.f37898a = context;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new t(this.f37898a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // o2.o
        public void d() {
        }
    }

    private static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f37899a;

        b(Context context) {
            this.f37899a = context;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new t(this.f37899a, rVar.d(Integer.class, InputStream.class));
        }

        @Override // o2.o
        public void d() {
        }
    }
}
