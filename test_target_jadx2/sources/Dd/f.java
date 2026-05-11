package Dd;

import Kc.InterfaceC0952y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface f {

    public static final class a {
        public static String a(f fVar, InterfaceC0952y functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            if (fVar.a(functionDescriptor)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    boolean a(InterfaceC0952y interfaceC0952y);

    String b(InterfaceC0952y interfaceC0952y);

    String getDescription();
}
