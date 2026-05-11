package co.hyperverge.hyperlogger;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.InterfaceC0915w0;
import Jd.N;
import Jd.O;
import android.util.Log;
import co.hyperverge.hyperlogger.data.models.HyperLoggerConfig;
import co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import xc.C5142C;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lco/hyperverge/hyperlogger/HyperLogger;", org.conscrypt.BuildConfig.FLAVOR, "<init>", "()V", "Ljava/io/File;", "rootFolderPath", "Lco/hyperverge/hyperlogger/data/models/HyperLoggerConfig;", HVRetakeActivity.CONFIG_TAG, org.conscrypt.BuildConfig.FLAVOR, "setup", "(Ljava/io/File;Lco/hyperverge/hyperlogger/data/models/HyperLoggerConfig;)V", "Lco/hyperverge/hyperlogger/HyperLogger$Level;", "level", org.conscrypt.BuildConfig.FLAVOR, "message", "log", "(Lco/hyperverge/hyperlogger/HyperLogger$Level;Ljava/lang/String;)V", "getCurrentLogZipFile", "()Ljava/io/File;", org.conscrypt.BuildConfig.FLAVOR, "isHyperLoggerInitialised", "()Z", "flush", "deleteLogFolder", "(Ljava/io/File;)V", "Z", "hyperLoggerConfig", "Lco/hyperverge/hyperlogger/data/models/HyperLoggerConfig;", "LJd/N;", "scope", "LJd/N;", "Companion", "Level", "hyperlogger_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HyperLogger {
    private static HyperLogger INSTANCE = null;
    private static final String logFolderPath = "hv/logData/";
    private HyperLoggerConfig hyperLoggerConfig;
    private boolean isHyperLoggerInitialised;
    private final N scope;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C5142C.b(HyperLogger.class).e();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lco/hyperverge/hyperlogger/HyperLogger$Companion;", org.conscrypt.BuildConfig.FLAVOR, "()V", "INSTANCE", "Lco/hyperverge/hyperlogger/HyperLogger;", "TAG", org.conscrypt.BuildConfig.FLAVOR, "logFolderPath", "getInstance", "hyperlogger_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HyperLogger getInstance() {
            HyperLogger hyperLogger = HyperLogger.INSTANCE;
            if (hyperLogger != null) {
                return hyperLogger;
            }
            HyperLogger hyperLogger2 = new HyperLogger(null);
            HyperLogger.INSTANCE = hyperLogger2;
            return hyperLogger2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lco/hyperverge/hyperlogger/HyperLogger$Level;", org.conscrypt.BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "DEBUG", "ERROR", "hyperlogger_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Level {
        DEBUG,
        ERROR
    }

    public /* synthetic */ HyperLogger(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final HyperLogger getInstance() {
        return INSTANCE.getInstance();
    }

    public final void deleteLogFolder(File rootFolderPath) {
        Object b10;
        InterfaceC0915w0 d10;
        Intrinsics.checkNotNullParameter(rootFolderPath, "rootFolderPath");
        Log.d(TAG, "deleteLogFolder() called");
        try {
            o.a aVar = o.f37128b;
            d10 = AbstractC0891k.d(this.scope, C0874b0.b(), null, new HyperLogger$deleteLogFolder$1$1(rootFolderPath, null), 2, null);
            b10 = o.b(d10);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d11 = o.d(b10);
        if (d11 != null) {
            if (!(d11 instanceof InternalError)) {
                throw d11;
            }
            Log.w(TAG, d11.getMessage(), d11);
        }
    }

    public final void flush() {
        String str = TAG;
        Log.d(str, "flush() called");
        if (this.isHyperLoggerInitialised) {
            this.isHyperLoggerInitialised = false;
        } else {
            Log.d(str, "HyperLogger not initialised. Call HyperLogger.setup function to initialise");
        }
    }

    public final File getCurrentLogZipFile() {
        if (this.isHyperLoggerInitialised) {
            return HyperLoggerFile.INSTANCE.getInstance().createLogZipFile$hyperlogger_release();
        }
        return null;
    }

    /* renamed from: isHyperLoggerInitialised, reason: from getter */
    public final boolean getIsHyperLoggerInitialised() {
        return this.isHyperLoggerInitialised;
    }

    public final void log(Level level, String message) {
        Object b10;
        InterfaceC0915w0 d10;
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = System.currentTimeMillis() + ";;;" + level + ";;;" + message + '\n';
        try {
            o.a aVar = o.f37128b;
            d10 = AbstractC0891k.d(this.scope, C0874b0.b(), null, new HyperLogger$log$1$1(this, str, null), 2, null);
            b10 = o.b(d10);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d11 = o.d(b10);
        if (d11 != null) {
            if (!(d11 instanceof InternalError)) {
                throw d11;
            }
            Log.w(TAG, d11.getMessage(), d11);
        }
    }

    public final void setup(File rootFolderPath, HyperLoggerConfig config) {
        Object b10;
        InterfaceC0915w0 d10;
        Intrinsics.checkNotNullParameter(rootFolderPath, "rootFolderPath");
        Intrinsics.checkNotNullParameter(config, "config");
        Log.d(TAG, Intrinsics.m("setup() called with: config = ", config));
        this.hyperLoggerConfig = config;
        try {
            o.a aVar = o.f37128b;
            d10 = AbstractC0891k.d(this.scope, C0874b0.b(), null, new HyperLogger$setup$1$1(rootFolderPath, config, this, null), 2, null);
            b10 = o.b(d10);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d11 = o.d(b10);
        if (d11 != null) {
            if (!(d11 instanceof InternalError)) {
                throw d11;
            }
            Log.w(TAG, d11.getMessage(), d11);
        }
    }

    private HyperLogger() {
        this.scope = O.b();
    }
}
