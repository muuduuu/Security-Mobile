package co.hyperverge.hyperlogger.data.source.local;

import Jd.O;
import android.util.Log;
import co.hyperverge.hyperlogger.data.models.HyperLoggerConfig;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import xc.C5142C;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lco/hyperverge/hyperlogger/data/source/local/HyperLoggerFile;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/io/File;", "logEventsFolder", "Lco/hyperverge/hyperlogger/data/models/HyperLoggerConfig;", HVRetakeActivity.CONFIG_TAG, BuildConfig.FLAVOR, "createFile$hyperlogger_release", "(Ljava/io/File;Lco/hyperverge/hyperlogger/data/models/HyperLoggerConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "createFile", "isFileExists$hyperlogger_release", "(Lco/hyperverge/hyperlogger/data/models/HyperLoggerConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isFileExists", BuildConfig.FLAVOR, "path", "deleteFile$hyperlogger_release", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteFile", "folderToDelete", "deleteLogFolder$hyperlogger_release", "(Ljava/io/File;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteLogFolder", "hyperLogEvent", BuildConfig.FLAVOR, "appendData$hyperlogger_release", "appendData", "createLogZipFile$hyperlogger_release", "()Ljava/io/File;", "createLogZipFile", "logEventsFilePath", "Ljava/lang/String;", "logZipFile", "Ljava/io/File;", "hyperLoggerConfig", "Lco/hyperverge/hyperlogger/data/models/HyperLoggerConfig;", "Companion", "hyperlogger_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HyperLoggerFile {
    private static HyperLoggerFile INSTANCE;
    private HyperLoggerConfig hyperLoggerConfig;
    private String logEventsFilePath;
    private File logEventsFolder;
    private File logZipFile;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C5142C.b(HyperLoggerFile.class).e();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lco/hyperverge/hyperlogger/data/source/local/HyperLoggerFile$Companion;", BuildConfig.FLAVOR, "()V", "INSTANCE", "Lco/hyperverge/hyperlogger/data/source/local/HyperLoggerFile;", "TAG", BuildConfig.FLAVOR, "getInstance", "hyperlogger_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HyperLoggerFile getInstance() {
            HyperLoggerFile hyperLoggerFile = HyperLoggerFile.INSTANCE;
            if (hyperLoggerFile != null) {
                return hyperLoggerFile;
            }
            HyperLoggerFile hyperLoggerFile2 = new HyperLoggerFile(null);
            HyperLoggerFile.INSTANCE = hyperLoggerFile2;
            return hyperLoggerFile2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HyperLoggerFile(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Object appendData$hyperlogger_release(String str, d<? super Unit> dVar) {
        Object d10 = O.d(new HyperLoggerFile$appendData$2(this, str, null), dVar);
        return d10 == AbstractC3868b.e() ? d10 : Unit.f36324a;
    }

    public final Object createFile$hyperlogger_release(File file, HyperLoggerConfig hyperLoggerConfig, d<? super Boolean> dVar) {
        return O.d(new HyperLoggerFile$createFile$2(this, hyperLoggerConfig, file, null), dVar);
    }

    public final File createLogZipFile$hyperlogger_release() {
        Object b10;
        String str;
        String str2 = TAG;
        Log.d(str2, "createLogZipFile() called");
        try {
            o.a aVar = o.f37128b;
            File file = this.logEventsFolder;
            if (file == null) {
                Intrinsics.v("logEventsFolder");
                file = null;
            }
            HyperLoggerConfig hyperLoggerConfig = this.hyperLoggerConfig;
            if (hyperLoggerConfig == null) {
                Intrinsics.v("hyperLoggerConfig");
                hyperLoggerConfig = null;
            }
            this.logZipFile = new File(file, Intrinsics.m(hyperLoggerConfig.getFileName(), ".gz"));
            str = this.logEventsFilePath;
            if (str == null) {
                Intrinsics.v("logEventsFilePath");
                str = null;
            }
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        if (!new File(str).exists()) {
            String str3 = this.logEventsFilePath;
            if (str3 == null) {
                Intrinsics.v("logEventsFilePath");
                str3 = null;
            }
            Log.e(str2, Intrinsics.m("Log file does not exist at path: ", str3));
            return null;
        }
        String str4 = this.logEventsFilePath;
        if (str4 == null) {
            Intrinsics.v("logEventsFilePath");
            str4 = null;
        }
        FileInputStream fileInputStream = new FileInputStream(str4);
        try {
            File file2 = this.logZipFile;
            FileOutputStream fileOutputStream = new FileOutputStream(file2 == null ? null : file2.getPath());
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        gZIPOutputStream.write(bArr, 0, read);
                    }
                    Unit unit = Unit.f36324a;
                    c.a(gZIPOutputStream, null);
                    c.a(fileOutputStream, null);
                    c.a(fileInputStream, null);
                    b10 = o.b(Unit.f36324a);
                    Throwable d10 = o.d(b10);
                    if (d10 != null) {
                        Log.e(TAG, Intrinsics.m("createLogZipFile: ", d10.getMessage()));
                    }
                    return this.logZipFile;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final Object deleteFile$hyperlogger_release(String str, d<? super Boolean> dVar) {
        return O.d(new HyperLoggerFile$deleteFile$2(str, null), dVar);
    }

    public final Object deleteLogFolder$hyperlogger_release(File file, d<? super Boolean> dVar) {
        return O.d(new HyperLoggerFile$deleteLogFolder$2(file, null), dVar);
    }

    public final Object isFileExists$hyperlogger_release(HyperLoggerConfig hyperLoggerConfig, d<? super Boolean> dVar) {
        return O.d(new HyperLoggerFile$isFileExists$2(this, hyperLoggerConfig, null), dVar);
    }

    private HyperLoggerFile() {
    }
}
