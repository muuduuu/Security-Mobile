package com.rssignaturecapture;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.rssignaturecapture.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public class a extends LinearLayout implements View.OnClickListener, b.a {

    /* renamed from: a, reason: collision with root package name */
    LinearLayout f29416a;

    /* renamed from: b, reason: collision with root package name */
    b f29417b;

    /* renamed from: c, reason: collision with root package name */
    Activity f29418c;

    /* renamed from: d, reason: collision with root package name */
    int f29419d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f29420e;

    /* renamed from: f, reason: collision with root package name */
    String f29421f;

    /* renamed from: g, reason: collision with root package name */
    Boolean f29422g;

    /* renamed from: h, reason: collision with root package name */
    Boolean f29423h;

    /* renamed from: i, reason: collision with root package name */
    Boolean f29424i;

    /* renamed from: j, reason: collision with root package name */
    int f29425j;

    public a(Context context, Activity activity) {
        super(context);
        this.f29420e = Boolean.FALSE;
        this.f29421f = "portrait";
        Boolean bool = Boolean.TRUE;
        this.f29422g = bool;
        this.f29423h = bool;
        this.f29424i = bool;
        this.f29425j = 500;
        Log.d("React:", "RSSignatureCaptureMainView(Contructtor)");
        this.f29419d = activity.getRequestedOrientation();
        this.f29418c = activity;
        setOrientation(1);
        this.f29417b = new b(context, this);
        LinearLayout b10 = b();
        this.f29416a = b10;
        addView(b10);
        addView(this.f29417b);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private LinearLayout b() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        Button button = new Button(getContext());
        Button button2 = new Button(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(-1);
        button.setText("Save");
        button.setTag("Save");
        button.setOnClickListener(this);
        button2.setText("Reset");
        button2.setTag("Reset");
        button2.setOnClickListener(this);
        linearLayout.addView(button);
        linearLayout.addView(button2);
        return linearLayout;
    }

    @Override // com.rssignaturecapture.b.a
    public void a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("dragged", true);
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
    }

    public Bitmap c(Bitmap bitmap) {
        int i10;
        int i11;
        Log.d("React Signature", "maxSize:" + this.f29425j);
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        if (width > 1.0f) {
            i10 = this.f29425j;
            i11 = (int) (i10 / width);
        } else {
            int i12 = this.f29425j;
            i10 = (int) (i12 * width);
            i11 = i12;
        }
        return Bitmap.createScaledBitmap(bitmap, i10, i11, true);
    }

    public void d() {
        b bVar = this.f29417b;
        if (bVar != null) {
            bVar.e();
        }
    }

    final void e() {
        File file = new File(Environment.getExternalStorageDirectory().toString() + "/saved_signature");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "signature.png");
        if (file2.exists()) {
            file2.delete();
        }
        try {
            Log.d("React Signature", "Save file-======:" + this.f29420e);
            if (this.f29420e.booleanValue()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                this.f29417b.getSignature().compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            c(this.f29417b.getSignature()).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("pathName", file2.getAbsolutePath());
            createMap.putString("encoded", encodeToString);
            ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public b getSignatureView() {
        return this.f29417b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String trim = view.getTag().toString().trim();
        if (trim.equalsIgnoreCase("save")) {
            e();
        } else if (trim.equalsIgnoreCase("Reset")) {
            this.f29417b.e();
        }
    }

    public void setMaxSize(int i10) {
        this.f29425j = i10;
    }

    public void setSaveFileInExtStorage(Boolean bool) {
        this.f29420e = bool;
    }

    public void setShowNativeButtons(Boolean bool) {
        this.f29423h = bool;
        if (!bool.booleanValue()) {
            this.f29416a.setVisibility(8);
            return;
        }
        Log.d("Added Native Buttons", "Native Buttons:" + bool);
        this.f29416a.setVisibility(0);
    }

    public void setViewMode(String str) {
        this.f29421f = str;
        if (str.equalsIgnoreCase("portrait")) {
            this.f29418c.setRequestedOrientation(1);
        } else if (str.equalsIgnoreCase("landscape")) {
            this.f29418c.setRequestedOrientation(0);
        }
    }
}
