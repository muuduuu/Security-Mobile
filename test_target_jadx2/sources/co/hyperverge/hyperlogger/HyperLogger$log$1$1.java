package co.hyperverge.hyperlogger;

import Jd.N;
import co.hyperverge.hyperlogger.data.models.HyperLoggerConfig;
import co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hyperlogger.HyperLogger$log$1$1", f = "HyperLogger.kt", l = {62, 63}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HyperLogger$log$1$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ String $log;
    final /* synthetic */ HyperLogger $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperLogger$log$1$1(HyperLogger hyperLogger, String str, d<? super HyperLogger$log$1$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = hyperLogger;
        this.$log = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HyperLogger$log$1$1(this.$this_runCatching, this.$log, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HyperLogger$log$1$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        HyperLoggerConfig hyperLoggerConfig;
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            z10 = this.$this_runCatching.isHyperLoggerInitialised;
            if (z10) {
                HyperLoggerFile companion = HyperLoggerFile.INSTANCE.getInstance();
                hyperLoggerConfig = this.$this_runCatching.hyperLoggerConfig;
                if (hyperLoggerConfig == null) {
                    Intrinsics.v("hyperLoggerConfig");
                    hyperLoggerConfig = null;
                }
                this.label = 1;
                obj = companion.isFileExists$hyperlogger_release(hyperLoggerConfig, this);
                if (obj == e10) {
                    return e10;
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
        } else if (i10 == 1) {
            p.b(obj);
            if (((Boolean) obj).booleanValue()) {
                HyperLoggerFile companion2 = HyperLoggerFile.INSTANCE.getInstance();
                String str = this.$log;
                this.label = 2;
                if (companion2.appendData$hyperlogger_release(str, this) == e10) {
                    return e10;
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
        }
        return Unit.f36324a;
    }
}
