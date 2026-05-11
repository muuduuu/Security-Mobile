package com.google.android.material.textfield;

import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C1410l;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class TextInputEditText extends C1410l {

    /* renamed from: g, reason: collision with root package name */
    private final Rect f27535g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27536h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3144q);
    }

    private boolean e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f27536h;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f27535g);
        rect.bottom = this.f27535g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return e(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.O()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.O() && super.getHint() == null && com.google.android.material.internal.g.a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // androidx.appcompat.widget.C1410l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f27535g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f27535g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f27536h = z10;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f27535g = new Rect();
        TypedArray h10 = com.google.android.material.internal.m.h(context, attributeSet, H7.l.f3789w6, i10, H7.k.f3335k, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h10.getBoolean(H7.l.f3798x6, false));
        h10.recycle();
    }
}
