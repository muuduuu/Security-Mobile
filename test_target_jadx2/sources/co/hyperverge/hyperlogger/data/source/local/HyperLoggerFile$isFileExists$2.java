package co.hyperverge.hyperlogger.data.source.local;

import Jd.N;
import android.util.Log;
import co.hyperverge.hyperlogger.data.models.HyperLoggerConfig;
import java.io.File;
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

@f(c = "co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile$isFileExists$2", f = "HyperLoggerFile.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)Z"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HyperLoggerFile$isFileExists$2 extends l implements Function2<N, d<? super Boolean>, Object> {
    final /* synthetic */ HyperLoggerConfig $config;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HyperLoggerFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperLoggerFile$isFileExists$2(HyperLoggerFile hyperLoggerFile, HyperLoggerConfig hyperLoggerConfig, d<? super HyperLoggerFile$isFileExists$2> dVar) {
        super(2, dVar);
        this.this$0 = hyperLoggerFile;
        this.$config = hyperLoggerConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HyperLoggerFile$isFileExists$2 hyperLoggerFile$isFileExists$2 = new HyperLoggerFile$isFileExists$2(this.this$0, this.$config, dVar);
        hyperLoggerFile$isFileExists$2.L$0 = obj;
        return hyperLoggerFile$isFileExists$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Boolean> dVar) {
        return ((HyperLoggerFile$isFileExists$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        String str;
        File file;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        HyperLoggerFile hyperLoggerFile = this.this$0;
        HyperLoggerConfig hyperLoggerConfig = this.$config;
        try {
            o.a aVar = o.f37128b;
            file = hyperLoggerFile.logEventsFolder;
            if (file == null) {
                Intrinsics.v("logEventsFolder");
                file = null;
            }
            b10 = o.b(b.a(new File(file, Intrinsics.m(hyperLoggerConfig.getFileName(), ".txt")).exists()));
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            str = HyperLoggerFile.TAG;
            Log.e(str, Intrinsics.m("isFileExists: ", d10.getMessage()));
        }
        return o.f(b10) ? b.a(false) : b10;
    }
}
