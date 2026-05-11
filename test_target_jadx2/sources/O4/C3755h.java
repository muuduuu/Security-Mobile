package o4;

/* renamed from: o4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3755h implements InterfaceC3751d {

    /* renamed from: a, reason: collision with root package name */
    private final int f37934a;

    public C3755h(int i10) {
        this.f37934a = i10;
    }

    @Override // o4.InterfaceC3751d
    public InterfaceC3750c createImageTranscoder(S3.c cVar, boolean z10) {
        return new C3754g(z10, this.f37934a);
    }
}
