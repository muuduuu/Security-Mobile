package co.hyperverge.hypersnapsdk.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.AbstractC1480b;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PermissionManager {
    private static final String TAG = "co.hyperverge.hypersnapsdk.utils.PermissionManager";
    private Activity activity;

    public class StatusArray {
        public ArrayList<String> denied;
        public ArrayList<String> granted;

        StatusArray(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.denied = arrayList2;
            this.granted = arrayList;
        }
    }

    private void showDialogOK(Activity activity, String str, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(activity).setMessage(str).setPositiveButton("OK", onClickListener).setNegativeButton("Cancel", onClickListener).create().show();
    }

    public boolean checkAndRequestPermissions(Activity activity) {
        this.activity = activity;
        List<String> permission = setPermission();
        ArrayList arrayList = new ArrayList();
        for (String str : permission) {
            if (androidx.core.content.a.a(activity.getApplicationContext(), str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        if (arrayList.contains("android.permission.CAMERA") && SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(activity.getApplicationContext()).logCameraPermissionsRequested();
        }
        AbstractC1480b.v(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 1212);
        return false;
    }

    public void checkResult(int i10, String[] strArr, int[] iArr) {
        int i11;
        if (i10 != 1212) {
            return;
        }
        List<String> permission = setPermission();
        HashMap hashMap = new HashMap();
        Iterator<String> it = permission.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                hashMap.put(it.next(), 0);
            }
        }
        if (iArr.length > 0) {
            for (i11 = 0; i11 < strArr.length; i11++) {
                hashMap.put(strArr[i11], Integer.valueOf(iArr[i11]));
            }
            Iterator<String> it2 = permission.iterator();
            while (it2.hasNext()) {
                if (((Integer) hashMap.get(it2.next())).intValue() == -1) {
                    Iterator<String> it3 = permission.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC1480b.y(this.activity, it3.next())) {
                            ifCancelledAndCanRequest(this.activity);
                            return;
                        }
                    }
                    ifCancelledAndCannotRequest(this.activity);
                    return;
                }
            }
        }
    }

    public StatusArray getStatus(Activity activity, List<String> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : list) {
            if (androidx.core.content.a.a(activity.getApplicationContext(), str) == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        return new StatusArray(arrayList, arrayList2);
    }

    public void ifCancelledAndCanRequest(final Activity activity) {
        showDialogOK(activity, "Permission required for this app, please grant permission for the same", new DialogInterface.OnClickListener() { // from class: co.hyperverge.hypersnapsdk.utils.PermissionManager.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (i10 != -1) {
                    return;
                }
                PermissionManager.this.checkAndRequestPermissions(activity);
            }
        });
    }

    public void ifCancelledAndCannotRequest(Activity activity) {
        Toast.makeText(activity.getApplicationContext(), "Go to settings and enable permissions", 1).show();
    }

    public List<String> setPermission() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : this.activity.getApplicationContext().getPackageManager().getPackageInfo(this.activity.getApplicationContext().getPackageName(), 4096).requestedPermissions) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        return arrayList;
    }

    public List<String> setPermissions(List<String> list) {
        return list;
    }

    public boolean checkAndRequestPermissions(Activity activity, List<String> list) {
        return checkAndRequestPermissions(activity, list, true);
    }

    public boolean checkAndRequestPermissions(Activity activity, List<String> list, boolean z10) {
        this.activity = activity;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (androidx.core.content.a.a(activity.getApplicationContext(), str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        if (arrayList.contains("android.permission.CAMERA") && SDKInternalConfig.getInstance().isShouldLogAnalyticsForThisUser()) {
            SDKInternalConfig.getInstance().getAnalyticsTrackerService(activity.getApplicationContext()).logCameraPermissionsRequested();
        }
        if (!z10) {
            return false;
        }
        AbstractC1480b.v(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 1212);
        return false;
    }
}
