package r5;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4014b implements InterfaceC4020h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39244a;

    /* renamed from: b, reason: collision with root package name */
    private final C4013a f39245b;

    public C4014b(Context context, C4013a c4013a) {
        this.f39244a = context;
        this.f39245b = c4013a;
    }

    @Override // r5.InterfaceC4020h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str = this.f39244a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Base apk does not exist: ");
        sb2.append(str);
        sb2.append(". ");
        this.f39245b.b(sb2);
        throw new v(sb2.toString(), unsatisfiedLinkError);
    }
}
