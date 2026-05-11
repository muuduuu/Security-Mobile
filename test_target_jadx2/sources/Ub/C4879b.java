package ub;

import android.os.Bundle;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import xb.AbstractC5139a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lub/b;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Lexpo/modules/kotlin/exception/CodedException;", "codedException", BuildConfig.FLAVOR, "i", "(Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ub.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4879b extends AbstractC5139a {
    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoModulesCoreErrorManager");
            bVar.d("ExpoModulesCoreErrorManager.onNewException", "ExpoModulesCoreErrorManager.onNewWarning");
            return bVar.q();
        } finally {
            AbstractC3901a.f();
        }
    }

    public final void i(CodedException codedException) {
        Intrinsics.checkNotNullParameter(codedException, "codedException");
        Bundle bundle = new Bundle();
        String message = codedException.getMessage();
        if (message == null) {
            message = codedException.toString();
        }
        bundle.putString("message", message);
        Unit unit = Unit.f36324a;
        f("ExpoModulesCoreErrorManager.onNewException", bundle);
    }
}
