package r5;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* renamed from: r5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4019g implements InterfaceC4020h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39252a;

    /* renamed from: b, reason: collision with root package name */
    private final C4013a f39253b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39254c;

    public C4019g(Context context, C4013a c4013a) {
        this.f39252a = context;
        this.f39253b = c4013a;
        this.f39254c = c4013a.c();
    }

    private boolean b() {
        String c10 = c();
        return new File(c10).exists() && this.f39253b.a(c10);
    }

    private String c() {
        return this.f39252a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            Object[] objArr = eArr[i10];
            if (objArr instanceof w) {
                eArr[i10] = ((w) objArr).b(this.f39252a);
            }
        }
    }

    @Override // r5.InterfaceC4020h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        }
        if (this.f39254c == this.f39253b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
