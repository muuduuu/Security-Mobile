package Na;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List f6617a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f6618b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6619c;

    public final void a(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f6619c = true;
        this.f6617a.add(data);
    }

    public final byte[] b() {
        Iterator it = this.f6617a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((byte[]) it.next()).length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        Iterator it2 = this.f6617a.iterator();
        while (it2.hasNext()) {
            allocate.put((byte[]) it2.next());
        }
        this.f6617a.clear();
        this.f6619c = true;
        this.f6618b = true;
        byte[] array = allocate.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    public final boolean c() {
        return this.f6619c;
    }
}
