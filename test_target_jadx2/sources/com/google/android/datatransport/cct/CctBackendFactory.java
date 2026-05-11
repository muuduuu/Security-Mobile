package com.google.android.datatransport.cct;

import v6.AbstractC4956h;
import v6.InterfaceC4952d;
import v6.InterfaceC4961m;

/* loaded from: classes2.dex */
public class CctBackendFactory implements InterfaceC4952d {
    @Override // v6.InterfaceC4952d
    public InterfaceC4961m create(AbstractC4956h abstractC4956h) {
        return new d(abstractC4956h.b(), abstractC4956h.e(), abstractC4956h.d());
    }
}
