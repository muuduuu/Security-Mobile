package Kd;

import Jd.G0;
import Od.r;
import android.os.Looper;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements r {
    @Override // Od.r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // Od.r
    public G0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // Od.r
    public int c() {
        return 1073741823;
    }
}
