package N8;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.i;

/* loaded from: classes2.dex */
public class b implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C3766c c3766c, InterfaceC3767d interfaceC3767d) {
        try {
            c.b(str);
            return c3766c.h().a(interfaceC3767d);
        } finally {
            c.a();
        }
    }

    @Override // o8.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C3766c c3766c : componentRegistrar.getComponents()) {
            final String i10 = c3766c.i();
            if (i10 != null) {
                c3766c = c3766c.t(new g() { // from class: N8.a
                    @Override // o8.g
                    public final Object a(InterfaceC3767d interfaceC3767d) {
                        Object c10;
                        c10 = b.c(i10, c3766c, interfaceC3767d);
                        return c10;
                    }
                });
            }
            arrayList.add(c3766c);
        }
        return arrayList;
    }
}
