package co.hyperverge.hyperlogger.data.source.local;

import Jd.N;
import android.util.Log;
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

@f(c = "co.hyperverge.hyperlogger.data.source.local.HyperLoggerFile$deleteLogFolder$2", f = "HyperLoggerFile.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)Z"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class HyperLoggerFile$deleteLogFolder$2 extends l implements Function2<N, d<? super Boolean>, Object> {
    final /* synthetic */ File $folderToDelete;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperLoggerFile$deleteLogFolder$2(File file, d<? super HyperLoggerFile$deleteLogFolder$2> dVar) {
        super(2, dVar);
        this.$folderToDelete = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HyperLoggerFile$deleteLogFolder$2 hyperLoggerFile$deleteLogFolder$2 = new HyperLoggerFile$deleteLogFolder$2(this.$folderToDelete, dVar);
        hyperLoggerFile$deleteLogFolder$2.L$0 = obj;
        return hyperLoggerFile$deleteLogFolder$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Boolean> dVar) {
        return ((HyperLoggerFile$deleteLogFolder$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object b10;
        String str2;
        String str3;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        str = HyperLoggerFile.TAG;
        Log.d(str, "deleteLogFolder() called");
        File file = this.$folderToDelete;
        try {
            o.a aVar = o.f37128b;
        } catch (Throwable th) {
            o.a aVar2 = o.f37128b;
            b10 = o.b(p.a(th));
        }
        if (!file.exists()) {
            str3 = HyperLoggerFile.TAG;
            Log.d(str3, "Log folder doesn't exist");
            return b.a(false);
        }
        if (!file.isDirectory()) {
            return b.a(false);
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
        b10 = o.b(b.a(file.delete()));
        Throwable d10 = o.d(b10);
        if (d10 == null) {
            return o.f(b10) ? b.a(false) : b10;
        }
        str2 = HyperLoggerFile.TAG;
        Log.e(str2, Intrinsics.m("deleteLogFolder() onFailure() called with ", d10));
        return b.a(false);
    }
}
