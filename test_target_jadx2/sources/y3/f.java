package Y3;

import android.graphics.Bitmap;
import f3.h;

/* loaded from: classes.dex */
public class f implements h {

    /* renamed from: a, reason: collision with root package name */
    private static f f12007a;

    private f() {
    }

    public static f b() {
        if (f12007a == null) {
            f12007a = new f();
        }
        return f12007a;
    }

    @Override // f3.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
