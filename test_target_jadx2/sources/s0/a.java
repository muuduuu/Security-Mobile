package S0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f8659a;

    /* renamed from: b, reason: collision with root package name */
    private int f8660b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private int f8661c = 0;

    /* renamed from: S0.a$a, reason: collision with other inner class name */
    private static class C0168a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f8662a;

        /* renamed from: b, reason: collision with root package name */
        private final g f8663b;

        C0168a(EditText editText, boolean z10) {
            this.f8662a = editText;
            g gVar = new g(editText, z10);
            this.f8663b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(S0.b.getInstance());
        }

        @Override // S0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // S0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f8662a, inputConnection, editorInfo);
        }

        @Override // S0.a.b
        void c(boolean z10) {
            this.f8663b.c(z10);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        y0.f.h(editText, "editText cannot be null");
        this.f8659a = new C0168a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f8659a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f8659a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f8659a.c(z10);
    }
}
