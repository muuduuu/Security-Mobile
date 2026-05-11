package Ld;

import Jd.InterfaceC0895m;
import Od.D;
import Od.G;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.functions.Function2;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final m f5781a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f5782b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f5783c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f5784d;

    /* renamed from: e, reason: collision with root package name */
    private static final D f5785e;

    /* renamed from: f, reason: collision with root package name */
    private static final D f5786f;

    /* renamed from: g, reason: collision with root package name */
    private static final D f5787g;

    /* renamed from: h, reason: collision with root package name */
    private static final D f5788h;

    /* renamed from: i, reason: collision with root package name */
    private static final D f5789i;

    /* renamed from: j, reason: collision with root package name */
    private static final D f5790j;

    /* renamed from: k, reason: collision with root package name */
    private static final D f5791k;

    /* renamed from: l, reason: collision with root package name */
    private static final D f5792l;

    /* renamed from: m, reason: collision with root package name */
    private static final D f5793m;

    /* renamed from: n, reason: collision with root package name */
    private static final D f5794n;

    /* renamed from: o, reason: collision with root package name */
    private static final D f5795o;

    /* renamed from: p, reason: collision with root package name */
    private static final D f5796p;

    /* renamed from: q, reason: collision with root package name */
    private static final D f5797q;

    /* renamed from: r, reason: collision with root package name */
    private static final D f5798r;

    /* renamed from: s, reason: collision with root package name */
    private static final D f5799s;

    /* synthetic */ class a extends xc.j implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f5800j = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m I(long j10, m mVar) {
            return f.x(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return I(((Number) obj).longValue(), (m) obj2);
        }
    }

    static {
        int e10;
        int e11;
        e10 = G.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f5782b = e10;
        e11 = G.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ModuleDescriptor.MODULE_VERSION, 0, 0, 12, null);
        f5783c = e11;
        f5784d = new D("BUFFERED");
        f5785e = new D("SHOULD_BUFFER");
        f5786f = new D("S_RESUMING_BY_RCV");
        f5787g = new D("RESUMING_BY_EB");
        f5788h = new D("POISONED");
        f5789i = new D("DONE_RCV");
        f5790j = new D("INTERRUPTED_SEND");
        f5791k = new D("INTERRUPTED_RCV");
        f5792l = new D("CHANNEL_CLOSED");
        f5793m = new D("SUSPEND");
        f5794n = new D("SUSPEND_NO_WAITER");
        f5795o = new D("FAILED");
        f5796p = new D("NO_RECEIVE_RESULT");
        f5797q = new D("CLOSE_HANDLER_CLOSED");
        f5798r = new D("CLOSE_HANDLER_INVOKED");
        f5799s = new D("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC0895m interfaceC0895m, Object obj, InterfaceC5068n interfaceC5068n) {
        Object o10 = interfaceC0895m.o(obj, null, interfaceC5068n);
        if (o10 == null) {
            return false;
        }
        interfaceC0895m.G(o10);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC0895m interfaceC0895m, Object obj, InterfaceC5068n interfaceC5068n, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC5068n = null;
        }
        return B(interfaceC0895m, obj, interfaceC5068n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m x(long j10, m mVar) {
        return new m(j10, mVar, mVar.y(), 0);
    }

    public static final kotlin.reflect.g y() {
        return a.f5800j;
    }

    public static final D z() {
        return f5792l;
    }
}
