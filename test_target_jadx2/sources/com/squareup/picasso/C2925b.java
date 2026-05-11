package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import pe.M;

/* renamed from: com.squareup.picasso.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2925b extends z {

    /* renamed from: d, reason: collision with root package name */
    private static final int f29547d = 22;

    /* renamed from: a, reason: collision with root package name */
    private final Context f29548a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f29549b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AssetManager f29550c;

    C2925b(Context context) {
        this.f29548a = context;
    }

    static String j(x xVar) {
        return xVar.f29666d.toString().substring(f29547d);
    }

    @Override // com.squareup.picasso.z
    public boolean c(x xVar) {
        Uri uri = xVar.f29666d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.z
    public z.a f(x xVar, int i10) {
        if (this.f29550c == null) {
            synchronized (this.f29549b) {
                try {
                    if (this.f29550c == null) {
                        this.f29550c = this.f29548a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new z.a(M.k(this.f29550c.open(j(xVar))), u.e.DISK);
    }
}
