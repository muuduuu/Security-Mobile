package Ya;

import A2.d;
import Ta.k;
import ab.C1372c;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.request.g;
import expo.modules.image.records.ImageErrorEvent;
import expo.modules.image.records.ImageLoadEvent;
import expo.modules.image.records.ImageSource;
import i2.EnumC3313a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k2.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f12166a;

    public a(WeakReference expoImageViewWrapper) {
        Intrinsics.checkNotNullParameter(expoImageViewWrapper, "expoImageViewWrapper");
        this.f12166a = expoImageViewWrapper;
    }

    @Override // com.bumptech.glide.request.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean f(Drawable resource, Object model, d target, EnumC3313a dataSource, boolean z10) {
        Ib.b onLoad$expo_image_release;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        boolean z11 = resource instanceof C1372c;
        C1372c c1372c = z11 ? (C1372c) resource : null;
        int b10 = c1372c != null ? c1372c.b() : resource.getIntrinsicWidth();
        C1372c c1372c2 = z11 ? (C1372c) resource : null;
        int a10 = c1372c2 != null ? c1372c2.a() : resource.getIntrinsicHeight();
        k kVar = (k) this.f12166a.get();
        if (kVar == null || (onLoad$expo_image_release = kVar.getOnLoad$expo_image_release()) == null) {
            return false;
        }
        String name = Xa.a.Companion.a(dataSource).name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        onLoad$expo_image_release.invoke(new ImageLoadEvent(lowerCase, new ImageSource(model.toString(), b10, a10, null, resource instanceof Animatable)));
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public boolean g(q qVar, Object obj, d target, boolean z10) {
        String str;
        Ib.b onError$expo_image_release;
        String message;
        Intrinsics.checkNotNullParameter(target, "target");
        if (qVar == null || (message = qVar.getMessage()) == null || (str = StringsKt.p0(message, "\n call GlideException#logRootCauses(String) for more detail")) == null) {
            str = "Unknown error";
        }
        k kVar = (k) this.f12166a.get();
        if (kVar != null && (onError$expo_image_release = kVar.getOnError$expo_image_release()) != null) {
            onError$expo_image_release.invoke(new ImageErrorEvent(str));
        }
        Log.e("ExpoImage", str);
        if (qVar == null) {
            return false;
        }
        qVar.g("ExpoImage");
        return false;
    }
}
