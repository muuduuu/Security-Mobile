package cb;

import Ea.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k2.j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb.InterfaceC3618a;

/* renamed from: cb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1747a implements d, InterfaceC3618a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19433a;

    /* renamed from: cb.a$a, reason: collision with other inner class name */
    public static final class C0346a implements InterfaceC3618a.InterfaceC0551a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FutureC1748b f19434a;

        C0346a(FutureC1748b futureC1748b) {
            this.f19434a = futureC1748b;
        }

        @Override // lb.InterfaceC3618a.InterfaceC0551a
        public void onFailure(Throwable th) {
            this.f19434a.c(new ExecutionException(th));
        }

        @Override // lb.InterfaceC3618a.InterfaceC0551a
        public void onSuccess(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f19434a.b(bitmap);
        }
    }

    public C1747a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19433a = context;
    }

    private final String d(String str) {
        if (!StringsKt.F(str, "asset:///", false, 2, null)) {
            return str;
        }
        return "file:///android_asset/" + CollectionsKt.n0(StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null));
    }

    @Override // lb.InterfaceC3618a
    public void a(String url, InterfaceC3618a.InterfaceC0551a resultListener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        ((k) ((k) c.v(this.f19433a).f().k(j.f36073b)).h0(true)).C0(d(url)).v0(new b(resultListener));
    }

    @Override // lb.InterfaceC3618a
    public Future b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        FutureC1748b futureC1748b = new FutureC1748b();
        a(url, new C0346a(futureC1748b));
        return futureC1748b;
    }

    @Override // Ea.d
    public List e() {
        return CollectionsKt.e(InterfaceC3618a.class);
    }

    /* renamed from: cb.a$b */
    public static final class b extends A2.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3618a.InterfaceC0551a f19435d;

        b(InterfaceC3618a.InterfaceC0551a interfaceC0551a) {
            this.f19435d = interfaceC0551a;
        }

        @Override // A2.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void n(Bitmap resource, B2.b bVar) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f19435d.onSuccess(resource);
        }

        @Override // A2.a, A2.d
        public void i(Drawable drawable) {
            super.i(drawable);
            this.f19435d.onFailure(new Exception("Loading bitmap failed"));
        }

        @Override // A2.d
        public void m(Drawable drawable) {
        }
    }
}
