package ed;

import fd.AbstractC3165a;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* renamed from: ed.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3121a extends AbstractC3165a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0470a f32551g = new C0470a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final C3121a f32552h = new C3121a(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    public static final C3121a f32553i = new C3121a(new int[0]);

    /* renamed from: ed.a$a, reason: collision with other inner class name */
    public static final class C0470a {
        public /* synthetic */ C0470a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3121a a(InputStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(CollectionsKt.u(intRange, 10));
            Iterator it = intRange.iterator();
            while (it.hasNext()) {
                ((D) it).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] N02 = CollectionsKt.N0(arrayList);
            return new C3121a(Arrays.copyOf(N02, N02.length));
        }

        private C0470a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3121a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    public boolean h() {
        return f(f32552h);
    }
}
