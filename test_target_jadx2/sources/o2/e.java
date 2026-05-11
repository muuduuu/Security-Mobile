package O2;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7006a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static b f7007b;

    /* renamed from: c, reason: collision with root package name */
    private static d f7008c;

    private e() {
    }

    public final void a(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (f7007b == null || f7008c == null) {
            ChuckerDatabase a10 = ChuckerDatabase.INSTANCE.a(applicationContext);
            f7007b = new a(a10);
            f7008c = new c(a10);
        }
    }

    public final d b() {
        d dVar = f7008c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("You can't access the throwable repository if you don't initialize it!");
    }

    public final b c() {
        b bVar = f7007b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!");
    }
}
