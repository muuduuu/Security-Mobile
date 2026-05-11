package co.hyperverge.hyperlogger.data.source.local;

import Jd.N;
import android.util.Log;
import co.hyperverge.hyperlogger.utils.HyperLoggerExtsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile$appendData$2", f = "HyperLoggerFile.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJd/N;", "Llc/o;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)Llc/o;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HyperLoggerFile$appendData$2 extends l implements Function2<N, d<? super o>, Object> {
    final /* synthetic */ String $hyperLogEvent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HyperLoggerFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperLoggerFile$appendData$2(HyperLoggerFile hyperLoggerFile, String str, d<? super HyperLoggerFile$appendData$2> dVar) {
        super(2, dVar);
        this.this$0 = hyperLoggerFile;
        this.$hyperLogEvent = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HyperLoggerFile$appendData$2 hyperLoggerFile$appendData$2 = new HyperLoggerFile$appendData$2(this.this$0, this.$hyperLogEvent, dVar);
        hyperLoggerFile$appendData$2.L$0 = obj;
        return hyperLoggerFile$appendData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super o> dVar) {
        return ((HyperLoggerFile$appendData$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        String str;
        String str2;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        HyperLoggerFile hyperLoggerFile = this.this$0;
        String str3 = this.$hyperLogEvent;
        try {
            o.a aVar = o.f37128b;
            str2 = hyperLoggerFile.logEventsFilePath;
            if (str2 == null) {
                Intrinsics.v("logEventsFilePath");
                str2 = null;
            }
            HyperLoggerExtsKt.appendLog(new File(str2), str3);
            b10 = o.b(Unit.f36324a);
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            str = HyperLoggerFile.TAG;
            Log.e(str, Intrinsics.m("addLog failed: ", d10.getMessage()));
        }
        return o.a(b10);
    }
}
