package o2;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import o2.n;

/* loaded from: classes.dex */
public class v implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f37901a;

    public v(n nVar) {
        this.f37901a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(String str, int i10, int i11, i2.h hVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f37901a.a(e10)) {
            return null;
        }
        return this.f37901a.b(e10, i10, i11, hVar);
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }

    public static final class a implements o {
        @Override // o2.o
        public n e(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // o2.o
        public void d() {
        }
    }

    public static class b implements o {
        @Override // o2.o
        public n e(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // o2.o
        public void d() {
        }
    }

    public static class c implements o {
        @Override // o2.o
        public n e(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }

        @Override // o2.o
        public void d() {
        }
    }
}
