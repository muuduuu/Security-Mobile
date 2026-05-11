package L9;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.views.textinput.C1992j;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wc.q;
import xc.C5141B;
import xc.m;

/* loaded from: classes2.dex */
public abstract class d {

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f5707a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f5707a = gVar;
        }

        public final void a() {
            this.f5707a.i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final Function0 a(EditText editText, q action) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        g gVar = new g(editText, action);
        gVar.j();
        return new a(gVar);
    }

    public static final TextWatcher b(EditText editText, Function1 action) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        b bVar = new b(new C5141B(), action);
        try {
            Field declaredField = C1992j.class.getDeclaredField("m");
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(editText);
            arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
        } catch (ClassCastException e10) {
            P9.a.d(P9.a.f7630a, editText.getClass().getSimpleName(), "Can not attach listener because casting failed: " + e10.getMessage(), null, 4, null);
        } catch (IllegalArgumentException e11) {
            P9.a.d(P9.a.f7630a, editText.getClass().getSimpleName(), "Can not attach listener to be the first in the list: " + e11.getMessage() + ". Attaching to the end...", null, 4, null);
            editText.addTextChangedListener(bVar);
        } catch (NoSuchFieldException e12) {
            P9.a.d(P9.a.f7630a, editText.getClass().getSimpleName(), "Can not attach listener because field `mListeners` not found: " + e12.getMessage(), null, 4, null);
        }
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof TextWatcher)) {
                    }
                }
            }
            arrayList.add(0, bVar);
            return bVar;
        }
        P9.a.d(P9.a.f7630a, editText.getClass().getSimpleName(), "Can not attach listener because `fieldValue` does not belong to `ArrayList<TextWatcher>`", null, 4, null);
        return bVar;
    }

    public static final void c(EditText editText) {
        if (editText instanceof C1992j) {
            ((C1992j) editText).Q();
        } else if (editText != null) {
            editText.requestFocus();
        }
    }

    public static final String d(EditText editText) {
        if (editText == null) {
            return "default";
        }
        int inputType = editText.getInputType() & 15;
        int inputType2 = editText.getInputType() & 4080;
        return inputType2 == 32 ? "email-address" : inputType2 == 16 ? "url" : inputType2 == 144 ? "visible-password" : inputType == 2 ? ((editText.getInputType() & 8192) == 0 || (editText.getInputType() & 4096) != 0) ? (editText.getInputType() & 4096) != 0 ? "numeric" : "number-pad" : "decimal-pad" : inputType == 3 ? "phone-pad" : "default";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    public static final int e(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        while (editText != null) {
            Object parent = editText.getParent();
            editText = parent instanceof View ? (View) parent : null;
            if (editText instanceof com.facebook.react.views.scroll.c) {
                com.facebook.react.views.scroll.c cVar = (com.facebook.react.views.scroll.c) editText;
                if (cVar.getScrollEnabled()) {
                    return cVar.getId();
                }
            }
        }
        return -1;
    }

    public static final class b implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5141B f5708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f5709b;

        b(C5141B c5141b, Function1 function1) {
            this.f5708a = c5141b;
            this.f5709b = function1;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String valueOf = String.valueOf(charSequence);
            if (Intrinsics.b(valueOf, this.f5708a.f44962a)) {
                return;
            }
            this.f5708a.f44962a = valueOf;
            this.f5709b.invoke(valueOf);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
