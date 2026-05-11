package V;

import V.O;
import java.util.concurrent.Executor;
import y0.InterfaceC5159a;

/* renamed from: V.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1248k extends O.j {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC1255s f10644h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f10645i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC5159a f10646j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f10647k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f10648l;

    /* renamed from: m, reason: collision with root package name */
    private final long f10649m;

    C1248k(AbstractC1255s abstractC1255s, Executor executor, InterfaceC5159a interfaceC5159a, boolean z10, boolean z11, long j10) {
        if (abstractC1255s == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f10644h = abstractC1255s;
        this.f10645i = executor;
        this.f10646j = interfaceC5159a;
        this.f10647k = z10;
        this.f10648l = z11;
        this.f10649m = j10;
    }

    public boolean equals(Object obj) {
        Executor executor;
        InterfaceC5159a interfaceC5159a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.j)) {
            return false;
        }
        O.j jVar = (O.j) obj;
        return this.f10644h.equals(jVar.j()) && ((executor = this.f10645i) != null ? executor.equals(jVar.g()) : jVar.g() == null) && ((interfaceC5159a = this.f10646j) != null ? interfaceC5159a.equals(jVar.i()) : jVar.i() == null) && this.f10647k == jVar.o() && this.f10648l == jVar.r() && this.f10649m == jVar.l();
    }

    @Override // V.O.j
    Executor g() {
        return this.f10645i;
    }

    public int hashCode() {
        int hashCode = (this.f10644h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f10645i;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        InterfaceC5159a interfaceC5159a = this.f10646j;
        int hashCode3 = (((hashCode2 ^ (interfaceC5159a != null ? interfaceC5159a.hashCode() : 0)) * 1000003) ^ (this.f10647k ? 1231 : 1237)) * 1000003;
        int i10 = this.f10648l ? 1231 : 1237;
        long j10 = this.f10649m;
        return ((hashCode3 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // V.O.j
    InterfaceC5159a i() {
        return this.f10646j;
    }

    @Override // V.O.j
    AbstractC1255s j() {
        return this.f10644h;
    }

    @Override // V.O.j
    long l() {
        return this.f10649m;
    }

    @Override // V.O.j
    boolean o() {
        return this.f10647k;
    }

    @Override // V.O.j
    boolean r() {
        return this.f10648l;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f10644h + ", getCallbackExecutor=" + this.f10645i + ", getEventListener=" + this.f10646j + ", hasAudioEnabled=" + this.f10647k + ", isPersistent=" + this.f10648l + ", getRecordingId=" + this.f10649m + "}";
    }
}
