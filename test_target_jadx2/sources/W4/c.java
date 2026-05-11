package W4;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f11356a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f11357b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final Executor f11358c = new a();

    private static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            command.run();
        }
    }

    private static final class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            UiThreadUtil.runOnUiThread(command);
        }
    }

    private c() {
    }
}
