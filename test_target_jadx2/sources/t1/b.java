package T1;

import O1.InterfaceC1032c;
import O1.x;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import b2.f;
import b2.l;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f9145d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f9146a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9147b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f9148c;

    public b(Drawable.Callback callback, String str, InterfaceC1032c interfaceC1032c, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f9147b = str;
        } else {
            this.f9147b = str + '/';
        }
        this.f9148c = map;
        d(interfaceC1032c);
        if (callback instanceof View) {
            this.f9146a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f9146a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f9145d) {
            ((x) this.f9148c.get(str)).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        x xVar = (x) this.f9148c.get(str);
        if (xVar == null) {
            return null;
        }
        Bitmap b10 = xVar.b();
        if (b10 != null) {
            return b10;
        }
        Context context = this.f9146a;
        if (context == null) {
            return null;
        }
        String c10 = xVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c10.startsWith("data:") && c10.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                return c(str, l.m(BitmapFactory.decodeByteArray(decode, 0, decode.length, options), xVar.f(), xVar.d()));
            } catch (IllegalArgumentException e10) {
                f.d("data URL did not have correct base64 format.", e10);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f9147b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f9147b + c10), null, options);
                if (decodeStream != null) {
                    return c(str, l.m(decodeStream, xVar.f(), xVar.d()));
                }
                f.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e11) {
                f.d("Unable to decode image `" + str + "`.", e11);
                return null;
            }
        } catch (IOException e12) {
            f.d("Unable to open asset.", e12);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f9146a == null;
        }
        if (this.f9146a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f9146a;
    }

    public void d(InterfaceC1032c interfaceC1032c) {
    }
}
