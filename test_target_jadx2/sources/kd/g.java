package kd;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;

/* loaded from: classes3.dex */
public interface g {

    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    a a();

    b b(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2, InterfaceC0933e interfaceC0933e);
}
