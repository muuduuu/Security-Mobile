package Ga;

import android.util.Log;
import java.io.PrintStream;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2990a;

    public f(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f2990a = category;
    }

    @Override // Ga.a
    public void a(c type, String message, Throwable th) {
        boolean z10;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        z10 = g.f2991a;
        if (z10) {
            int a10 = c.Companion.a(type);
            if (a10 == 3) {
                Log.d(this.f2990a, message, th);
                return;
            }
            if (a10 == 4) {
                Log.i(this.f2990a, message, th);
                return;
            }
            if (a10 == 5) {
                Log.w(this.f2990a, message, th);
                return;
            } else if (a10 == 6) {
                Log.e(this.f2990a, message, th);
                return;
            } else {
                if (a10 != 7) {
                    return;
                }
                Log.e(this.f2990a, message, th);
                return;
            }
        }
        String str = "[" + type.getType() + "] " + this.f2990a + "\t" + message;
        PrintStream printStream = System.out;
        printStream.println((Object) str);
        if (th != null) {
            printStream.println((Object) (e.a(th) + "\n" + AbstractC3622a.b(th)));
        }
    }
}
