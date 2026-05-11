package o2;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o2.n;

/* loaded from: classes.dex */
public class y implements n {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f37910b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final n f37911a;

    public y(n nVar) {
        this.f37911a = nVar;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        return this.f37911a.b(new h(uri.toString()), i10, i11, hVar);
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f37910b.contains(uri.getScheme());
    }

    public static class a implements o {
        @Override // o2.o
        public n e(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }

        @Override // o2.o
        public void d() {
        }
    }
}
