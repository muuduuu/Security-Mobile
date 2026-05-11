package expo.modules.systemui;

import Ea.g;
import Wb.c;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/systemui/SystemUIPackage;", "LEa/g;", "<init>", "()V", "Landroid/content/Context;", "activityContext", BuildConfig.FLAVOR, "LEa/i;", "b", "(Landroid/content/Context;)Ljava/util/List;", "expo-system-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemUIPackage implements g {
    @Override // Ea.g
    public List b(Context activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        return CollectionsKt.e(new c());
    }
}
