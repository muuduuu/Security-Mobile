package o8;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes2.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f37996a = new i() { // from class: o8.h
        @Override // o8.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
