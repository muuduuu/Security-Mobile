package wa;

import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f {
    private static final byte[] a(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final byte[] b(n.a[] aVarArr) {
        Intrinsics.checkNotNullParameter(aVarArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (n.a aVar : aVarArr) {
            ByteBuffer m10 = aVar.m();
            Intrinsics.checkNotNullExpressionValue(m10, "getBuffer(...)");
            arrayList.addAll(AbstractC3574i.g0(a(m10)));
        }
        return CollectionsKt.I0(arrayList);
    }
}
