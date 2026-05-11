package co.hyperverge.hyperlogger;

import Jd.N;
import co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hyperlogger.HyperLogger$deleteLogFolder$1$1", f = "HyperLogger.kt", l = {122}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HyperLogger$deleteLogFolder$1$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ File $rootFolderPath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperLogger$deleteLogFolder$1$1(File file, d<? super HyperLogger$deleteLogFolder$1$1> dVar) {
        super(2, dVar);
        this.$rootFolderPath = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HyperLogger$deleteLogFolder$1$1(this.$rootFolderPath, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HyperLogger$deleteLogFolder$1$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            File file = new File(this.$rootFolderPath, "hv/logData/");
            HyperLoggerFile companion = HyperLoggerFile.INSTANCE.getInstance();
            this.label = 1;
            if (companion.deleteLogFolder$hyperlogger_release(file, this) == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
        }
        return Unit.f36324a;
    }
}
