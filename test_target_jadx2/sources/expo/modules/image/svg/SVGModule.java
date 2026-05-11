package expo.modules.image.svg;

import J2.g;
import ab.C1370a;
import ab.C1371b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.i;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import y2.AbstractC5165b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/image/svg/SVGModule;", "Ly2/b;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/c;", "glide", "Lcom/bumptech/glide/i;", "registry", BuildConfig.FLAVOR, C4870a.f43493a, "(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/i;)V", "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SVGModule extends AbstractC5165b {
    @Override // y2.AbstractC5165b
    public void a(Context context, c glide, i registry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glide, "glide");
        Intrinsics.checkNotNullParameter(registry, "registry");
        super.a(context, glide, registry);
        registry.c(InputStream.class, g.class, new C1370a()).t(g.class, Drawable.class, new C1371b(context));
    }
}
