package io.invertase.firebase.app;

import I8.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import o8.C3766c;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        return Collections.singletonList(h.b("react-native-firebase", c.f34331a));
    }
}
