package Q2;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {
    public static final void c(Context context, N2.a dialogData, final Function0 function0, final Function0 function02) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        new N7.b(context).o(dialogData.d()).h(dialogData.a()).l(dialogData.c(), new DialogInterface.OnClickListener() { // from class: Q2.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g.d(Function0.this, dialogInterface, i10);
            }
        }).i(dialogData.b(), new DialogInterface.OnClickListener() { // from class: Q2.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g.e(Function0.this, dialogInterface, i10);
            }
        }).q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
