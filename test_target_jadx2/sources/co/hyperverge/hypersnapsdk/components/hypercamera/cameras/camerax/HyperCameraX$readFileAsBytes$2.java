package co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax;

import Jd.N;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.hypersnapsdk.components.hypercamera.cameras.camerax.HyperCameraX$readFileAsBytes$2", f = "HyperCameraX.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)[B"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HyperCameraX$readFileAsBytes$2 extends l implements Function2<N, kotlin.coroutines.d<? super byte[]>, Object> {
    final /* synthetic */ String $filePath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperCameraX$readFileAsBytes$2(String str, kotlin.coroutines.d<? super HyperCameraX$readFileAsBytes$2> dVar) {
        super(2, dVar);
        this.$filePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new HyperCameraX$readFileAsBytes$2(this.$filePath, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, kotlin.coroutines.d<? super byte[]> dVar) {
        return ((HyperCameraX$readFileAsBytes$2) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AbstractC3868b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p.b(obj);
        File file = new File(this.$filePath);
        byte[] bArr = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                kotlin.io.c.a(fileInputStream, null);
            } finally {
            }
        } catch (IOException e10) {
            str = HyperCameraX.TAG;
            HVLogUtils.e(str, Utils.getErrorMessage(e10), e10);
        }
        return bArr;
    }
}
