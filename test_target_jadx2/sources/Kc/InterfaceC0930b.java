package Kc;

import java.util.Collection;

/* renamed from: Kc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0930b extends InterfaceC0929a, C {

    /* renamed from: Kc.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    void F0(Collection collection);

    @Override // Kc.InterfaceC0929a, Kc.InterfaceC0941m
    InterfaceC0930b a();

    @Override // Kc.InterfaceC0929a
    Collection f();

    a o();

    InterfaceC0930b o0(InterfaceC0941m interfaceC0941m, D d10, AbstractC0948u abstractC0948u, a aVar, boolean z10);
}
