package co.hyperverge.hyperlogger;

import Jd.N;
import android.util.Log;
import co.hyperverge.hyperlogger.data.models.HyperLoggerConfig;
import co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hyperlogger.HyperLogger$setup$1$1", f = "HyperLogger.kt", l = {30, 32}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HyperLogger$setup$1$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ HyperLoggerConfig $config;
    final /* synthetic */ File $rootFolderPath;
    final /* synthetic */ HyperLogger $this_runCatching;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperLogger$setup$1$1(File file, HyperLoggerConfig hyperLoggerConfig, HyperLogger hyperLogger, d<? super HyperLogger$setup$1$1> dVar) {
        super(2, dVar);
        this.$rootFolderPath = file;
        this.$config = hyperLoggerConfig;
        this.$this_runCatching = hyperLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HyperLogger$setup$1$1(this.$rootFolderPath, this.$config, this.$this_runCatching, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HyperLogger$setup$1$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        boolean booleanValue;
        String str;
        String str2;
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            file = new File(this.$rootFolderPath, "hv/logData/");
            HyperLoggerFile companion = HyperLoggerFile.INSTANCE.getInstance();
            this.L$0 = file;
            this.label = 1;
            if (companion.deleteLogFolder$hyperlogger_release(file, this) == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                str = HyperLogger.TAG;
                Log.d(str, Intrinsics.m("setup file created: ", b.a(booleanValue)));
                if (booleanValue) {
                    str2 = HyperLogger.TAG;
                    Log.d(str2, "Error while creating files and folders");
                } else {
                    this.$this_runCatching.isHyperLoggerInitialised = true;
                }
                return Unit.f36324a;
            }
            file = (File) this.L$0;
            p.b(obj);
        }
        HyperLoggerFile companion2 = HyperLoggerFile.INSTANCE.getInstance();
        HyperLoggerConfig hyperLoggerConfig = this.$config;
        this.L$0 = null;
        this.label = 2;
        obj = companion2.createFile$hyperlogger_release(file, hyperLoggerConfig, this);
        if (obj == e10) {
            return e10;
        }
        booleanValue = ((Boolean) obj).booleanValue();
        str = HyperLogger.TAG;
        Log.d(str, Intrinsics.m("setup file created: ", b.a(booleanValue)));
        if (booleanValue) {
        }
        return Unit.f36324a;
    }
}
