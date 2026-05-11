package com.webengage.sdk.android;

import android.text.Layout;
import android.text.style.AlignmentSpan;

/* loaded from: classes2.dex */
public class y implements AlignmentSpan {
    @Override // android.text.style.AlignmentSpan
    public Layout.Alignment getAlignment() {
        return Layout.Alignment.ALIGN_CENTER;
    }
}
