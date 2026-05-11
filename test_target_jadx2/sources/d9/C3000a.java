package d9;

import D7.AbstractC0789m;
import D7.InterfaceC0786j;
import X8.C1303i;
import Z8.b;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import java.util.List;
import java.util.concurrent.Executor;
import r7.C4096g6;
import r7.C4215s6;
import r7.C4217s8;
import r7.C4235u6;
import r7.C4257w8;
import r7.EnumC4066d6;
import r7.EnumC4086f6;
import r7.H8;

/* renamed from: d9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3000a extends f9.e implements Z8.a {

    /* renamed from: m, reason: collision with root package name */
    private static final Z8.b f31282m = new b.a().a();

    /* renamed from: h, reason: collision with root package name */
    private final boolean f31283h;

    /* renamed from: i, reason: collision with root package name */
    private final Z8.b f31284i;

    /* renamed from: j, reason: collision with root package name */
    final H8 f31285j;

    /* renamed from: k, reason: collision with root package name */
    private int f31286k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f31287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3000a(Z8.b bVar, k kVar, Executor executor, C4217s8 c4217s8, C1303i c1303i) {
        super(kVar, executor);
        bVar.b();
        this.f31284i = bVar;
        boolean f10 = c.f();
        this.f31283h = f10;
        C4215s6 c4215s6 = new C4215s6();
        c4215s6.i(c.c(bVar));
        C4235u6 j10 = c4215s6.j();
        C4096g6 c4096g6 = new C4096g6();
        c4096g6.e(f10 ? EnumC4066d6.TYPE_THICK : EnumC4066d6.TYPE_THIN);
        c4096g6.g(j10);
        c4217s8.d(C4257w8.e(c4096g6, 1), EnumC4086f6.ON_DEVICE_BARCODE_CREATE);
    }

    private final Task j(Task task, final int i10, final int i11) {
        return task.n(new InterfaceC0786j() { // from class: d9.f
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                return C3000a.this.i(i10, i11, (List) obj);
            }
        });
    }

    @Override // Z8.a
    public final Task D(C3102a c3102a) {
        return j(super.c(c3102a), c3102a.m(), c3102a.i());
    }

    @Override // S6.i
    public final C2012d[] a() {
        return this.f31283h ? X8.l.f11798a : new C2012d[]{X8.l.f11799b};
    }

    @Override // f9.e, java.io.Closeable, java.lang.AutoCloseable, Z8.a
    public final synchronized void close() {
        super.close();
    }

    final /* synthetic */ Task i(int i10, int i11, List list) {
        return AbstractC0789m.g(list);
    }
}
