package T1;

import O1.AbstractC1031b;
import U1.c;
import U1.i;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import b2.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f9142d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1031b f9143e;

    /* renamed from: a, reason: collision with root package name */
    private final i f9139a = new i();

    /* renamed from: b, reason: collision with root package name */
    private final Map f9140b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f9141c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private String f9144f = ".ttf";

    public a(Drawable.Callback callback, AbstractC1031b abstractC1031b) {
        this.f9143e = abstractC1031b;
        if (callback instanceof View) {
            this.f9142d = ((View) callback).getContext().getAssets();
        } else {
            f.c("LottieDrawable must be inside of a view for images to work.");
            this.f9142d = null;
        }
    }

    private Typeface a(c cVar) {
        Typeface typeface;
        String a10 = cVar.a();
        Typeface typeface2 = (Typeface) this.f9141c.get(a10);
        if (typeface2 != null) {
            return typeface2;
        }
        String c10 = cVar.c();
        String b10 = cVar.b();
        AbstractC1031b abstractC1031b = this.f9143e;
        if (abstractC1031b != null) {
            typeface = abstractC1031b.b(a10, c10, b10);
            if (typeface == null) {
                typeface = this.f9143e.a(a10);
            }
        } else {
            typeface = null;
        }
        AbstractC1031b abstractC1031b2 = this.f9143e;
        if (abstractC1031b2 != null && typeface == null) {
            String d10 = abstractC1031b2.d(a10, c10, b10);
            if (d10 == null) {
                d10 = this.f9143e.c(a10);
            }
            if (d10 != null) {
                typeface = Typeface.createFromAsset(this.f9142d, d10);
            }
        }
        if (cVar.d() != null) {
            return cVar.d();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f9142d, "fonts/" + a10 + this.f9144f);
        }
        this.f9141c.put(a10, typeface);
        return typeface;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f9139a.b(cVar.a(), cVar.c());
        Typeface typeface = (Typeface) this.f9140b.get(this.f9139a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e10 = e(a(cVar), cVar.c());
        this.f9140b.put(this.f9139a, e10);
        return e10;
    }

    public void c(String str) {
        this.f9144f = str;
    }

    public void d(AbstractC1031b abstractC1031b) {
        this.f9143e = abstractC1031b;
    }
}
