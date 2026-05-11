package t2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import k2.v;

/* renamed from: t2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4616l implements i2.j {

    /* renamed from: b, reason: collision with root package name */
    public static final i2.g f42290b = i2.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    private final Context f42291a;

    public C4616l(Context context) {
        this.f42291a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f42291a.getPackageName())) {
            return this.f42291a;
        }
        try {
            return this.f42291a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f42291a.getPackageName())) {
                return this.f42291a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(Uri uri, int i10, int i11, i2.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d10 = d(uri, authority);
            int g10 = g(d10, uri);
            Resources.Theme theme = ((String) D2.k.d(authority)).equals(this.f42291a.getPackageName()) ? (Resources.Theme) hVar.c(f42290b) : null;
            return C4615k.c(theme == null ? AbstractC4613i.b(this.f42291a, d10, g10) : AbstractC4613i.a(this.f42291a, g10, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // i2.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, i2.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
