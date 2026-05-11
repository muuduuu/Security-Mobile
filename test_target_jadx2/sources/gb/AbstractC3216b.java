package gb;

import android.os.Bundle;
import androidx.core.os.c;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.G;

/* renamed from: gb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3216b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle b(Map map) {
        Pair[] pairArr = (Pair[]) G.x(map).toArray(new Pair[0]);
        return c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
