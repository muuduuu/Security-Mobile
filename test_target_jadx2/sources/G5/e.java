package G5;

import T5.k;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final k f2933a;

    /* renamed from: b, reason: collision with root package name */
    protected final HashMap f2934b;

    public e() {
        this(2000);
    }

    public e(int i10) {
        this.f2934b = new HashMap(8);
        this.f2933a = new k(Math.min(64, i10 >> 2), i10);
    }
}
