package co.hyperverge.hyperlogger.data.source.local;

import Jd.N;
import android.util.Log;
import co.hyperverge.hyperlogger.data.models.HyperLoggerConfig;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile$createFile$2", f = "HyperLoggerFile.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)Z"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HyperLoggerFile$createFile$2 extends l implements Function2<N, d<? super Boolean>, Object> {
    final /* synthetic */ HyperLoggerConfig $config;
    final /* synthetic */ File $logEventsFolder;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HyperLoggerFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperLoggerFile$createFile$2(HyperLoggerFile hyperLoggerFile, HyperLoggerConfig hyperLoggerConfig, File file, d<? super HyperLoggerFile$createFile$2> dVar) {
        super(2, dVar);
        this.this$0 = hyperLoggerFile;
        this.$config = hyperLoggerConfig;
        this.$logEventsFolder = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HyperLoggerFile$createFile$2 hyperLoggerFile$createFile$2 = new HyperLoggerFile$createFile$2(this.this$0, this.$config, this.$logEventsFolder, dVar);
        hyperLoggerFile$createFile$2.L$0 = obj;
        return hyperLoggerFile$createFile$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Boolean> dVar) {
        return ((HyperLoggerFile$createFile$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object b10;
        String message;
        String str2;
        String str3;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        str = HyperLoggerFile.TAG;
        Log.d(str, "createFile() called");
        this.this$0.hyperLoggerConfig = this.$config;
        this.this$0.logEventsFolder = this.$logEventsFolder;
        File file = this.$logEventsFolder;
        HyperLoggerConfig hyperLoggerConfig = this.$config;
        HyperLoggerFile hyperLoggerFile = this.this$0;
        try {
            o.a aVar = o.f37128b;
            File file2 = new File(file, Intrinsics.m(hyperLoggerConfig.getFileName(), ".txt"));
            if (!file.exists() && !file.mkdirs()) {
                str3 = HyperLoggerFile.TAG;
                Log.e(str3, Intrinsics.m("getOrCreateSyncFile: ", new IOException("Sync dir: " + ((Object) file.getPath()) + " could not be created")));
                throw new IOException("Sync dir: " + ((Object) file.getPath()) + " could not be created");
            }
            String path = file2.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "logEventsFile.path");
            hyperLoggerFile.logEventsFilePath = path;
            b10 = o.b(b.a(file2.createNewFile()));
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null && (message = d10.getMessage()) != null) {
            str2 = HyperLoggerFile.TAG;
            Log.e(str2, Intrinsics.m("createFile: ", message));
        }
        return o.f(b10) ? b.a(false) : b10;
    }
}
