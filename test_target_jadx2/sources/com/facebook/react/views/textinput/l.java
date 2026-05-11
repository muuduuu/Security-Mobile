package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
class l extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    private C1992j f22965a;

    /* renamed from: b, reason: collision with root package name */
    private EventDispatcher f22966b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22967c;

    /* renamed from: d, reason: collision with root package name */
    private String f22968d;

    public l(InputConnection inputConnection, ReactContext reactContext, C1992j c1992j, EventDispatcher eventDispatcher) {
        super(inputConnection, false);
        this.f22968d = null;
        this.f22966b = eventDispatcher;
        this.f22965a = c1992j;
    }

    private void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f22966b.c(new q(this.f22965a.getId(), str));
    }

    private void b(String str) {
        if (this.f22967c) {
            this.f22968d = str;
        } else {
            a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f22967c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals(BuildConfig.FLAVOR)) {
                charSequence2 = "Backspace";
            }
            b(charSequence2);
        }
        return super.commitText(charSequence, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        a("Backspace");
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f22967c = false;
        String str = this.f22968d;
        if (str != null) {
            a(str);
            this.f22968d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z10 = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                a("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                a("Enter");
            } else if (z10) {
                a(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        int selectionStart = this.f22965a.getSelectionStart();
        int selectionEnd = this.f22965a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i10);
        int selectionStart2 = this.f22965a.getSelectionStart();
        b((selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.f22965a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
