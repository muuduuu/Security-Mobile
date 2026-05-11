package z7;

import S6.a;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g f45777a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0172a f45778b;

    /* renamed from: c, reason: collision with root package name */
    private static final S6.a f45779c;

    /* renamed from: d, reason: collision with root package name */
    private static final i f45780d;

    /* JADX WARN: Type inference failed for: r0v1, types: [u7.d, z7.i] */
    static {
        a.g gVar = new a.g();
        f45777a = gVar;
        h hVar = new h();
        f45778b = hVar;
        f45779c = new S6.a("Phenotype.API", hVar, gVar);
        f45780d = new u7.d();
    }

    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
