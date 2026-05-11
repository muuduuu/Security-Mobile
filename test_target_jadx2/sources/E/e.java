package E;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1811a;

    public e() {
        this(false);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f1811a ? signum * (-1) : signum;
    }

    public e(boolean z10) {
        this.f1811a = z10;
    }
}
