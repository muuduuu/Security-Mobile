package expo.modules.fetch;

import Td.C;
import Td.D;
import Td.F;
import Td.G;
import Td.w;
import Td.x;
import Td.z;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.InterfaceC3879g;
import pe.M;

/* loaded from: classes2.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final C0473a f32660b = new C0473a(null);

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f32661a;

    /* renamed from: expo.modules.fetch.a$a, reason: collision with other inner class name */
    public static final class C0473a {
        public /* synthetic */ C0473a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URL a(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (!Intrinsics.b(url.getProtocol(), "file")) {
                return url;
            }
            return new URL("http://filesystem.local" + url.getPath());
        }

        private C0473a() {
        }
    }

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32661a = new WeakReference(context);
    }

    private final F b(D d10) {
        return new F.a().r(d10).o(C.HTTP_1_1).e(404).l("File not found").b(G.f9918b.c("File not found", z.f10239e.a("text/plain"))).c();
    }

    private final z c(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName == null) {
            guessContentTypeFromName = "application/octet-stream";
        }
        z.a aVar = z.f10239e;
        z b10 = aVar.b(guessContentTypeFromName);
        return b10 == null ? aVar.a("application/octet-stream") : b10;
    }

    private final String d(w wVar) {
        return StringsKt.B(wVar.toString(), "http://filesystem.local", "file://", false, 4, null);
    }

    public final G a(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        InputStream open = context.getAssets().open(fileName);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        return G.b.f(G.f9918b, M.c(M.k(open)), c(fileName), 0L, 2, null);
    }

    @Override // Td.x
    public F intercept(x.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        D t10 = chain.t();
        String d10 = d(t10.n());
        if (!StringsKt.F(d10, "file://", false, 2, null)) {
            return chain.a(t10);
        }
        if (StringsKt.F(d10, "file:///android_asset/", false, 2, null)) {
            String o02 = StringsKt.o0(d10, "file:///android_asset/");
            Context context = (Context) this.f32661a.get();
            if (context == null) {
                throw new Na.b();
            }
            try {
                return new F.a().r(t10).o(C.HTTP_1_1).e(200).l("OK").b(a(context, o02)).c();
            } catch (IOException unused) {
                return b(t10);
            }
        }
        String substring = d10.substring(7);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        File file = new File(substring);
        if (!file.exists()) {
            return b(t10);
        }
        G.b bVar = G.f9918b;
        InterfaceC3879g c10 = M.c(M.j(file));
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new F.a().r(t10).o(C.HTTP_1_1).e(200).l("OK").b(bVar.d(c10, c(name), file.length())).c();
    }
}
